package com.mmartynava.epam.classes;

import java.util.Scanner;

//Создать массив объектов. Вывести:
//a) список книг заданного автора;
//b)   список книг, выпущенных заданным издательством;
//c)   список книг, выпущенных после заданного года.

public class BookMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Список асортимента книг");
        for (int i = 0; i < bookbase().length; i++) {
            System.out.println(bookbase()[i]);
        }

        //Book[] book_list = books();            // ручное заполнение
        Book[] book_list = bookbase();           // автозаполнение
        System.out.println("----------a)Вывести список книг заданного автора;");
        System.out.print("Введите автора: ");
        check_autor(book_list, scanner.next());

        System.out.println("----------b)Вывести список книг, выпущенных заданным издательством;");
        System.out.print("Введите издателя: ");
        check_publisher(book_list, scanner.next());

        System.out.println("----------c)Вывести список книг, выпущенных после заданного года.");
        System.out.print("Введите год: ");
        check_year(book_list, scanner.nextInt());

    }

    static Book[] books() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Введите количество книг: ");
        Book[] books = new Book[scanner1.nextInt()];
        for (int i = 0; i < books.length; i++) {
            books[i] = new Book();
            System.out.println();
            System.out.print("Введите id: ");
            books[i].setId(scanner1.nextInt());
            System.out.print("Введите название книги: ");
            books[i].setName(scanner1.next());
            System.out.print("Введите количество авторов: ");
            int n = scanner1.nextInt();
            String[] mass = new String[n];
            for (int j = 0; j < n; j++) {
                System.out.print("Введите автора: ");
                mass[j] = scanner1.next();
            }
            books[i].setAutor(mass);

            System.out.print("Введите издательство: ");
            books[i].setPublisher(scanner1.next());
            System.out.print("Введите год издания: ");
            books[i].setYear(scanner1.nextInt());
            System.out.print("Введите количество страниц: ");
            books[i].setPages(scanner1.nextInt());
            System.out.print("Введите цену: ");
            books[i].setPrice(scanner1.nextInt());
            System.out.print("Введите тип переплета: ");
            books[i].setCover(scanner1.next());
        }

        return books;
    }

    static Book[] bookbase() {
        Book[] book_list = new Book[6];
        String[] autors1 = {"МарияСемёнова"};
        book_list[0] = new Book(1, "Волкодав", autors1, "АСТ", 1994, 752, 19, "Твердый переплет");
        String[] autors2 = {"МаргаретМитчелл"};
        book_list[1] = new Book(2, "Унесенные ветром", autors2, "Эксмо", 2018, 768, 20, "Мягкий переплет");
        String[] autors3 = {"ГюнтекинРешадНури"};
        book_list[2] = new Book(3, "Птичка певчая", autors3, "Золак", 1991, 91, 11, "Мягкий переплет");
        String[] autors4 = {"ЭрихМарияРемарк"};
        book_list[3] = new Book(4, "Триумфальная арка", autors4, "АСТ", 2017, 640, 13, "Твердый переплет");
        String[] autors5 = {"ЭрихМарияРемарк"};
        book_list[4] = new Book(5, "Три товарища", autors5, "АСТ", 2016, 384, 13, "Твердый переплет");
        String[] autors6 = {"АнтуандеСент-Экзюпери"};
        book_list[5] = new Book(6, "Маленький принц", autors6, "Эксмо", 2018, 112, 11, "Твердый переплет");

        return book_list;
    }

    static void check_autor(Book[] books, String autor) {
        for (Book book : books) {
            String[] autors = book.getAutor();

            for (String s : autors) {
                if (s.equals(autor)) {
                    System.out.println(book.toString());
                    break;
                }
            }
        }
    }

    static void check_publisher(Book[] books, String publisher) {
        for (Book book : books) {
            if (book.getPublisher().equals(publisher)) {
                System.out.println(book.toString());
            }
        }
    }

    static void check_year(Book[] books, int year) {
        for (Book book : books) {
            if (year < book.getYear()) {
                System.out.println(book.toString());
            }
        }
    }
}