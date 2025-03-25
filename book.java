public class book {
        private String name;
        private String title;
        private double price;
        public book() {
                this.name = "unknown";
                this.title = "unknown";
                this.price = 0.3;
                }
                public book(String title, String name){
                    this.name = name;
                    this.title = title;
                    this.price = 0.3;
                }
                public book(String name, String title, double price){
                    this.title = title;
                    this.name = name;
                    this.price = price;
                }
            
        
    



    public static void main(String[] args) {
        



        book book1 = new book();
    System.out.println("book1 title: "+ book1.title);
    System.out.println("book1 name of author: "+ book1.name);
    System.out.println("bok1 price: "+book1.price);
    //printint
        book book2 = new book("martin", "martin luther");
        System.out.println("book 2 title:- "+ book2.title);
        System.out.println("book2 name:- " + book2.name);
        System.out.println("book2 price:- " + book2.price);
        book book3 = new book();
        
    }
}