import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        int operator;
        double n1, n2;

        System.out.println("Enter the Choice 1 - Addition 2 - Subtraction  3 - Multiply  4 - Division");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();

        System.out.println("enter the first number");
        n1 = sc.nextDouble();

        System.out.println("enter the Second number");
        n2 = sc.nextDouble();
        double result = 0;
        switch (operator) {

            case 1:
                result = n1 + n2;

                break;
            case 2:
                result = n1 - n2;
                break;

            case 3:
                result = n1 * n2;
                break;
            case 4:
                result = n1 / n2;
                break;

            default:
                System.out.println("Invalid operator");
                break;
        }

        System.out.println("Result is : " + result);
        sc.close();
    }
}