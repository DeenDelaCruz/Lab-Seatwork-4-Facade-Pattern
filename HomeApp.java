import java.util.*;

public class HomeApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        HomeService light = new Light();
        HomeService tv = new TV();
        HomeService ac = new AirConditioning();

        HomeInterface homeInt = new HomeInterface(light, tv, ac);
        
        while(true) {
            choices();
            choice = input.nextInt();
            
            homeInt.options(choice);
            

        }
    }
        private static void choices() {

            System.out.println("\nHome Control App\n");
            System.out.println("1. Turn on Light");
            System.out.println("2. Turn off Light");
            System.out.println("3. Turn on TV");
            System.out.println("4. Turn off TV");
            System.out.println("5. Turn on Air Conditioning");
            System.out.println("6. Turn off Air Conditioning");
            System.out.println("7. Turn on All");
            System.out.println("8. Turn off All");
            System.out.println("9. Exit");
            System.out.print("Select an option: ");
        
    }
}
