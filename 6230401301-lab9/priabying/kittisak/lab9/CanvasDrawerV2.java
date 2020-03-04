/**
 * Draw ball on the middle of the frame .
 * Draw keeper on left side and right side.
 * This class extends CanvasDrawerV1 class.
 * 
 * Author: Kittisak Priabying
 * ID: 623040130-1
 * Section: 1
 * Date: March 1, 2020
 */
package priabying.kittisak.lab9;

import java.awt.*;
import priabying.kittisak.lab7.*;

public class CanvasDrawerV2 extends CanvasDrawerV1 {
    
    private static final long serialVersionUID = 1L;
    protected Ball ball;
    protected Keeper keeperLeft;
    protected Keeper keeperRight;

    public CanvasDrawerV2() {
        super();
        this.ball = new Ball(CANVAS_WIDTH/2 - Ball.BALL_DIAMETER/2, CANVAS_HEIGHT/2- Ball.BALL_DIAMETER/2);
        this.keeperLeft = new Keeper(0, CANVAS_HEIGHT / 2 - Keeper.KEEPER_HEIGHT / 2);
        this.keeperRight = new Keeper(CANVAS_WIDTH - Keeper.KEEPER_WIDTH, CANVAS_HEIGHT / 2 - Keeper.KEEPER_HEIGHT / 2);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        // Set color to blue.
        g2d.setColor(Color.BLUE);
        // Draw keeper to left side.
        g2d.fill(this.keeperLeft);
        // Set color to red.
        g2d.setColor(Color.RED);
        // Draw keeper to right side.
        g2d.fill(this.keeperRight);
        // Set color to orange of a ball.
        g2d.setColor(Color.ORANGE);
        // Draw a ball.
        g2d.fill(ball);

    }

}