import java.util.Scanner;

public class Ugadayka {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в угадайку!");
        int programNum = (int) (Math.random() * ((5 - 1) + 1)) + 1;
        System.out.printf("Программа загадала число, ", programNum);
        Scanner in = new Scanner(System.in);
        int scan;
        do {
            System.out.printf("введите число!");
               scan = in.nextInt();
           if (scan == programNum) System.out.println("Все правильно, красава");
           else {
               System.out.println("Сорян, не угадал");
               if (scan > programNum) System.out.println("Ваше число слегка меньше");
               if (scan < programNum) System.out.println("Ваше число слегка больше");
           }
        } while (scan != programNum);


    }}


