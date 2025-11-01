class Book {
    String title;
    String author;
    int pages;

    void read() {
        System.out.println("Reading \"" + title + "\" by " + author);
    }
}

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book();
        myBook.title = "The Alchemist";
        myBook.author = "Paulo Coelho";
        myBook.pages = 208;
        myBook.read();
    }
}
