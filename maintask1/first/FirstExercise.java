package maintask1.first;

import java.util.Scanner;

public class FirstExercise {

    private static void compareNumbers(int a, int b, int c){
        if(a==b && b==c) {
            System.out.println("Три числа одинаковые.");
        }
        else if(a==b) {
            System.out.println("первое и второе число равны.");
        }
        else if(b==c) {
            System.out.println("Второе и третье число равны.");
        }
        else if(a==c){
            System.out.println("Первое и третье число равны.");
        }
        else {
            System.out.println("Все числа различные.");
        }
    }

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите три целых числа, разделяя их кнопкой <Enter>: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        compareNumbers(a, b, c);
    }

}
