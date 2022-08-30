package sort;

import java.util.Objects;

public class Book {
    private final String author;
    private final String title;
    private final int createdYear;

    public Book(String author, String title, int createdYear) {
        if (Objects.isNull(author) || author.equals("")) {
            throw new IllegalArgumentException("Incorrect parameter: author is null.");
        }

        if (Objects.isNull(title) || title.equals("")) {
            throw new IllegalArgumentException("Incorrect parameter: title is null.");
        }

        if (createdYear <= 0) {
            throw new IllegalArgumentException("Incorrect parameter createdYear.");
        }

        this.author = author;
        this.title = title;
        this.createdYear = createdYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getCreatedYear() {
        return createdYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Book book = (Book) o;

        return createdYear == book.createdYear
                && Objects.equals(author, book.author)
                && Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title, createdYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                "title='" + title + '\'' +
                ", createdYear=" + createdYear +
                '}';
    }
}