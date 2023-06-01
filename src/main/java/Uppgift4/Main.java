package Uppgift4;

public class Main {
    public static void main(String[] args) {

        Printer scan = new Scanner();
        scan.print();
        scan.scan();

        Printer laser = new LaserPrinter();
        laser.print();
        laser.scan();
    }
}
