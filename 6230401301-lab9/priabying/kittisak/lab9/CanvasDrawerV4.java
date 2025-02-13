/**
 * 
 * This class extends CanvasDrawerV3 class .
 * 
 * Author: Kittisak Priabying
 * ID: 623040130-1
 * Section: 1
 * Date: March 1, 2020
 */
package priabying.kittisak.lab9;

public class CanvasDrawerV4 extends CanvasDrawerV3 {

    private static final long serialVersionUID = 1L;

    @Override
    public void run() {
        while (true) {
            // Check if the ball hit the right side of the frame.
            if (ball.getX() <= 0 || ball.getX() + Ball.BALL_DIAMETER >= CANVAS_WIDTH) {
                // Check if the ball hit the left side of the wall.
                if (ball.getY() + Ball.BALL_DIAMETER / 2.0 <= 150 || ball.getY() + Ball.BALL_DIAMETER / 2.0 >= 350) {
                    int x = ball.getXVelocity();
                    ball.setXVelocity(x * -1);
                }
                // Check if the ball hit top or botton of the wall.
            } else if (ball.getY() <= 0 || ball.y + Ball.BALL_DIAMETER >= CANVAS_HEIGHT) {
                int y = ball.getYVelocity();
                ball.setYVelocity(y * -1);
                // Check if x of the ball reach the x of the right keeper.
            } else if (ball.getX() + Ball.BALL_DIAMETER >= keeperRight.getX()
                    // Check if the y of the ball + the radius of the ball is greater yhan the y of
                    // the right keeper.
                    && ball.getY() + (Ball.BALL_DIAMETER / 2) > keeperRight.getY()
                    // Check if the y of the ball + the radius of the ball is less than the y of the
                    // right keeper + the height of the right keeper.
                    && ball.getY() + (Ball.BALL_DIAMETER / 2) < keeperRight.getY() + keeperRight.height) {
                ball.setXVelocity(ball.getXVelocity() * (-1));
                // Check if x of the ball reach the x of the left keeper + the keeper width.
            } else if (ball.getX() <= keeperLeft.getX() + Keeper.KEEPER_WIDTH
                    // Check if the y of the ball + the radius of the ball is greater than the y of
                    // the left keeper.
                    && ball.getY() + Ball.BALL_DIAMETER / 2 > keeperLeft.getY()
                    && ball.getY() + Ball.BALL_DIAMETER / 2 < keeperLeft.getY() + Keeper.KEEPER_HEIGHT) {
                ball.setXVelocity(ball.getXVelocity() * (-1));
            }

            ball.move();

            repaint();

            // Delay
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {

            }
        }
    }

}