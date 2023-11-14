package BONUS;


public class Ifelse {
    public static void main(String[] args) {
        // aanroep van de evenChecker
        evenChecker(16);

        // aanroep van de grader met verschillende inputs.
        for (double i = 0; i <= 11; i+=0.5) {
            System.out.println("Het cijfer " + i +" staat gelijk aan de letter " +grader(i));
        }

        // aanroep van de max methode
        int a = 5;
        int b = 10;
        System.out.println("Het max van "+a+" en "+b+" is "+ max(5, 10));

        // aanroep van de positivityCheck
        positivityCheck(0);
        positivityCheck(1);
        positivityCheck(-1);

        // aanroep van de ageCheck met inputs van verschillende edge-cases.
        int[] ages = {1, 9, 10, 11, 17, 18, 19, 30, 64, 65, 66, 100};
        for (int i : ages){
            ageCheck(i);
        }

        // aanroep van de textLengthCheck
        textLengthCheck("123456789");
        textLengthCheck("1234567890");
        textLengthCheck("12345678910");
        textLengthCheck("123456789 =!twintig");
        textLengthCheck("123456789 = twintig!");
        textLengthCheck("Deze tekst is ruim langer dan twintig karakters");

        // aanroep van de schrikkeljaarCheck
        schrikkeljaarCheck(2023);
        schrikkeljaarCheck(100);
        schrikkeljaarCheck(400);
        schrikkeljaarCheck(2004);
        schrikkeljaarCheck(2003);

        // aanroep van de biggest methode
        biggest(1,2,3);
        biggest(3,2,1);
        biggest(1,3,2);
        biggest(3,1,2);
        biggest(2,1,3);
        biggest(2,3,1);

        // aanroep triangle
        triangle(3,3,3); //gelijkzijdig
        triangle(3,2,2); //gelijkbenig
        triangle(2,2,3); //gelijkbenig
        triangle(2,3,2); //gelijkbenig
        triangle(1,2,3); //ongelijkzijdig

        // aanroep van de calculator methode
        calculator(1,2,'+');
        calculator(1,2,'-');
        calculator(5,5,'*');
        calculator(2,3,'x');
        calculator(6,3,'/');
        calculator(5,3,'/');
        calculator(5,0,'/');
        calculator(3,3,'d');



    }


    // Opdracht 1
    // Deze methode returned een boolean, maar je mag ook void returnen en enkel de tekst printen in de methode.
    public static boolean evenChecker(int getal){
        /*
            Voor een even-check gebruik je de modulo operator
            (c = a % b).
            Hier is c het aantal stukjes dat je overhoud als je een taart van a stukjes eerlijk verdeelt over b mensen.
            9%3=0 (een taart van 9 stukjes verdeelt over 3 mensen gaat perfect)
            9%4=1 (als je een taart van 9 stukjes over 4 mensen verdeelt, krijgt iedereen 2 stukjes en hou je 1 stukje over (voor de hond))
        */
        boolean even = getal%2==0;
        if(even){
            System.out.println("Het getal is even");
        } else {
            System.out.println("Het getal is oneven");
        }
        return even;
    }


    // Opdracht 2
    public static char grader(double cijfer){
        // Deze methode returned 'X' voor een ongeldige input
        // Je mag deze methode ook preciezer implementeren met - en + achter de letters.
       if(cijfer < 5.5){
           return 'F';
       } else if (cijfer < 6){
           return 'D';
       } else if (cijfer < 7){
           return 'C';
       } else if (cijfer < 9) {
           return 'B';
       } else if(cijfer > 10){
           return 'X';
       } else {
           return 'A';
       }
    }

    // Opdracht 3
    public static Integer max(Integer a, Integer b){
        if(a>b){
            return a;
        } else {
            return b;
        }
        // alternatieven:

        /* ternary operator:
        return a>b?a:b;
        */

        /* gebruik een utility methode, want je hoeft niet het wiel opnieuw uit te vinden:
        return Integer.max(a,b);

        return Math.max(a,b);
        */

    }

    // Opdracht 4
    public static void positivityCheck(Integer number){

        if (number > 0){
            System.out.println("Nummer " + number + " is positief" );
        } else if (number < 0) {
            System.out.println("Nummer " + number + " is negatief" );
        } else {
            System.out.println("Nummer " + number + " is nul" );
        }

    }

    // Opdracht 5
    public static void ageCheck(int age){
        String check = "senior"; // Dit is onze default waarde, dus hebben we geen else-branch nodig.

        if(age < 10){ // Je hoeft hier niet exact dezelfde leeftijdsgrenzen gekozen te hebben.
            check = "kind";
        } else if (age < 18){
            check = "puber";
        } else if (age < 65){
            check = "volwassene";
        }

        System.out.println("Deze persoon is een " + check);
    }

    // Opdracht 6
    public static void textLengthCheck(String text){
        int length = text.length();
        String check = "lang";
        if (length < 10){
            check = "kort";
        } else if (length < 20){
            check = "middellang";
        }

        System.out.println("De tekst is "+check);
    }


    //Opdracht 7
    public static void schrikkeljaarCheck(int jaar){
        /*
        Het is een schrikkeljaar wanneer deze deelbaar is door 4, maar een eeuwjaar (100 jaar) die deelbaar is door 4 weer niet, met uitzondering dat deze wel deelbaar is door 400. bron: https://berekenenonline.nl/schrikkeljaar/
         */
        String check = "geen schrikkeljaar";

        if(jaar % 4 == 0){
            // schrikkeljaar
            check = "een schrikkeljaar";
            if (jaar%100 == 0){
                //geen schrikkeljaar
                check = "geen schrikkeljaar";
                if(jaar%400==0){
                    // wel een schrikkeljaar
                    check = "een schrikkeljaar";
                }
            }
        }

        System.out.println("Het jaar " + jaar + " is " + check);

    }

    // Opdracht 8
    public static void biggest (int a, int b, int c){
        int biggest = a;
        if(b > biggest){
            biggest = b;
        }
        if(c > biggest){
            biggest = c;
        }
        System.out.printf("Het grootste getal van %d, %d en %d is %d \n", a,b,c,biggest);
    }

    public static void triangle (int a, int b, int c){
        if(a==b && b==c){
            System.out.println("Dit is een gelijkzijdige driehoek");
        } else if (a==b || a==c || b==c){
            System.out.println("Dit is een gelijkbenige driehoek");
        } else {
            System.out.println("Dit is een ongelijkzijdige driehoek");
        }
    }

    public static void calculator (int a, int b, char operator){
        // Dit kan natuurlijk ook met if/else statements
           try {    // Delen door 0 geeft een error, een ArithmaticException.
                    // Om te zorgen dat de applicatie dan niet meteen crasht, kun je dat afvangen door de overtredende code in een try/catch blok te zetten.
                    // Comment regel 225, 239, 240 en 241 maar eens uit en kijk wat er gebeurt.
               Integer antwoord = switch (operator) {
                   case '+' -> a + b;
                   case '-' -> a - b;
                   case '*', 'x', 'X' -> a * b;
                   case '/', '\\' -> a / b;
                   default -> {
                       System.out.println("De operator " + operator + " is geen geldige operator");
                       yield null; /* yield is om te returnen uit een switch zonder meteen de complete methode te returnen */
                   }
               };
               System.out.printf("%d%s%d=%d\n", a, operator, b, antwoord);
           } catch (ArithmeticException e){
               System.out.println("Deze berekening is niet geldig");
           }
    }
}
