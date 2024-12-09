package lesson6.library;

public class Library {
    private Book activeBook;

    public Book getActiveBook() {
        return activeBook;
    }

    public void setActiveBook(Book activeBook) throws Exception {
        if (this.activeBook.equals(activeBook)) {
            throw new Exception("Provide book already active");
        }
        this.activeBook = activeBook;
    }
}
