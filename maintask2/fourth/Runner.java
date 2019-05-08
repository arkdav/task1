package maintask2.fourth;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        int nextDay;
        int nextMonth;
        int nextYear;
        Scanner scan=new Scanner(System.in);
        System.out.println("Введите дату: ");
        int day = scan.nextInt();
        int month = scan.nextInt();
        int year = scan.nextInt();

        if(month==2 && (day==28 || day==29))
        {
            if(year%4==0 && year%100==0){
                if(year%400==0 && day==29){
                    nextDay=1;
                    nextMonth=month+1;
                    nextYear=year;
                }
                else{
                    nextDay=1;
                    nextMonth=month+1;
                    nextYear=year;
                }
            }
            else if( year%4==0 && day==29 ){
                nextDay = 1;
                nextMonth = month + 1;
                nextYear = year;
            }
            else{
                nextDay = day+1;
                nextMonth = month;
                nextYear = year;
            }
        }
        else if(month==12 && day==31)
        {
            nextDay=1;
            nextMonth=1;
            nextYear=year+1;
        }
        else if((month==1 || month==3 || month==5 || month==7 || month==8 ||month==10) && day==31)
        {
            nextDay=1;
            nextMonth=month+1;
            nextYear=year;
        }
        else if(( month==4 || month==6 || month==9 || month==11 ) && day==30)
        {
            nextDay=1;
            nextMonth=month+1;
            nextYear=year;
        }
        else{
            nextDay=day+1;
            nextMonth=month;
            nextYear=year;
        }
        System.out.println(nextDay+"."+nextMonth+"."+nextYear);
    }
}
