import java.util.Scanner;

public class Calculator {

    int a, b, c;
    Scanner sc = new Scanner(System.in);

    public void multiply(int a, int b){
        for (int i = 0; i < Math.abs(b); i++) {
            if (b >=0){
                c = c + a;
            }
            else {
                c = c - a;
            }

        }
        if (a <0 && b<0){
            System.out.println(Math.abs(c));
        } else {
            System.out.println(c);
        }
    }

}
