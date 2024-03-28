package org.learning.trainTicket;

//imports
import java.util.Scanner;

public class CalcolaBiglietto {
    public static void main(String[] args) {
        //definisco lo scanner
        Scanner scanner = new Scanner(System.in);
        //definisco le costanti
        final double PRICE_PER_KM = 0.21;
        final int UNDER_AGE = 18;
        final int OVER_AGE = 65;
        //definisco le variabili
        int kilometresTravel = 0, age = 0;
        //inizializzo e verifico kilometresTravel
        do {
            //fai finchè l'utente non inserisce un numero valido
            boolean messageOfErrorKilometresTravel = false;
            try {
                System.out.print("how many kilometers do you have to travel: ");
                kilometresTravel = scanner.nextInt();
            } catch (Exception e) {
                //se l'utente non inserisce un numero
                System.out.println("Invalid input. Please enter a valid number.");
                messageOfErrorKilometresTravel = true;
                scanner.next();
            }
            //se l'utente inserisce un numero negativo (evitando il doppio messaggio di errore con un flag, in quanto se non numerico conta anche come negativo)
            if(kilometresTravel <=0 && ! messageOfErrorKilometresTravel) System.out.println("invalid input. Please enter a positive number");
        }while (kilometresTravel <= 0 );
        //inzializzo e verifico age
        do {
            //fai finchè l'utente non inserisce un numero valido
            boolean messageOfErrorAge = false;
            try {
                System.out.print("how old are you: ");
                age = scanner.nextInt();
            } catch (Exception e) {
                //se l'utente non inserisce un numero
                System.out.println("Invalid input. Please enter a valid integer.");
                messageOfErrorAge = true;
                scanner.next();
            }
            //se l'utente inserisce un numero negativo, o troppo grande (evitando il doppio messaggio di errore con un flag, in quanto se non numerico conta anche come negativo)
            if((age <=0 || age > 120) && !messageOfErrorAge) System.out.println("invalid input. Please enter a positive number, under 120");
        }while (age <= 0 );

        //calcolo il prezzo di default
        double price = kilometresTravel * PRICE_PER_KM;
        //in base all'età applico lo sconto
        if(age >= OVER_AGE) {
            //over 65 40% di sconto
            price *= 0.60;
        }else if (age <= UNDER_AGE){
            //under 18
            price *= 0.80;
        }
        //formattazione del testo ed output finale
        String formatPrice = String.format("%.2f€", price);
        System.out.println("final price: " + formatPrice);

        //chiudo lo scanner
        scanner.close();
    }
}
