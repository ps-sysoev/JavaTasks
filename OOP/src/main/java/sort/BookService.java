package sort;

import java.util.Objects;

public class BookService {
    /**
     * Используя алгоритм сортировки выбором отсортируйте книги по их году.
     * Алгоритм можно найти тут - https://favtutor.com/blogs/sorting-algorithms-java
     * В данной задаче ЗАПРЕЩЕНО использовать Comparator.
     *
     * @param books неупорядоченные книги
     * @return отсортированные книги по году.
     */
    public Book[] sortBookByYear(Book[] books) {
        if (Objects.isNull(books)) {
            throw new IllegalArgumentException("Incorrect parameter: list of books is null.");
        }

        if (books.length < 1) {
            throw new IllegalArgumentException("Incorrect parameter: list of books is empty.");
        }

        for (int i = 0; i < books.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < books.length; j++) {
                if (books[j].getCreatedYear() < books[minIndex].getCreatedYear()) {
                    minIndex = j;
                }
            }

            Book temp = books[i];
            books[i] = books[minIndex];
            books[minIndex] = temp;
        }

        return books;
    }
}