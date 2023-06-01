package Uppgift2;

/**
 * The Circle class represents a circle shape.
 */
public class Circle implements Shape {

    private double radius;

    /**
     * Constructs a Circle object with the specified radius.
     *
     * @param radius The radius of the circle.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates and returns the area of the circle.
     *
     * @return The area of the circle.
     */
    @Override
    public double getArea() {
        return Math.PI * (radius * radius);
    }
}
