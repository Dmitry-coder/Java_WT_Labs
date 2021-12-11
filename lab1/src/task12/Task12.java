package task12;

public class Task12 {
    public static void main(String[] args) {
        Book b1 = new Book("200 lie under water", "Gul Vern", 50, 15, 1);
        Book b2 = new Book("Lord Of The Ring", "Tolking", 50, 20, 1);
        Book b3 = new Book("qwerty", "qw", 50, 5,1);

        System.out.println("Book1 == Book1: " + b1.equals(b1));
        System.out.println("Book1 == Book2: " + b1.equals(b2));
        System.out.println("Book1 == Book3: " + b1.equals(b3));
        System.out.println("Book2 == Book3: " + b2.equals(b3) + "\n");

        System.out.println("Book1 hash: " + b1.hashCode());
        System.out.println("Book2 hash: " + b2.hashCode());
        System.out.println("Book3 hash: " + b3.hashCode() + "\n");
    }
}
