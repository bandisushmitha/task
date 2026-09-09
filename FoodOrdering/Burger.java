public class Burger extends Food {

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    public void displayBurgerDetails() {
        System.out.println("Burger Type: " + type);
    }

}