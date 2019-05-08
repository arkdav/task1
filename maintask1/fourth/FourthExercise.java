package maintask1.fourth;

import java.util.Scanner;

public class FourthExercise {

    private static void numbersSequence(int n){
        int firstDigit=n/1000;
        int secondDigit=(n/100)%10;
        int thirdDigit=(n/10)%10;
        int fourthDigit=n%10;
        if(firstDigit<secondDigit && secondDigit<thirdDigit && thirdDigit<fourthDigit){
            System.out.println("Возрастающая последовательность.");
        }
        else if(firstDigit>secondDigit && secondDigit>thirdDigit && thirdDigit>fourthDigit){
            System.out.println("Убывающая последовательность.");
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите четырехзначное число: ");
        n = scan.nextInt();
        numbersSequence(n);
    }
}
