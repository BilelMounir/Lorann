package view;

import contract.IElement;

import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/**
 * The Class ViewPanel.
 *
 * @author Jean-Aymeric Diet
 */
class ViewPanel extends JPanel {

	/** The view frame. */
	private ViewFrame viewFrame;
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -998294702363713521L;

    private IElement[][] tileMap;

	/**
	 * Instantiates a new view panel.
	 *
	 * @param viewFrame
	 *          the view frame
	 */
	public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
	}

	/**
	 * Sets the view frame.
	 *
	 * @param viewFrame
	 *          the new view frame
	 */
	private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}

    /**
     * Setup tileMap in ViewPanel
     * @param tileMap
     *
     * @see contract.IController#parser(String)
     */
    public void update(IElement[][] tileMap) {
        this.tileMap = tileMap;
		this.setSize(this.tileMap[0].length, this.tileMap.length);
		this.repaint();
	}

    /**
     * Modified windows size taking border in count and sprite size (32x32)
     *
     * @param width
     * @param height
     */
    public void setSize(int width, int height) {
        super.setSize((width*32) + this.getInsets().left + this.getInsets().right,
                (height*32) + this.getInsets().top + this.getInsets().bottom + 40);
        this.viewFrame.setSize(width*32, height*32 + 40);
    }

	/**
	 * Refresh score using tileMap
	 *
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	@Override
	protected void paintComponent(final Graphics graphics) {
        graphics.setColor(Color.black);
        graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
		graphics.setColor(Color.yellow);
		graphics.setFont(new Font(null, Font.BOLD, 20));

        String[][] scores = null;

        if(this.tileMap != null)
        {
            for (int i = 0; i < this.tileMap.length; i++)
            {
                for(int j = 0; j < this.tileMap[0].length; j++)
                {
                    BufferedImage image = tileMap[i][j].getImage();
                    if(image != null)
                        graphics.drawImage(image, j*32, i*32, null);
                    else if(tileMap[i][j].getClass().getSimpleName().contains("Title")) {
                        graphics.drawString("LORANN", j*32, i*32 + 20);
                    } else if(tileMap[i][j].getClass().getSimpleName().contains("Score")) {
						if (scores == null)
							scores = this.viewFrame.getController().getScores();

                        
                    }
                }
            }
        }
		graphics.drawString(String.format("SCORE : %d    LEVEL : %d",
                this.viewFrame.getController().getScore(),
                this.viewFrame.getController().getLevel()), 10, this.getHeight() - 20);
    }
}
