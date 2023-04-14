package main.task2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int m;
        int n;
        System.out.println("Введите число M: ");
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        System.out.println("Введите число N: ");
        n = scanner.nextInt();
        sumFromMN(m, n);
    }

    public static int sumNaturalNumb(int m, int n) {
        int result = m;

        if (m == n) {
            return 0;
        } else {
            m++;
            result = m + sumNaturalNumb(m, n);

        }
        return result;
    }

    public static void sumFromMN(int m, int n) {
        System.out.println(sumNaturalNumb(m - 1, n));

    }

}
