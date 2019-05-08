package maintask1.firstexerciseold.runner;


import maintask1.firstexerciseold.action.NumberAction;
import maintask1.firstexerciseold.creator.NumbersCreator;

public class Runner {
    public static void main(String[] args) {
       NumbersCreator numbers=new NumbersCreator();
       numbers.setFirstNumber(4);
       numbers.setSecondNumber(3);
       numbers.setThirdNumber(5);
       NumberAction action=new NumberAction();
       action.numbersCompare(numbers.getFirstNumber(),numbers.getSecondNumber(),numbers.getThirdNumber());
    }
}
