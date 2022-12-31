import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first binary number:");
        int first = scanner.nextInt();
        System.out.println("Input the second binary number:");
        int second = scanner.nextInt();
        int x1 =first/10000+second/10000;
        int x2 =first/1000%10+second/1000%10;
        int x3 =first/100%10+second/100%10;
        int x4 =first/10%10+second/10%10;
        int x5 =first%10+second%10;
        if (x5 > 1) {
            x5 = x5 = 0;
            x4 = x4 + 1;
        }
        if (x4 > 1) {
            x4 = x4 = 0;
            x3 = x3 + 1;
        }
        if (x3 > 1) {
            x3 = x3 = 0;
            x2 = x2 + 1;
        }
        if (x2 > 1) {
            x2 = x2 = 0;
            x1 = x1 + 1;

        }
        if (x1 > 1) {
            System.out.println("this number is bigger than possible!");
        } else {
            System.out.println("Product of two binary numbers: "+x1+""+x2+""+x3+""+x4+""+x5);

        }
    }
}
