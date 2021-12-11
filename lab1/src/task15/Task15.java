package task15;

import task12.Book;

import java.util.ArrayList;
import java.util.Comparator;

class task15 {
    public static void main(String[] args) {
        Comparator<Book> titleComparator = Comparators.getTitleComparator();
        Comparator<Book> titleAuthorComparator = Comparators.getTitleAuthorComparator();
        Comparator<Book> authorTitleComparator = Comparators.getAuthorTitleComparator();
        Comparator<Book> allComparator = Comparators.getAllComparators();

        ArrayList<Book> books = new ArrayList<Book>();

        books.add(new Book("LOTR", "Tolkien", 50, 1, 1));
        books.add(new Book("HP&GoA", "B", 40, 1, 2));
        books.add(new Book("Dragon's book", "Ulman", 100, 1, 4));
        books.add(new Book("HP&SC", "D", 41, 1, 6));
        books.add(new Book("HP&SC", "D", 42, 1, 3));
        books.add(new Book("HP&GoA", "A", 45, 1, 1));

        books(books);
        books.sort(titleComparator);
        books(books);

        books.sort(titleAuthorComparator);
        books(books);

        books.sort(authorTitleComparator);
        books(books);

        books.sort(allComparator);
        books(books);
    }
    public static void books(ArrayList books) {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString());
        }

        System.out.println();
    }
}
