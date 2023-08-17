package com.greedy.level02.normal.book.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

import java.awt.print.Book;

public class Application {
    public static void main(String[] args) {

        BookDTO book1 = new BookDTO();
        book1.printlnformation();

        BookDTO book2 = new BookDTO("자바가 싫어","자바교육","수강생들");
        book2.printlnformation();

        BookDTO book3 = new BookDTO("자바가 싫어","자바교육","수강생들",10000,10);
        book3.printlnformation();

    }
}
