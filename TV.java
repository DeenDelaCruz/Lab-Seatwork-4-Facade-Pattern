public class TV implements HomeService {
    
    @Override
    public void On() {
        System.out.println("Television: On");
    }

    @Override
    public void Off() {
        System.out.println("Television: Off");
    }
}
