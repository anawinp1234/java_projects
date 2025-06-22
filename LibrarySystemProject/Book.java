public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public void borrowBook() {
        if (!isBorrowed) {
            isBorrowed = true;
            System.out.println("You borrowed \"" + title + "\".");
        } else {
            System.out.println("Sorry, \"" + title + "\" is already borrowed.");
        }
    }
    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("You returned \"" + title + "\".");
        } else {
            System.out.println("\"" + title + "\" was not borrowed.");
        }
    }

    public String getDetails() {
        return "Title: " + title + ", Author: " + author + ", Borrowed: " + (isBorrowed ? "Yes" : "No");
    }

    public String getTitle() {
        return title;
    }
}
