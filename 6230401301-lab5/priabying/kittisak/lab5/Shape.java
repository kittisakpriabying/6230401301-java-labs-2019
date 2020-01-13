/**
* Author: Kittisak Priabying
* ID: 623040130-1
* Sec: 1
* Date: January 13, 2020
 */
package priabying.kittisak.lab5;

public abstract class Shape {
    // variables
    protected String color;
    protected boolean filled;

    // Constructor no parameter.
    public Shape() {
        this.color = "White";
        this.filled = false;

    }

    // Constructor 2 parameter(color and filled).
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // setter for color.
    public void setColor(String newColor) {
        color = newColor;
    }

    // getter for color.
    public String getColor() {
        return color;
    }

    // setter for filled.
    public void setFilled(boolean newFilled) {
        filled = newFilled;
    }

    // getter for filled.
    public boolean isFilled() {
        return filled;
    }

    // abstract methods
    abstract double getArea();

    abstract double getPerimeter();

    @Override
    public String toString() { // output template
        return "Color:" + this.color + ", Filled:" + this.filled;
    }
}