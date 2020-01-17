/**
 * 
 * Program drawable rectangle . 
 * extends class Rectangle and implement Moveable , Drawable.
 * 
* Author: Kittisak Priabying
* ID: 623040130-1
* Sec: 1
* Date: January 13, 2020
**/
package priabying.kittisak.lab5;

public class DrawableRectangle extends Rectangle implements Drawable, Moveable {
    // variables
    private double x;
    private double y;
    // Constructor no parameter.
    public DrawableRectangle() {
        super();
        this.x = 0.0;
        this.y = 0.0;
    }
    // Constructor 2 parameter (x, y)
    public DrawableRectangle(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }
    // Constructor 6 parameter (x, y, width, lenght, color, filled)
    public DrawableRectangle(double x, double y, double width, double lenght, String color, boolean filled) {
        super(width, lenght, color, filled);
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
    // value to increment x
    @Override
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
        return "draw a rectangle with top left corner at (" + this.x + "," + this.y + ")" + " with width=" + this.width
                + " lenght=" + this.lenght;
    }

}