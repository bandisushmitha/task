public class Food {

    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayFoodDetails() {
        System.out.println("Food Name: " + name);
        System.out.println("Price: " + price);
    }

}