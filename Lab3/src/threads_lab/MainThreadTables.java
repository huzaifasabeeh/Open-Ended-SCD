package threads_lab;

class RollNumberTable extends Thread {
    public void run() {
        int num = 92; 
        System.out.println("Table of Roll Number (92):");
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

class DOBTable extends Thread {
    public void run() {
        int num = 5; 
        System.out.println("\nTable of DOB Number (5):");
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

public class MainThreadTables {
    public static void main(String[] args) {
        RollNumberTable t1 = new RollNumberTable();
        DOBTable t2 = new DOBTable();

        t1.start(); 
        t2.start(); 
    }
}
