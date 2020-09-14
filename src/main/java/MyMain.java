import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = 20;
        double n2 = 0;
        while (Math.abs(n - n2) > 0.00001) {
            double m = (n + x/n) / 2;
            n2 = n;
            n= m;
        }
        return n;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        double a = 1;
        while (!(x == 1)&&!(x == 0)) {
            a = a * x;
            x = x-1;
        }
        if (x == 0){
            return 1; 
        }
        else {
            return a;
        }
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double e = 0;
        double a = 1;
        int c = 0; 
        while ((a > 0.00001)) {
            a = 1 / factorial(c);
            e = (a) + e;
            c++;
        }

        return e;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive number!");
        double num = scan.nextDouble();
        System.out.println(num);
        System.out.println("The squareroot of " + num + " is " + babylonian(num));
        System.out.println("The value of e is roughly: " + calculateE());
        scan.close();
    }
}
