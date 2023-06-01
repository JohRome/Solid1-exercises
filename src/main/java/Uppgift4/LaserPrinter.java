package Uppgift4;

/**
 * The LaserPrinter class represents a laser printer that implements the Printer interface.
 */
public class LaserPrinter implements Printer {

    /**
     * Prints the printable prints using a laser printer.
     */
    @Override
    public void print() {
        System.out.println("Laser Printer printing printable prints");
    }

    /**
     * Scans the scannable scans using a laser printer.
     */
    @Override
    public void scan() {
        System.out.println("Laser Printer scanning scannable scans");
    }
}
