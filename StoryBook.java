    
public class StoryBook extends Book {

    private String category;

    StoryBook() {}

    StoryBook(String isbn, String bookTitle, String authorName,
              double price, int availableQuantity, String category) {
        super(isbn, bookTitle, authorName, price, availableQuantity);
        this.category = category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
@Override
    public void showDetails() {
        System.out.println("Story Book:");
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + authorName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + availableQuantity);
        System.out.println("Category: " + category);
        System.out.println("-----------------------");
    }
}

