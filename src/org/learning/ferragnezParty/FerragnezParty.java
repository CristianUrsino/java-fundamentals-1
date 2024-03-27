package org.learning.ferragnezParty;

//imports
import java.util.Scanner;

public class FerragnezParty {
    public static void main(String[] args) {
        //inizializzo scanner
        Scanner scanner = new Scanner(System.in);
        //dichiaro le variabili
        String[] guests;
        String fullName = "";
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
        //chiedo all'utente il nome completo e lo salvo nella variabile
        do{
            //cicla finchè non è corretto
            System.out.print("your complete name: ");
            fullName = scanner.nextLine();
            if(containsNumbers(fullName) || fullName.isEmpty()){
                //se contiene numeri o è vuoto non è valido
                System.out.println("Invalid input. Please enter a valid name.");
                fullName = "";
            }
        }while(fullName.isEmpty());
        //porto tutto in minuscolo
        fullName = fullName.toLowerCase();
        //se presente nella lista entra
        int i = 0;
        while (i < guests.length && !nameInList){
            if(fullName.equals(guests[i].toLowerCase())){
                //il nome è presente nella lista (nome utente minuscolo = nome nella posizione i minuscolo)
                nameInList = true;
            }
            i++;
        }
        //output finale
        if(nameInList) System.out.println("puoi entrare");
        else System.out.println("non puoi entrare");
        //chiudo scanner
        scanner.close();
    }
    public static boolean containsNumbers(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
