package main.task1;

import java.util.Scanner;

import static java.lang.System.in;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
       naturalNamb(scanner.nextInt());

    }

    public static void naturalNamb(int a) {

        int result = a;
        for (int i = a; i > 0; i--) {
            if (a <= 0) {
                System.out.println("");
            } else {
                result = a--;
            }
            System.out.println(result);
        }


    }


}
