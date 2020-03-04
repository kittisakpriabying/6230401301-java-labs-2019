package priabying.kittisak.lab9;

import java.awt.geom.Ellipse2D;

public class Ball extends Ellipse2D.Double {
    private static final long serialVersionUID = 1L;
    public final static int BALL_DIAMETER = 30;
    private int xVelocity;
    private int yVelocity;

    // Constructor 2 parameter.(int,int)
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

    // Getter for XVelocity.
    public int getXVelocity() {
        return xVelocity;
    }

    // Setter for XVelocity.
    public void setXVelocity(int xVelocity) {
        this.xVelocity = xVelocity;

    }

    // Getter for YVelocaity.
    public int getYVelocity() {
        return yVelocity;
    }

    // Setter for YVelocity.
    public void setYVelocity(int yVelocity) {
        this.yVelocity = yVelocity;

    }

    public void move() {
        this.x += this.xVelocity;
        this.y += this.yVelocity;
    }

}