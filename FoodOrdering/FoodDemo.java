public class FoodDemo {

    public static void main(String[] args) {

        Pizza pizza = new Pizza();

        pizza.setName("Margherita Pizza");
        pizza.setPrice(250);
        pizza.setSize("Large");

        Burger burger = new Burger();

        burger.setName("Cheese Burger");
        burger.setPrice(180);
        burger.setType("Chicken");

        pizza.displayFoodDetails();
        pizza.displayPizzaDetails();

        burger.displayFoodDetails();
        burger.displayBurgerDetails();

    }
}