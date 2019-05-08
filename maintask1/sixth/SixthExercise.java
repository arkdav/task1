package maintask1.sixth;

import java.util.Scanner;

public class SixthExercise {

        private static int numberReverse(int number) {
            int reversedNumber;
            if (number/1_000_000<10 && number/1_000_000>=1){
                reversedNumber= number/1_000_000+number/100_000%10*10+number/10_000%10*100+number/1_000%10*1_000+number/100%10*10_000+
                        number/10%10*100_000+number%10*1_000_000;
            }
            else {
                reversedNumber=-1;
            }
            return reversedNumber;
        }

        public static void main(String[] args) {
            int numberForReverse;
            Scanner scan=new Scanner(System.in);
            System.out.println("Введите семизначное число для переворота: ");
            numberForReverse= scan.nextInt();
            int reversedNumber=numberReverse(numberForReverse);
            if (reversedNumber!=-1){
                System.out.println("Реверсированное число: " + reversedNumber + ";");
            }
            else{
                System.out.println("Ваше число не семизначное. Проверьте.");
            }
        }
}
