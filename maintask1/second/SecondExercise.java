package maintask1.second;

import java.util.Scanner;

public class SecondExercise {

    private static long weightTransferFromKgtoMilligrams(int weightInKg){

        return (long)weightInKg*1_000_000;
    }

    private static int weightTransferFromKgtoGrams(int weightInKg){

        return weightInKg*1_000;
    }

    private static double weightTransferFromKgtoTons(int weightInKg){

        return (double)weightInKg/1000;
    }

    public static void main(String[] args) {
        int weightInKg;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите массу динозавра в килограммах и нажмите кнопку <Enter>: ");
        weightInKg = scan.nextInt();
        System.out.println("Вес в миллиграммах: "+weightTransferFromKgtoMilligrams(weightInKg));
        System.out.println("Вес в граммах: "+weightTransferFromKgtoGrams(weightInKg));
        System.out.println("Вес в тоннах: "+weightTransferFromKgtoTons(weightInKg));
    }
}
