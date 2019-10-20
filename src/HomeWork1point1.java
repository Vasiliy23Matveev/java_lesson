import java.util.Arrays;
/* 2. Дан массив целых чисел. Массив не отсортирован, числа могут повторяться. Необходимо найти
    в данном массиве такие два числа n и m, чтобы их сумма была равна 7.
    Например 2 + 5 = 7, 6 + 1 = 7, -2 + 9 = 7. */


// НИПАЛУЧИЛОСЬ
public class HomeWork1point1 {
    public static void main(String[]arg){
       int [] arr3;
        arr3 = new int[10];

        for (int i = 0; i < 9; i++) {
            int random = (int) (Math.random() * ((9 - 1) + 1)) + 1;
            arr3[i] = random;
            arr3[i] += 1;
        }
        System.out.println(Arrays.toString(arr3));
        for (int i = 0; i < 8; i++) {
            for (i = i + 1; i < arr3.length; i++) {

                arr3[i] += arr3[i+1];}
            System.out.println(Arrays.toString(arr3));







        }}





    }

