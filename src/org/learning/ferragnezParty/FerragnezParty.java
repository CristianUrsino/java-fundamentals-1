package org.learning.ferragnezParty;

//imports
import java.util.Scanner;

public class FerragnezParty {
    public static void main(String[] args) {
        //inizializzo scanner
        Scanner scanner = new Scanner(System.in);
        //dichiaro le variabili
        String[] guests;
        String fullName;
        boolean nameInList = false;
        //inizializzo l'array degli invitati
        guests = new String[]{"Dua Lipa",
                "Paris Hilton",
                "Manuel Agnelli",
                "J-Ax",
                "Francesco Totti",
                "Ilary Blasi",
                "Bebe Vio",
                "Luis",
                "Pardis Zarei",
                "Martina Maccherone",
                "Rachel Zeilic"
        };
        //chiedo all'utente i nome completo e lo salvo nella variabile
        System.out.print("your complete name: ");
        fullName = scanner.nextLine();
        //se presente nella lista entra
        int i = 0;
        while (i < guests.length && !nameInList){
            if(fullName.equals(guests[i])){
                //il nome è presente nella lista
                nameInList = true;
            }
            i++;
        }
        if(nameInList) System.out.println("puoi entrare");
        else System.out.println("non puoi entrare");
        //chiudo scanner
        scanner.close();
    }
}
