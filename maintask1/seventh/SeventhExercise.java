package maintask1.seventh;

import java.util.Scanner;

public class SeventhExercise {
    private static void numberTransposition(int a, int b){
        if(a>b){
            a = a - b;
            b = a + b;
            a = b - a;
            System.out.println("Меняем местами. Первое число: "+a+"\nВторое число: "+b);
        }
        else if(a<b){
            b=b-a;
            a=b+a;
            b=a-b;
            System.out.println("Меняем местами. Первое число: "+a+"\nВторое число: "+b);

        }
        else {
            System.out.println("Ваши числа одинаковые.");
        }
    }

    public static void main(String[] args) {
        int a;
        int b;
        Scanner scan =new Scanner(System.in);
        System.out.println("Введите первое число: ");
        a =scan.nextInt();
        System.out.println("Введите второе число: ");
        b =scan.nextInt();
        numberTransposition(a, b);
    }
}
