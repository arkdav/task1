package maintask2.second;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        int age;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите возраст дракона: ");
        age = scan.nextInt();
        int headsAmount=amountHeads(age);
        if (headsAmount==0){
            System.out.println("Неправильный возраст.");
        }
        else{
            System.out.println("Голов:"+headsAmount+"\nГлаз:"+headsAmount*2);
        }
    }

    private static int amountHeads(int n){
        int headsAmount;
        if(n>0 && n<=200){
            headsAmount=3*(n+1);
        }
        else if(n>200 && n<=300){
            headsAmount=203*3+(n-200)*2;
        }
        else if(n>300){
            headsAmount=203*3+100*2+(n-300);
        }
        else{
            return 0;
        }
        return headsAmount;
    }
}
