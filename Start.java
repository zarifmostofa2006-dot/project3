public class Start {
    public static void main(String[] args) {

        BookShop shop = new BookShop("AUB Book Shop");

        StoryBook s1 = new StoryBook("S1","Fairy Tales","Aesop",300,10,"Kids");
        StoryBook s2 = new StoryBook("S2","Horror Night","King",400,5,"Horror");
        StoryBook s3 = new StoryBook("S3","Magic World","Rowling",500,8,"Fantasy");
        StoryBook s4 = new StoryBook("S4","Love Story","Nicholas",350,6,"Romance");
        StoryBook s5 = new StoryBook("S5","Adventure","Verne",450,7,"Adventure");

        TextBook t1 = new TextBook("T1","Math","Hasan",600,10,10);
        TextBook t2 = new TextBook("T2","Physics","Rahman",700,9,11);
        TextBook t3 = new TextBook("T3","Chemistry","Karim",650,8,12);
        TextBook t4 = new TextBook("T4","Biology","Ahmed",620,6,9);
        TextBook t5 = new TextBook("T5","ICT","Islam",500,12,8);

        shop.insertBook(s1);
        shop.insertBook(s2);
        shop.insertBook(s3);
        shop.insertBook(s4);
        shop.insertBook(s5);

        shop.insertBook(t1);
        shop.insertBook(t2);
        shop.insertBook(t3);
        shop.insertBook(t4);
        shop.insertBook(t5);

        shop.showAllBooks();

        Book b = shop.searchBook("T3");
        if (b != null) {
            b.sellQuantity(2);
            b.showDetails();
        }
    }
}
    

