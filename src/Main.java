public class Main {

    public static void main(String[] args) {
        int number = 6;
        int number1 = 4;
        int number2 = 20;
        String name = "Keesie";


        hello();
        positiveOrNegative(number);
        positiveOrNulOrNegative(number);
        sum(number1, number2);
        bartender(name);
    }

    public static void hello(){
        System.out.println("Hello, world");
    }

    public static void positiveOrNegative(int number){
        if (number > 0 ){
            System.out.println("This number is positive!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    public static void positiveOrNulOrNegative(int number){
        if (number > 0){
            System.out.println("This number is positive!");
        } else if(number == 0){
            System.out.println("This number is zero!");
        } else {
            System.out.println("This number is negative!");
        }
    }

    public static void bartender(String name){
        switch (name){
            case "Kees":
                System.out.println("Kees wants a beer");
                break;
            case "Cassie":
                System.out.println("Cassie wants a withe wine");
            case "Jack":
                System.out.println("Jack wants a coke");
            case "Nicky":
                System.out.println("Nicky wants a red wine");
        }
    }

    public static void sum(int number1, int number2){
        System.out.println(number1 + " summed with " + number2 +" = " + (number1+number2));
    }
}
