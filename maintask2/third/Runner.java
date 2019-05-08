package maintask2.third;

import java.util.Scanner;
import java.util.regex.Pattern;


public class Runner {
    private static final String REGEX_NUMBERS = "^(?ui:[аеёиоуыэюя]).*";

    private static boolean isVowelWithRegular(char a){
        String str= String.valueOf(a);
        return Pattern.matches(REGEX_NUMBERS, str);
    }

    private static boolean isVowelWithArray(char a){
        char[] vowels={'а','е','ё','и','о','у','ы','э','ю','я'};
        for(char letter:vowels){
            if(a==letter){
                return true;
            }
        }
       return false;
    }

    private static boolean isVowelWithIf(char a) {
        return (a=='а'||a=='е'||a=='ё'||a=='и'||a=='о'||a=='у'||a=='ы'||a=='э'||a=='ю'||a=='я');
    }
    private static boolean isVowelWithSwitch(char a){
        boolean isVowel = false;
        switch (a){
            case 'a': // falls through
            case 'е': // falls through
            case 'ё': // falls through
            case 'и': // falls through
            case 'о': // falls through
            case 'у': // falls through
            case 'ы': // falls through
            case 'э': // falls through
            case 'ю': // falls through
            case 'я':
                isVowel=true;
                break;
        }
        return isVowel;
    }


    public static void main(String[] args) {
        char symbol;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите букву: ");
        symbol=scan.nextLine().toLowerCase().charAt(0);
        if(isVowelWithRegular(symbol)){
            System.out.println("Введенный символ - гласная буква.");
        }
        if(isVowelWithArray(symbol)){
            System.out.println("Введенный символ - гласная буква.");
        }
        if(isVowelWithSwitch(symbol)){
            System.out.println("Введенный символ - гласная буква.");
        }
        if(isVowelWithIf(symbol)){
            System.out.println("Введенный символ - гласная буква.");
        }
    }
}
