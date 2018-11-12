package recursion;

/*Лаврентьева Ирина ИКБО-13-17 Вариант 5*/

import java.util.Scanner;

public class Recursion {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        System.out.println("Введите число");
        n = in.nextInt();
        int sum = sum(n,0);
        System.out.println("Сумма цифр числа = "+sum);
    }

    public static int sum(int n, int sum) {
        if (n > 0) {
            int digit = n % 10;
            n = n/10;
            sum += digit;
            return sum(n, sum);
        }
        else{
            return sum;
        }
    }


}
