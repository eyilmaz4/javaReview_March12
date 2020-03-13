package javaReview;
import java.util.Scanner;
public class HocaTravel {
    public static void main(String[] args) {
        travelDecision();

    }
    public static void travelDecision() {
        Scanner x = new Scanner(System.in);
        String destination;
        System.out.println("Sea or Mountain");
        String answer = x.nextLine();
        if (answer.equalsIgnoreCase("Sea")) {
            System.out.println("East of west?");
            answer=x.nextLine();
            if(answer.equalsIgnoreCase("East")){
                System.out.println("Destination: Florida");
            }
            else if(answer.equalsIgnoreCase("West")){
                System.out.println("California");
            }
            else{
                System.out.println("wrong input");
            }

        }
        else if (answer.equalsIgnoreCase("Mountain")) {
            System.out.println("Midland or North?");
            answer=x.nextLine();
            if(answer.equalsIgnoreCase("Midland")){
                System.out.println("Kansas");
            }
            else if(answer.equalsIgnoreCase("North")){
                System.out.println("Vermont");
            }
            else {
                System.out.println("wrong input");
            }
        } else {
            System.out.println("wrong input");
        }
    }
}
