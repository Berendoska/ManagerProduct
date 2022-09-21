package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;



class ManagerProductTest {



        Repo repository = new Repo();
        ManagerProduct manager = new ManagerProduct(repository);
        Book book1 = new Book(1, "book1", 300, "author");
        Book book2 = new Book(2, "book2", 300, "author1");
        Book book3 = new Book(3, "book3", 200, "author2");

        @Test
        public void test() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);


            Product[] expected = {book1};
            Product[] actual = manager.searchBy("book1");

            assertArrayEquals(expected, actual);




    }
    @Test
    public void testNull() {
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);


        Product[] expected = { };
        Product[] actual = manager.searchBy("book5");

        assertArrayEquals(expected, actual);


    }
}