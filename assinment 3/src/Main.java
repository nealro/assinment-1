import java.util.Scanner;



public class Main {

    public static void main(String[] args) {


        String weighte; //e stands for earth



        System.out.println("how much do you weight on Earth?");

        Scanner scanner = new Scanner(System.in);

        weighte = scanner.nextLine();

        int weightE = Integer.parseInt(weighte);

        System.out.println("what planet are you going to vist");
        System.out.println("1. Venus      2. Mars      3. Jupiter");
        System.out.println("4. Saturn     5. Uranus    6. Neptune");





        String planet;

        planet = scanner.nextLine();

        int Planet = Integer.parseInt(planet);
        

        if ( Planet == 1){

            double weight = 0.78 * weightE;
            System.out.println("You will weight "+ weight);
        }

        if ( Planet == 2){

            double weight = 0.39 * weightE;
            System.out.println("You will weight "+ weight);

        }

        if ( Planet == 3){

            double weight = 2.65 * weightE;
            System.out.println("You will weight "+ weight);

        }

        if ( Planet == 4){

            double weight = 1.17 * weightE;
            System.out.println("You will weight "+ weight);

        }

        if ( Planet == 5){

            double weight = 1.05 * weightE;
            System.out.println("You will weight "+ weight);

        }

        if ( Planet == 6){

            double weight = 1.23 * weightE;
            System.out.println("You will weight "+ weight);
        }

    }

}

