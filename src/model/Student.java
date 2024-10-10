package model;

import java.util.ArrayList;

public class Student extends User {
    ArrayList<Book> booksBorrowed = new ArrayList<Book>();
    public Student(String userId, String name, String userName, String password){
        super(userId, name, userName, password);
    }

    public void borrowBook(Book book) {
        booksBorrowed.add(book);
        System.out.println("Book successfully borrowed: " + book.getTitle());
    }

    public Book returnBook(int index) {
        return booksBorrowed.remove(index);
    }

    public void viewBorrowedBooks() {
        if (booksBorrowed.isEmpty()) {
            System.out.println("No books currently borrowed.");
        } else {
            System.out.println("Borrowed Books:");
            for (int i = 0; i < booksBorrowed.size(); i++) {
                System.out.println((i + 1) + ". " + booksBorrowed.get(i));
            }
        }
    }

}
