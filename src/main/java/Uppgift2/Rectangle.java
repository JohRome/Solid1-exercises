package Uppgift2;

/**
 * The Rectangle class represents a rectangle shape.
 */
public class Rectangle implements Shape {

    private double base;
    private double height;

    /**
     * Constructs a Rectangle object with the specified base and height.
     *
     * @param base   The base of the rectangle.
     * @param height The height of the rectangle.
     */
    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    /**
     * Calculates and returns the area of the rectangle.
     *
     * @return The area of the rectangle.
     */
    @Override
    public double getArea() {
        return base * height;
    }
}
