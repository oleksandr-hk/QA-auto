package lesson3.library;

public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private boolean isAvailable;

    public Book(String title, boolean isAvailable, int yearPublished, String author) {
        this.title = title;
        this.isAvailable = isAvailable;
        this.yearPublished = yearPublished;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    protected boolean borrowBook() {
        setAvailable(false);
        return isAvailable;
    }

    protected boolean returnBook() {
        setAvailable(true);
        return isAvailable;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                ", isAvailable=" + isAvailable +
                '}';
    }
}
