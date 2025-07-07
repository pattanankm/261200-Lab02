public class Main {
    public static void main(String[] args) {
        Book myBook = new Book("Book 1","Pattanan",5.0);

        myBook.displayDetails();
        Book ourBook = new Book("Our Book");

        ourBook.displayDetails();
        ourBook.updatePrice(100.0);
        ourBook.displayDetails();

        System.out.println("===============================================");
        System.out.println("===============================================");

        Book unknownBook = new Book();
        unknownBook.displayDetails();

        // Test parameterized constructor
        Book hp1Book = new Book("Harry Potter and the Philosopher\'s Stone", "J.K. Rowling", 350.00);
        hp1Book.displayDetails();

        System.out.println("Check the discount");
        hp1Book.applyDiscount(20);

        // Test price update
        System.out.println("Check the updated price");

        hp1Book.updatePrice(1000.00);
        hp1Book.displayDetails();
        hp1Book.applyDiscount(20);

    }
}
