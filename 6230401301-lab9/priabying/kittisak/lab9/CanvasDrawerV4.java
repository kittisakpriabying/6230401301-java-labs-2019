package priabying.kittisak.lab9;

/**
 * CanvasDrawerV4
 */
public class CanvasDrawerV4 extends CanvasDrawerV3 {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public void run() {
        while (true) {
            if (ball.getX() <= 0 || ball.getX() + Ball.BALL_DIAMETER >= CANVAS_WIDTH) {
                if (ball.getY() + Ball.BALL_DIAMETER / 2.0 <= 150 || ball.getY() + Ball.BALL_DIAMETER / 2.0 >= 350) {
                    int x = ball.getXVelocity();
                    ball.setXVelocity(x * -1);
                }

            } else if (ball.getY() <= 0 || ball.y + Ball.BALL_DIAMETER >= CANVAS_HEIGHT) {
                int y = ball.getYVelocity();
                ball.setYVelocity(y * -1);

            } else if (ball.getX() >= keeperRight.getX() && ball.getY() + (Ball.BALL_DIAMETER / 2) > keeperRight.getY()
                    && ball.getY() + (Ball.BALL_DIAMETER / 2) < keeperRight.getY() + keeperRight.height) {
                ball.setXVelocity(ball.getXVelocity() * (-1));

            } else if (ball.getX() >= keeperLeft.getX() + Keeper.KEEPER_WIDTH
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