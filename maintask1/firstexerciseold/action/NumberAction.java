package maintask1.firstexerciseold.action;


import maintask1.firstexerciseold.validator.NumberValidator;

public class NumberAction {
    public void numbersCompare(int a, int b, int c){
        NumberValidator validator= new NumberValidator();
        if(validator.areEqual(a, b, c)){
            System.out.println("Числа одинаковые.");
        }
        if(validator.areVarious(a, b, c)){
            System.out.println("Числа разные.");
        }
    }
}
