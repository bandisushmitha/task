public class SeniorDeveloper extends Developer {

    private int experience;

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void displaySeniorDetails() {
        System.out.println("Experience: " + experience + " years");
    }

}