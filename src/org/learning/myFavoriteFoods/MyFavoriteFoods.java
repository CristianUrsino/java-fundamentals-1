package org.learning.myFavoriteFoods;

import java.util.Arrays;

public class MyFavoriteFoods {
    public static void main(String[] args) {
        //inizializzo array
        final String[] MY_FAVORITE_FOODS = {"Hamburger","Pizza","Carbonara","Cannolo siciliano", "Babà", "Cacio e pepe"};
        //stampo la lunghezza dell'array
        System.out.println("foods on the list: " + MY_FAVORITE_FOODS.length);
        //stampo il primo tra i cibi preferiti
        System.out.println("My favorite food: " + MY_FAVORITE_FOODS[0]);
        //stampo l'ultimo tra i cibi preferiti
        System.out.println("Last of my favorite food: " + MY_FAVORITE_FOODS[MY_FAVORITE_FOODS.length-1]);
        //stampo il centrale tra i cibi preferiti (circa, se pari per eccesso)
        System.out.println("central of my favorite food: " + MY_FAVORITE_FOODS[MY_FAVORITE_FOODS.length/2]);
    }
}
