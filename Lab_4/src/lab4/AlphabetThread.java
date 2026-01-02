package lab4;

public class AlphabetThread extends Thread {

    public void run() {
        for (int i = 0; i < 26; i++) {
            try {
                Thread.sleep((int)(Math.random() * 500) + 300);
            } catch (InterruptedException e) {
                System.out.println(e);
            }

            char alphabet = (char) ((int)(Math.random() * 26) + 65);
            System.out.println("Alphabet: " + alphabet);
        }
    }

    public static void main(String[] args) {
        AlphabetThread t1 = new AlphabetThread();
        t1.start();
    }
}
