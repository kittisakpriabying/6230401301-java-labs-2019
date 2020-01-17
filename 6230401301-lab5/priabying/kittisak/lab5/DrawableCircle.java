/**
 * 
 * Program drawable circle . 
 * extends class Circle and implement Moveable , Drawable.
 * 
* Author: Kittisak Priabying
* ID: 623040130-1
* Sec: 1
* Date: January 13, 2020
**/
package priabying.kittisak.lab5;

public class DrawableCircle extends Circle implements Moveable, Drawable {
    // variables
    private double x;
    private double y;

    // Constructor no parameter.
    public DrawableCircle() {
        super();
        this.x = 0.0;
        this.y = 0.0;

    }

    // Constructor 2 parameter (x, y)
    public DrawableCircle(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    // Constructor 5 parameter (x, y, radius, color, filled)
    public DrawableCircle(double x, double y, double radius, String color, boolean filled) {
        super(radius, color, filled);
        this.x = x;
        this.y = y;
    }

    // getter for x.
    public double getX() {
        return x;
    }

    // setter for x.
    public void setX(double x) {
        this.x = x;
    }

    // getter for y.
    public double getY() {
        return y;

    }

    // setter for y.
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    // value to increment y.
    public void moveUp(int value) {
        this.y += value;
    }

    @Override
    // value to decrement y.
    public void moveDown(int value) {
        this.y -= value;

    }

    @Override
    // value to increment x
    public void moveRight(int value) {
        this.x += value;
    }

    @Override
    // value to decrement x.
    public void moveLeft(int value) {
        this.x -= value;
    }

    @Override
    public String draw() {
        return "draw a circle with the center at (" + this.x + "," + this.y + ") with radius=" + this.radius;
    }
}