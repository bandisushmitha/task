public class Developer extends Employee {

    private String programmingLanguage;

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDeveloperDetails() {
        System.out.println("Programming Language: " + programmingLanguage);
    }

}