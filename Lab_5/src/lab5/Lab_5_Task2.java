package lab5;

class Printer {
    private int pages = 10;

    synchronized void printPages(int requiredPages) {
        System.out.println("Print job received: " + requiredPages + " pages");

        while (pages < requiredPages) {
            System.out.println("Not enough pages. Waiting...");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        pages -= requiredPages;
        System.out.println("Printing completed.");
        System.out.println("Remaining pages: " + pages);
    }

    synchronized void refillPages(int newPages) {
        System.out.println("Refilling printer with " + newPages + " pages");
        pages += newPages;
        notify();
    }
}

class PrintThread extends Thread {
    Printer printer;

    PrintThread(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        printer.printPages(15);
    }
}

class RefillThread extends Thread {
    Printer printer;

    RefillThread(Printer printer) {
        this.printer = printer;
    }

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
        printer.refillPages(10);
    }
}

public class Lab_5_Task2 {
    public static void main(String[] args) {
        Printer printer = new Printer();

        new PrintThread(printer).start();
        new RefillThread(printer).start();
    }
}
