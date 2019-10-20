import javax.swing.*;
import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args){
        System.out.println("Программа перевода числел в 2 и 16 СС");
        System.out.println("В какую СС вы хотите перевести? (0 - ->2; 1 - ->16)?");
        Scanner in = new Scanner(System.in);
        int choose = in.nextInt();
        StringBuffer str = new StringBuffer();
        int b;

        if (choose == 0) {
            System.out.println("Выбран перевод в двоичную СС, введите число: ");
            int a = in.nextInt();
            System.out.println(str);
            do {
                int c = a % 2;
                str.append(c);
                b = a / 2;
                a = b;
            } while (b != 0);
            str = new StringBuffer(str).reverse();
            System.out.println(str);
        }
        else {
            System.out.println("Выбран перевод в шестнадцатеричную СС, введите число: ");
            int x = in.nextInt();
            do {
                int c = x % 16;
                if (c == 10) str.append("A");
                else if (c == 11) str.append("B");
                else if (c == 12) str.append("C");
                else if (c == 13) str.append("D");
                else if (c == 14) str.append("E");
                else if (c == 15) str.append("F");
                else str.append(c);
                b = x / 16;
                x = b;
            } while (b != 0);
            str = new StringBuffer(str).reverse();
            System.out.println(str);

        }









    }
}
