public class HomeInterface {
    private HomeService light;
    private HomeService tv;
    private HomeService ac;


    public HomeInterface (HomeService light, HomeService tv, HomeService ac) {

        this.light = light;
        this.tv = tv;
        this.ac = ac;
    }

    public void options(int choice) {
        switch (choice) {

            case 1:
                light.On();
                break;
            case 2:
                light.Off();
                break;
            case 3:
                tv.On();
                break;
            case 4:
                tv.Off();
                break;
            case 5:
                ac.On();
                break;
            case 6:
                ac.Off();
                break;
            case 7:
                turnOnAll();
                break;
            case 8:
                turnOffAll();
                break;
            case 9:
                System.out.println("App is shutting down...");
                break;
            default:
                System.out.println("Invalid option. Please select a valid choice.");
        }
    }

    public void turnOnAll() {
        light.On();
        tv.On();
        ac.On();
    }

    public void turnOffAll() {
        light.Off();
        tv.Off();
        ac.Off();
    }
}
