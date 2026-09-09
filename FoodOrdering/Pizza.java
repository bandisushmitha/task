public class Pizza extends Food {

    private String size;

    public void setSize(String size) {
        this.size = size;
    }

    public void displayPizzaDetails() {
        System.out.println("Pizza Size: " + size);
    }

}