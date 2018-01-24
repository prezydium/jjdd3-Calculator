import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        Calculator calc1 = new Calculator();
        System.out.println("Enter a: ");
        a = sc.nextInt();
        System.out.println("Enter b: ");
        b = sc.nextInt();

        calc1.multiply(a, b);


    }
}
