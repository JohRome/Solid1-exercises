package Uppgift2;

public class Main {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(3.3, 3.3);
        System.out.println(rectangle.getArea());

        Shape circle = new Circle(12);
        System.out.println(circle.getArea());


    }
}
