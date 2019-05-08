package maintask1.firstexerciseold.validator;

public class NumberValidator {
    public boolean areEqual(int a, int b, int c){
            return (a == b && b==c);
    }
    public boolean areVarious(int a, int b, int c){
        return (a != b && b !=c && c!=a);
    }
}
