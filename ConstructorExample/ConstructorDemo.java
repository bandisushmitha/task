public class ConstructorDemo {

    ConstructorDemo() {
        this(100);
        System.out.println("Default Constructor");
    }

    ConstructorDemo(int number) {
        System.out.println("Parameterized Constructor");
        System.out.println("Number: " + number);
    }

    public static void main(String[] args) {

        ConstructorDemo obj = new ConstructorDemo();

    }
}