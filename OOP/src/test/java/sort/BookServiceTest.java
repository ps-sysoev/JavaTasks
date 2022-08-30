package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookServiceTest {
    @Test
    public void whenAuthorNull() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> new Book(null, "Hostess", 1847));

        assertEquals("Incorrect parameter: author is null.", thrown.getMessage());
    }

    @Test
    public void whenAuthorEmpty() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> new Book("", "Hostess", 1847));

        assertEquals("Incorrect parameter: author is null.", thrown.getMessage());
    }

    @Test
    public void whenTitleNull() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> new Book("Dostoevsky", null, 1847));

        assertEquals("Incorrect parameter: title is null.", thrown.getMessage());
    }

    @Test
    public void whenTitleEmpty() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> new Book("Dostoevsky", "", 1847));

        assertEquals("Incorrect parameter: title is null.", thrown.getMessage());
    }

    @Test
    public void whenCreatedYearIncorrect() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> new Book("Dostoevsky", "Hostess", -1));

        assertEquals("Incorrect parameter createdYear.", thrown.getMessage());
    }

    @Test
    public void whenListOfBooksNull() {
        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> new BookService().sortBookByYear(null));

        assertEquals("Incorrect parameter: list of books is null.", thrown.getMessage());
    }

    @Test
    public void whenListOfBooksEmpty() {
        Book[] emptyListBooks = {};

        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> new BookService().sortBookByYear(emptyListBooks));

        assertEquals("Incorrect parameter: list of books is empty.", thrown.getMessage());
    }

    @Test
    public void firstBookServiceTest() {
        Book[] listBooks = {
                new Book("Dostoevsky", "Hostess", 1847),
                new Book("Dostoevsky", "Uncle's dream", 1859),
                new Book("Dostoevsky", "Crime and punishment", 1866),
                new Book("Dostoevsky", "Meek", 1876),
                new Book("Dostoevsky", "Teenager", 1875),
                new Book("Dostoevsky", "Notes from the underground", 1864),
                new Book("Dostoevsky", "For the coronation and the conclusion of peace", 1856),
                new Book("Dostoevsky", "Crocodile", 1865),
                new Book("Dostoevsky", "Kids are expensive", 1876),
                new Book("Dostoevsky", "Humiliated and insulted", 1861),
                new Book("Dostoevsky", "Poor people", 1846)
        };

        Book[] expected = {
                new Book("Dostoevsky", "Poor people", 1846),
                new Book("Dostoevsky", "Hostess", 1847),
                new Book("Dostoevsky", "For the coronation and the conclusion of peace", 1856),
                new Book("Dostoevsky", "Uncle's dream", 1859),
                new Book("Dostoevsky", "Humiliated and insulted", 1861),
                new Book("Dostoevsky", "Notes from the underground", 1864),
                new Book("Dostoevsky", "Crocodile", 1865),
                new Book("Dostoevsky", "Crime and punishment", 1866),
                new Book("Dostoevsky", "Teenager", 1875),
                new Book("Dostoevsky", "Kids are expensive", 1876),
                new Book("Dostoevsky", "Meek", 1876)
        };

        Book[] result = new BookService().sortBookByYear(listBooks);

        assertArrayEquals(expected, result);
    }

    @Test
    public void secondBookServiceTest() {
        Book[] listBooks = {
                new Book("Dostoevsky", "Poor people", 1846),
                new Book("Dostoevsky", "A double", 1846),
                new Book("Dostoevsky", "Mr. Prokharchin", 1846)
        };

        Book[] expected = {
                new Book("Dostoevsky", "Poor people", 1846),
                new Book("Dostoevsky", "A double", 1846),
                new Book("Dostoevsky", "Mr. Prokharchin", 1846)
        };

        Book[] result = new BookService().sortBookByYear(listBooks);

        assertArrayEquals(expected, result);
    }
}