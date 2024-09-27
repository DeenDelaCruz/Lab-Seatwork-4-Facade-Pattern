public class Light implements HomeService {
    
    @Override
    public void On() {
        System.out.println("Lights: On");
    }

    @Override
    public void Off() {
        System.out.println("Lights: Off");
    }
}
