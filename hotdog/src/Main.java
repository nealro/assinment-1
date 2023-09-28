public class Main {
    public static void main(String[] args) {

        int x = 1; //x is number of hot dogs needed
        int y = 1; //y is number of drinks needed

        int drinks = 2;
        double hotdogs = 5.50;
        double f = 5.5*x  + 2*y;
        double t = 0.66*x + 0.24*y;

        System.out.println("numbers of hot dogs :" + y);
        System.out.println("numbers of drinks :" + x);
        System.out.println("tax :");
        System.out.println(t);
        System.out.println("total :");
        System.out.println( f+t );


    }
}