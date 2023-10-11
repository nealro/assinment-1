import java.util.Scanner;



public class Main {

    public static void main(String[] args) {



        String name;

        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);

        name = scanner.nextLine();

        System.out.println("Hello there " + name);

        System.out.println("How old are you?");

        String stringAge = scanner.nextLine();

        int age = Integer.parseInt(stringAge);


        if( age >= 10 ){

            System.out.println("you are old enough to");
            System.out.println("hunt with a license");
        }
        else{
            System.out.println("you are too young for everything");
        }

        if ( age >= 12){
            System.out.println("handle a gun with a license");
        }

        if(age >= 16){
            System.out.println("drive a car with a lisence");
        }

        if(age>= 18){
            System.out.println("vote");
        }

        if(age >= 19){
            System.out.println("drink alcohol and buy lottery ");
        }

        if(age >= 21){
            System.out.println("rent a car");
            System.out.println("    ");
            System.out.println("you are old enough to handle everything that matter with age.");
        }

        if (age == 99){
            System.out.println("you can ask for a letter from the king of UK to wish you happy birthday on the day you turn 100");
        }
        if(age >=110){
            System.out.println("you can ask the King of England to write you a letter to wish you happy birthday every year from now on");
        }




    }

}