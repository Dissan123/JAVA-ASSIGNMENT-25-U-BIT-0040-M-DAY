import java.util.Scanner;

public class BodaFareCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double BASE_FARE = 5000;
        final double RATE_PER_KM = 1000;
        double totalFare;


        System.out.println("Enter Distance: ");
        double distance = input.nextDouble();

        totalFare = BASE_FARE + (RATE_PER_KM * distance);

        System.out.println("Your Total Fare for "+ distance + "kms" +" is UGX " + totalFare);

        


        
    }
}
