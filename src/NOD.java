import java.util.Scanner;

public class NOD {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Программа нахождения наибольшего общего делителя (НОД)");
        System.out.println("Введите большее число");
        int a = in.nextInt();
        System.out.println("Введите меньшее число");
        int b = in.nextInt();

        for (int c = 1; c != 0; c = a % b, a = b, b = c)
        {
        }
            System.out.println(a);








        }

    }


