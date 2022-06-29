package se.lexicon.Rectangle;

public class Rectangle {

    private double height;
    private double width;

    public Rectangle() {
        this.height = 1.0;
        this.width = 1.0;
    }
    public Rectangle(double height, double width){
            this.height =height;
            this.width =width;
    }
    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.height + this.height);
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;

    }
}
