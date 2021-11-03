import java.util.*;

public class App {
    
    
    
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        System.out.println("What is your first number?");
        
        int num1 = myObj.nextInt();
        System.out.println("What is your second number?");
        int num2 = myObj.nextInt();
    
    Add(num1, num2);{
        int sum = num1 + num2;
        System.out.println("Numbers added: " + sum);
    }

    Subtract(num1, num2);{
        int total = num1 - num2;
        System.out.println("Numbers subtracted: " + total);
    }

    Mult(num1, num2);{
        int prod = num1*num2;
        System.out.println("Product: " + prod);
    }

    Div(num1, num2);{
        int fin = num1/num2;
        System.out.println("Divided: "+ fin);
    }

    Square(num1, num2);{
        System.out.println("Squared: " + Math.pow(num1, num2));
    }

    }

    private static void Square(int num1, int num2) {
    }

    private static void Div(int num1, int num2) {
    }

    private static void Mult(int num1, int num2) {
    }

    private static void Subtract(int num1, int num2) {
    }

    private static void Add(int num1, int num2) {
    }
    
}
