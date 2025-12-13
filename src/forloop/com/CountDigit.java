package forloop.com;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        int n = Math.abs(num); // handle negative numbers
        int count = 0;

        if (n == 0) {
            count = 1; // 0 has 1 digit
        } else {
            for (int i = n; i > 0; i /= 10) {
                count++;
            }
        }

        System.out.println("Number of digits in " + num + " = " + count);
        sc.close();
    }
}
