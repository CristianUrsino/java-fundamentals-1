package org.learning.trainTicket;

//imports
import java.util.Scanner;

public class CalcolaBiglietto {
    public static void main(String[] args) {
        //definisco lo scanner
        Scanner scanner = new Scanner(System.in);
        //definisco le variabili
        int kilometresTravel = 0, age = 0;
        //inizializzo e verifico kilometresTravel
        do {
            boolean messageOfErrorKilometresTravel = false;
            try {
                System.out.print("how many kilometers do you have to travel: ");
                kilometresTravel = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                messageOfErrorKilometresTravel = true;
                scanner.next();
            }
            if(kilometresTravel <=0 && ! messageOfErrorKilometresTravel) System.out.println("invalid input. Please enter a positive number");
        }while (kilometresTravel <= 0 );
        //inzializzo e verifico age
        do {
            boolean messageOfErrorAge = false;
            try {
                System.out.print("how old are you: ");
                age = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                messageOfErrorAge = true;
                scanner.next();
            }
            if(age <=0 && !messageOfErrorAge) System.out.println("invalid input. Please enter a positive number");
        }while (age <= 0 );

        //calcolo il prezzo di default
        double price = (double) kilometresTravel * 0.21;
        //in base all'età applico lo sconto
        if(age >= 65) {
            //over 65 40% di sconto
            price *= 0.60;
        }else if (age <= 18){
            //under 18
            price *= 0.80;
        }
        System.out.println("final price: " + price + "€");

        //chiudo lo scanner
        scanner.close();
    }
}
