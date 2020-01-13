/**
* Author: Kittisak Priabying
* ID: 623040130-1
* Sec: 1
* Date: January 13, 2020
**/
package priabying.kittisak.lab5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape {
    // variables
    protected double radius;

    // Constructor no parameter.
    public Circle() {
        super();
        radius = 1.0;
    }

    // Constructor 1 parameter(radius).
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Constructor 1 parameter(radius , color ,filled).
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;

    }

    // getter for radius.
    public double getRadius() {
        return radius;
    }

    // setter for radius.
    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    @Override
    public double getArea() {
        // calculate area.
        double area = Math.PI * Math.pow(this.radius, 2);

        BigDecimal bd = BigDecimal.valueOf(area);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();

    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * this.radius;

        BigDecimal bd = BigDecimal.valueOf(perimeter);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    @Override
    public String toString() {
        return super.toString() + ", radius:" + this.radius;
    }

}