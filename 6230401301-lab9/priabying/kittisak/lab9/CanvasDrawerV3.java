package priabying.kittisak.lab9;

import java.util.concurrent.ThreadLocalRandom;

/**
 * CanvasDrawerV3
 */
public class CanvasDrawerV3 extends CanvasDrawerV2 implements Runnable {

    
    private static final long serialVersionUID = 1L;
    protected Thread running;

    public CanvasDrawerV3() {
        super();
        running = new Thread(this);

        int xv = ThreadLocalRandom.current().nextInt(1, 5);
        int yv = ThreadLocalRandom.current().nextInt(1, 5);
        ball.setXVelocity(xv);
        ball.setYVelocity(yv);
        running.start();
    }

    @Override
    public void run() {
        while (true) {
            if (ball.x <= 0 || ball.x + Ball.BALL_DIAMETER >= CANVAS_WIDTH) {
                if (ball.getY() + Ball.BALL_DIAMETER / 2.0 <= 150 || ball.getY() + Ball.BALL_DIAMETER / 2.0 >= 350) {
                    int x = ball.getXVelocity();
                    ball.setXVelocity(x * -1);

                }

            } else if (ball.y <= 0 || ball.y + Ball.BALL_DIAMETER >= CANVAS_HEIGHT) {
                int y = ball.getYVelocity();
                ball.setYVelocity(y * -1);
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