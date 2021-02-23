package lesson7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        int a = 0;
        byte b = 0;
        try {
            System.out.println("Enter a = ");
            a = scanner.nextInt();
            System.out.println("Enter b = ");
            b = scanner.nextByte();
            System.out.println("Enter operation = ");
            String op = scanner.next();
            switch (op.charAt(0)) {
                case '+':
                    res = a + b;
                    break;
                case '-':
                    res = a - b;
                    break;
                case '/':
                    if (b != 0)
                        res = a / b;
                    else
                        System.out.println("Делить на ноль нельзя");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Ошибка ввода");
        } catch (ArithmeticException e) {
            System.out.println("Арифметическая ошибка");
        }
        System.out.println("Программа отработала результат = " + res);

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }
}

