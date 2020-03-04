/**
 * 
 * This class extends CanvasDrawerV2 class and implement Runnable.
 * 
 * Author: Kittisak Priabying
 * ID: 623040130-1
 * Section: 1
 * Date: March 1, 2020
 */
package priabying.kittisak.lab9;

import java.util.concurrent.ThreadLocalRandom;

public class CanvasDrawerV3 extends CanvasDrawerV2 implements Runnable {

    private static final long serialVersionUID = 1L;
    protected Thread running;
    

    public CanvasDrawerV3() {
        super();
        running = new Thread(this);

        int xv = ThreadLocalRandom.current().nextInt(-2, 2); // Random velocity.
        int yv = ThreadLocalRandom.current().nextInt(-2, 2); // Random velocity.
        ball.setXVelocity(xv);
        ball.setYVelocity(yv);
        running.start();
    }
    // reset location a ball to middle.
    protected void resetBall(){ 
        ball.x = CANVAS_WIDTH / 2 - Ball.BALL_DIAMETER / 2;
        ball.y = CANVAS_HEIGHT / 2 - Ball.BALL_DIAMETER / 2;
        // Ramdom Velocity.
        ball.setXVelocity(ThreadLocalRandom.current().nextInt(-2, 2));
        ball.setYVelocity(ThreadLocalRandom.current().nextInt(-2, 2));
    
    }

    @Override
    public void run() {
        while (true) {
            // Check if the ball hit the right side of the frame.
            if (ball.x <= 0 || ball.x + Ball.BALL_DIAMETER >= CANVAS_WIDTH) {
                // Check if the ball hit the left side of the wall.
                if (ball.getY() + Ball.BALL_DIAMETER / 2.0 <= 150 || ball.getY() + Ball.BALL_DIAMETER / 2.0 >= 350) {
                    int x = ball.getXVelocity();
                    ball.setXVelocity(x * -1);

                }
            // Check if the ball hit top or botton of the wall.
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