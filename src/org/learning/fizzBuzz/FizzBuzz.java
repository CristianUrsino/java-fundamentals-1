package org.learning.fizzBuzz;

public class FizzBuzz {
    public static void main(String[] args) {
        //inizializzo costanti
        final int TOTAL = 100;
        final int FIZZ = 3;
        final int BUZZ = 5;
        //itero tutti i numeri da 0 a total
        for (int i = 1; i <= TOTAL; i++) {
            if(i % FIZZ == 0 && i % BUZZ == 0){
                //multiplo sia di fizz che di buzz
                System.out.print("FizzBuzz, ");
            }else if(i % BUZZ == 0){
                //multiplo di buzz
                System.out.print("Buzz, ");
            }else if(i % FIZZ == 0){
                //multiplo di fizz
                System.out.print("Fizz, ");
            }else{
                //non è multiplo di fizz o di buzz
                System.out.print( i + ", ");
            }
        }
    }
}
