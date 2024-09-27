public class AirConditioning implements HomeService {

    @Override
    public void On() {
        System.out.println("Air Conditioning: On");
    }

    @Override
    public void Off() {
        System.out.println("Air Conditioning: Off");
    }
}
