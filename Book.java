public class Book {
    String title;
    String author;
    double price;
    double newPrice;
    double discount;

    Book(){
        this("Unknown title","Unknown author",0.0);
    }

    Book(String title){
        this(title,"Unknown author",0.0);
    }

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Display book details instead of calling it line-by-line
    public void displayDetails() {
        System.out.println("Title : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("Price : " + this.price);
    }

    public void updatePrice(double newPrice){
        if(newPrice >= 0) {
            this.price = newPrice;
        } else {
            System.out.println("Invalid Price");
        }
    }

    public void applyDiscount(double discountPercent){
        discountPercent = discount/100;
     if(price > 0 && price <= 100 && discountPercent >= 0){
         this.newPrice = this.price - (this.price* discountPercent);
        updatePrice(this.newPrice);
        System.out.println("The updated price with discount is : " + this.newPrice);
     } else{
         System.out.println("Invalid");
     }

    }
}
