package org.learning.fizzBuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        //inizializzo variabili utili
        int total = 100;
        int fizz = 3;
        int buzz = 5;
        //itero tutti i numeri da 0 a total
        for (int i = 1; i <= total; i++) {
            if(i % fizz == 0 && i % buzz == fizz){
                //multiplo sia di fizz che di buzz
                System.out.print("FizzBuzz, ");
            }else if(i % buzz == 0){
                //multiplo di buzz
                System.out.print("Buzz, ");
            }else if(i % fizz == 0){
                //multiplo di fizz
                System.out.print("Fizz, ");
            }else{
                //non è multiplo di fizz o di buzz
                System.out.print( i + ", ");
            }
        }
    }
}
