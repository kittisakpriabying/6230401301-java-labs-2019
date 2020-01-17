/**
* Author: Kittisak Priabying
* ID: 623040130-1
* Sec: 1
* Date: January 13, 2020
**/
package priabying.kittisak.lab5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rectangle extends Shape {
    // variables
    protected double width;
    protected double lenght;

    // Constructor no parameter.
    public Rectangle() {
        super();
        this.lenght = 2.0;
        this.width = 1.0;

    }

    // Constructor 2 parameter(width, lenght).
    public Rectangle(double width, double lenght) {
        super();
        this.lenght = lenght;
        this.width = width;

    }

    // Constructor 4 parameter(width, lenght, color, filled).
    public Rectangle(double width, double lenght, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;

    }

    // setter for width.
    public void setWidth(double width) {
        this.width = width;
    }

    // getter for width.
    public double getWidth() {
        return width;
    }

    // setter for lenght.
    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    // getter for lenght.
    public double getLenght() {
        return lenght;
    }

    @Override
    public double getArea() {
        // calculate rectangle area.
        double areaRectangle = width * lenght;

        BigDecimal bd = BigDecimal.valueOf(areaRectangle);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();

    }

    @Override
    public double getPerimeter() {
        // calculate perimeter.
        double perimeter = 2 * (this.lenght + this.width);

        BigDecimal bd = BigDecimal.valueOf(perimeter);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public String toString() {
        return super.toString() + ", width:" + this.width + ", length:" + this.lenght;
    }

}