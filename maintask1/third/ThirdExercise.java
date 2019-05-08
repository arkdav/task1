package maintask1.third; //CircleAction

import java.util.Scanner;

public class ThirdExercise {

    private static final double PI=3.1415;

    private static void ringArea(int r1, int r2){
        if (r1>r2){
            double ringSquare=(r1-r2)*(r1+r2)*PI;
            System.out.println("Площадт кольца: "+ringSquare);
        }
        else {
            System.out.println("Радиус r1 меньше либо равен r2.");
        }
    }
    public static void main(String[] args) {
        int r1;
        int r2;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите радиусы R1 и R2(R1>R2): ");
        r1 = scan.nextInt();
        r2=scan.nextInt();
        ringArea(r1, r2);
    }
}
