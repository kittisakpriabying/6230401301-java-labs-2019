package priabying.kittisak.lab9;

import java.awt.geom.Ellipse2D;

public class Ball extends Ellipse2D.Double {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public final static int BALL_DIAMETER = 30;
    private int xVelocity;
    private int yVelocity;

    public Ball(int x, int y) {
        super(x, y, BALL_DIAMETER, BALL_DIAMETER);
        xVelocity = 0;
        yVelocity = 0;
    }

    public Ball(int x, int y, int xVelocity, int yVelocity) {
        super(x, y, BALL_DIAMETER, BALL_DIAMETER);
        this.xVelocity = xVelocity;
        this.yVelocity = yVelocity;
    }

    public int getXVelocity() {
        return xVelocity;
    }

    public void setXVelocity(int xVelocity) {
        this.xVelocity = xVelocity;

    }

    public int getYVelocity() {
        return yVelocity;
    }

    public void setYVelocity(int yVelocity) {
        this.yVelocity = yVelocity;

    }

    public void move() {
        this.x += this.xVelocity;
        this.y += this.yVelocity;
    }

}