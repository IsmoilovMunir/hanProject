package main.task3;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        while (true) {
            int m;
            int n;
            System.out.println("Введите число M: ");
            Scanner scanner = new Scanner(System.in);
            m = scanner.nextInt();
            System.out.println("Введите число N: ");
            n = scanner.nextInt();

            System.out.println("Результат = " + akkerman(m, n));
        }
    }

    public static int akkerman(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0 && m > 0) {
            return akkerman(m - 1, 1);
        } else {
            return (akkerman(m - 1, akkerman(m, n - 1)));
        }
    }


}
