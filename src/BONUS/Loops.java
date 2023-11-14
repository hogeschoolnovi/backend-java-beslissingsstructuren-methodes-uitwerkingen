package BONUS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Loops {
    public static void main(String[] args) {
        // Opdracht 1
        int sum1 = 0;
        for (int i = 0; i < 100; i++){
            if(i%2==0){
                sum1+=i;
            }
        }
        System.out.println("Opdracht 1: De som van alle even getallen tussen 0 en 100 is " + sum1);

        //Opdracht 2
        ArrayList<Integer> opdracht2lijst = new ArrayList<>();
        for (int i = 1; i < 1000; i *= 2){
            opdracht2lijst.add(i);
        }
        System.out.println("Opdracht 2: De lijst met nummers  is:" + opdracht2lijst);

        //Opdracht 3
        int[] opdracht3lijst = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};
        String aanwezig = "niet aanwezig";
        for(int i : opdracht3lijst) {
            if(i==45){
                aanwezig = "aanwezig";
            }
        }
        System.out.println("Opdracht 3: Het getal 45 is in deze lijst " + aanwezig);

        //Opdracht 4
        int[] opdracht4lijst = {12, 5, 7, 2, 18, 3, 9, 12};
        int sum4 = 0;
        for (int i : opdracht4lijst){
            sum4+=i;
        }
        System.out.println("Opdracht 4: De som van alle nummers uit de lijst is " + sum4);

        //Opdracht 5:
        String[] opdracht5lijst = {"Er", "was", "eens", "een", "student", "die", "graag", "wilde", "leren", "", "Deze", "student", "haalde", "goede", "cijfers"};
        System.out.print("Opdracht 5: [");// print() geeft geen "newline" aan het eind, dus alles print op dezelfde regel.
        for (String s : opdracht5lijst){
            if(!s.isEmpty()) {
                System.out.print(s + " ");
            } else {
                break;
            }
        }
        System.out.print("]\n"); // print alsnog de "newline" (\n), want anders wordt de volgende opdracht ook op dezelfde regel geprint.

        //Opdracht 6:
        ArrayList<Integer> opdracht6lijst = new ArrayList<>();
        for (int i = 1; i < 100; i++){
            if(isPrime(i)){
                opdracht6lijst.add(i);
            }
        }
        System.out.println("Opdracht 6: Alle priemgetallen zijn " + opdracht6lijst);

        //Opdracht 7:
        int[] opdracht7lijst = {17, 92, 3, 89, 55, 86, 24, 34, 67, 76, 81, 50, 59, 30, 14, 33, 83, 87, 38, 70, 9, 78, 91, 46, 53, 64, 25, 69, 29, 84, 22, 16, 79, 40, 21, 18, 68, 75, 2, 26, 39, 8, 31, 35, 1, 63, 77, 95, 15, 58, 61, 10, 85, 93, 96, 72, 98, 5, 73, 6, 23, 56, 49, 99, 43, 41, 20, 11, 12, 74, 57, 66, 94, 36, 7, 60, 88, 4, 65, 27, 28, 82, 32, 97, 48, 62, 80, 37, 13, 54, 19, 71, 42, 44, 90, 52, 51};
        ArrayList<Integer> opdracht7antwoorden = new ArrayList<>();
        for(int i : opdracht7lijst){
            if (i>45){
                opdracht7antwoorden.add(i);
            }
        }
        System.out.println("Opdracht 7: Alle nummers boven de 45 zijn " + opdracht7antwoorden);
        ArrayList<Integer> opdracht8antwoorden = new ArrayList<>();

        //Opdracht 8:

        for(int i = 10; i >= 0; i--){
            opdracht8antwoorden.add(i);
        }
        System.out.println("Opdracht 8: De aftelnummers zijn " + opdracht8antwoorden);

        //Opdracht 9:
        int lengteVandDeLijst = 10;
        int[] opdracht9lijst = new int[lengteVandDeLijst];
        int index = 0;
        int current = 0;
        while(index < lengteVandDeLijst){

            if(index==1){
                current++;
            } else if(index!=0){
                current = opdracht9lijst[index-1] + opdracht9lijst[index-2];
            }
            opdracht9lijst[index]=current;
            index++;
        }
        System.out.println("Opdracht 9: De eerste "+lengteVandDeLijst+" nummers uit de fibonacci reeks zijn " + Arrays.toString(opdracht9lijst));

        //Opdracht 10:
        int hoeveelLagen = 10;
        String[] opdracht10lijst= new String[hoeveelLagen];
        for(int i = 0; i < hoeveelLagen; i++){
            String sterretjes = "";
            for(int j = 0; j <= hoeveelLagen-i; j++){
                sterretjes += " ";
            }
            for(int j = 0; j <= (i*2); j++){
                sterretjes += '*';
            }
            opdracht10lijst[i] = sterretjes;

        }
        //printen opdracht 10:
        System.out.println("Opdracht 10: ");
        for (String sterretjes : opdracht10lijst) {
            System.out.println(sterretjes);
        }

    }

    // prime methode van https://www.baeldung.com/java-prime-numbers
    public static boolean isPrime(int number) {
        return number > 1
                && IntStream.rangeClosed(2, (int) Math.sqrt(number))
                .noneMatch(n -> (number % n == 0));
    }
}
