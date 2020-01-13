package priabying.kittisak.lab5;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rectangle extends Shape {
    protected double width;
    protected double lenght;

    public Rectangle() {
        super();
        this.lenght = 2.0;
        this.width = 1.0;

    }

    public Rectangle(double width, double lenght) {
        super();
        this.lenght = lenght;
        this.width = width;

    }

    public Rectangle(double width, double lenght, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;

    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setLenght(double lenght) {
        this.width = lenght;
    }

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