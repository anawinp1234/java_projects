import java.util.ArrayList;

public class Library {
   private ArrayList <Book> books;

   public Library() {
    books = new ArrayList<>();
   }

   public void addBook(Book book) {
    books.add(book);
    System.out.println("Added \"" + book.getTitle() + "\" to the library.");
   }

   public void viewBooks() {
    if (books.isEmpty()) {
        System.out.println("The library has no books.");
    } else {
        for (Book book : books) {
            System.out.println(book.getDetails());
        }
    }
   }
   
   public void searchBook(String title) {
    for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title)) {
            System.out.println(book.getDetails());
            return;
        }
    }
    System.out.println("Book not found.");
   }

   public void borrowBook(String title) {
    for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title)) {
            book.borrowBook();
            return;
        }
    }
   }

   public void returnBook(String title) {
    for (Book book : books) {
        if (book.getTitle().equalsIgnoreCase(title)) {
            book.returnBook();
            return;
        }
    }
    System.out.println("Book not found.");
   }
}
