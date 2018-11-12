package book;

public class Book {
    private int pagesAmount;
    private String author;

    public Book(int pagesAmount, String author){
        this.pagesAmount = pagesAmount;
        this.author = author;
    }

    public int getPagesAmount() {
        return pagesAmount;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPagesAmount(int pagesAmount) {
        this.pagesAmount = pagesAmount;
    }

    public void displayInfo(){
        System.out.printf("Количество страниц: %d, автор книги: %s ", getPagesAmount(), getAuthor());
    }
}
