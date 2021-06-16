package com.mmartynava.epam.classes;

import java.util.Arrays;

public class Book {

    private int id;

    private String name;

    private String[] author;

    private String publisher;

    private int year;

    private int pages;

    private int price;

    private String cover;

    public Book() {
        this.id = 0;
        this.name = "";
        this.author = new String[0];
        this.publisher = "";
        this.year = 0;
        this.pages = 0;
        this.price = 0;
        this.cover = "";
    }

    public Book(int id, String name, String[] author, String publisher, int year, int pages, int price, String cover) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
        this.cover = cover;
    }

    void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    void setAuthor(String[] author) {
        this.author = author;
    }

    String[] getAuthor() {
        return author;
    }

    void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    String getPublisher() {
        return publisher;
    }

    void setYear(int year) {
        this.year = year;
    }

    int getYear() {
        return year;
    }

    void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        } else System.out.println("Количестов не может быть меньше 1!");
    }

    void setPrice(int price) {
        if (price > 0) {
            this.price = price;
        } else System.out.println("Цена неможет быть отрицательной и нулевой!");
    }

    void setCover(String cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return "Книга --- " +
                "id=" + id +
                ", Название=" + name +
                ", Автор(ы)=" + Arrays.toString(author) +
                ", Издатель=" + publisher +
                ", Год издания=" + year +
                ", Количество страниц=" + pages +
                ", Цена=" + price + " руб" +
                ", Переплет=" + cover;
    }
}