package task13;

import task12.Book;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int edition, String language, int level) {
        super(title, author, 50, price, edition);
        this.language = language;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public String getLanguage() {
        return language;
    }

    public String toString() {
        return super.toString() + "; Language: " + language + "; level:"  + level;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        } else if (this == object) {
            return true;
        } else if (getClass() != object.getClass()) {
            return false;
        } else if (!super.equals(object)) {
            return false;
        }

        ProgrammerBook programmerBook = (ProgrammerBook) object;
        if (level != programmerBook.getLevel()){
            return false;
        } else if (!language.equals(programmerBook.getLanguage())) {
            return false;
        }

        return true;
    }

    public int hashCode() {
        final int prime = 16;
        int result = super.hashCode();

        result = result * prime + language.hashCode();
        result = result * prime + level;

        return result;
    }
}
