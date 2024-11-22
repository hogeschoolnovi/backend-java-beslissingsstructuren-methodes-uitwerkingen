// Main class. Alle methodes worden in deze klasse gedefinieerd.
public class Main {

    // De main methode is gewoon een methode, maar wel verplicht als je je code wilt kunnen uitvoeren. Dit is de "voordeur" van je applicatie
    public static void main(String[] args) {
        // Variabele declaratie: [Type] [naam] = [waarde];
        int number = 6;         // type:int         // naam:number  // waarde:6
        int number1 = 4;        // type:int         // naam:number1 // waarde:4
        int number2 = 20;       // type:int         // naam:number2 // waarde:20
        String name = "Kees";   // type:String      // naam:name    // waarde:"Kees"

        // Methode aanroepen: [naam][parameters tussen ()-haakjes];
        hello();
        positiveOrNegative(number);
        positiveOrNulOrNegative(number);
        sum(number1, number2);
        bartender(name);
    }

    // Methode declaratie: [Acces modifier] [optionele static] [return waarde] [naam] [parameters tussen ()-haakjes] [body tussen {}-accolades]
    public static void hello() {
        System.out.println("Hello, world");
    }

    // Een methode declaratie met een parameter: [Type] [naam]
    public static void positiveOrNegative(int number) {
        // als het nummer in de parameter groter dan 0 is
        if (number > 0) {
            System.out.println("This number is positive!");
        // alle andere gevallen, dus als het nummer in de parameter kleiner of gelijk aan 0 is
        } else {
            System.out.println("This number is negative!");
        }
    }

    public static void positiveOrNulOrNegative(int number) {
        // als het nummer in de parameter groter dan 0 is
        if (number > 0) {
            System.out.println("This number is positive!");
        // als het nummer in de parameter gelijk aan 0 is
        } else if (number == 0) {
            System.out.println("This number is zero!");
        // alle andere gevallen, dus als het nummer in de parameter kleiner dan 0 is
        } else {
            System.out.println("This number is negative!");
        }
    }

    public static void bartender(String name) {
        // We maken een switch die een beslissing maakt aan de hand van de waarde van de name parameter
        switch (name) {
            // als de waarde "Kees" is
            case "Kees":
                System.out.println("Kees wants a beer");
                break;
            // als de waarde "Cassie" is
            case "Cassie":
                System.out.println("Cassie wants a withe wine");
                break;
            // als de waarde "Jack" is
            case "Jack":
                System.out.println("Jack wants a coke");
                break;
            // als de waarde "Nicky" is
            case "Nicky":
                System.out.println("Nicky wants a red wine");
                break;
        }
    }

    // Een methode met 2 parameters, gescheiden door een komma.
    public static void sum(int number1, int number2) {
        // Let op hoe hier de String aan elkaar geknoopt is. Dat is concatenatie. Tip: let bij concatenatie altijd goed op de spaties.
        System.out.println(number1 + " summed with " + number2 + " = " + (number1 + number2));
    }

// Accolade sluit van de Main class
}
