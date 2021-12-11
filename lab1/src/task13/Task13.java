package task13;

public class Task13 {
    public static void main(String[] args) {
        ProgrammerBook book1 = new ProgrammerBook("How to learn Java", "Tolkien", 30, 1, "Java", 4);
        ProgrammerBook book2 = new ProgrammerBook("How to learn Java", "Tolkien", 30, 1, "Java", 4);
        ProgrammerBook book3 = new ProgrammerBook("How to learn C#", "Tolkien", 30, 1, "C#", 4);

        System.out.println(book1.toString());
        System.out.println();
        System.out.println(book2.toString());
        System.out.println();
        System.out.println(book3.toString());
        System.out.println();

        System.out.println("Book1 == Book1: " + book1.equals(book1));
        System.out.println("Book1 == Book2: " + book1.equals(book2));
        System.out.println("Book1 == Book3: " + book1.equals(book3));
        System.out.println("Book2 == Book3: " + book2.equals(book3));
        System.out.println();

        System.out.println("Book1 hash: " + book1.hashCode());
        System.out.println("Book2 hash: " + book2.hashCode());
        System.out.println("Book3 hash: " + book3.hashCode());
        System.out.println();
    }
}
