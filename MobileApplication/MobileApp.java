public class MobileApp implements GPS, Camera {

    private String appName;
    private String location;

    public void setAppName(String appName) {
    this.appName = appName;
    }

     public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void getLocation() {
        System.out.println("Current Location: " + location);
    }

    @Override
    public void takePhoto() {
        System.out.println("Photo captured successfully!");
    }

    public void displayAppDetails() {
        System.out.println("Application Name: " + appName);
        System.out.println("Location: " + location);
    }

}