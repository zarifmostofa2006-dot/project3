public class TextBook extends Book {

    private int standard;

    TextBook() {}

    TextBook(String isbn, String bookTitle, String authorName,
             double price, int availableQuantity, int standard) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.standard = standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getStandard() {
        return standard;
    }
@Override
    public void showDetails() {
        System.out.println("Text Book:");
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + authorName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + availableQuantity);
        System.out.println("Standard: " + standard);
        System.out.println("-----------------------");
    }
}
    

