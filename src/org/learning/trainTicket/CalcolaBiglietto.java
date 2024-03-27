package org.learning.trainTicket;

//imports
import java.util.Scanner;

public class CalcolaBiglietto {
    public static void main(String[] args) {
        //definisco lo scanner
        Scanner scanner = new Scanner(System.in);
        //definisco le variabili
        int kilometresTravel, age;
        //inizializzo le variabili tramite lo scanner
        System.out.print("how many kilometers do you have to travel: ");
        kilometresTravel = scanner.nextInt();
        System.out.print("how old are you: ");
        age = scanner.nextInt();
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
