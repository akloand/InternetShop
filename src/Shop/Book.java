package Shop;

public class Book {

    private final String name;
    private final String author;
    private final int pages;
    private final int neumberISBN;

    public Book(String name, String author, int pages, int neumberISBN) {
        this.name = name;
        this.author = author;
        this.pages = pages;
        this.neumberISBN = neumberISBN;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getNeumberISBN() {
        return neumberISBN;
    }
}
