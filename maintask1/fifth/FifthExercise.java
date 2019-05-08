package maintask1.fifth;

import java.util.Scanner;

public class FifthExercise {

    private static void numeralArithmeticalGeometricMean(int n){
        int firstDigit=n/100000;
        int secondDigit=(n/10000)%10;
        int thirdDigit=(n/1000)%10;
        int fourthDigit=(n/100)%10;
        int fifthDigit=(n/10)%10;
        int sixthDigit=n%10;
        double arithmMean=(double)(firstDigit+secondDigit+thirdDigit+fourthDigit+fifthDigit+sixthDigit)/6;
        double geometrMean= Math.pow((double)(firstDigit*secondDigit*thirdDigit*fourthDigit*fifthDigit*sixthDigit),(double)(1/6));
        System.out.println("Cреднее арифметическое цифр числа: "+arithmMean+"\nСреднее геометрическое цифр числа: "+geometrMean);
    }

    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите шестизначное число: ");
        n = scan.nextInt();
        numeralArithmeticalGeometricMean(n);
    }
}
