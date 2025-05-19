import java.util.Scanner;

public class Problem_2{
    public static void main(String[] args) {
        int count = 0;
        int number = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        System.out.print("Input Number " + num + " odd numbers: ");
        while (count < num) {

            if (number % 2 != 0) {
                System.out.print(number);
                count++;
                if (count < num) {
                    System.out.print(", ");
                }

            }
            number++;
        }
    }
}