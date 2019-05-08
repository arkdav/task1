package maintask1.firstexerciseold.creator;

public class NumbersCreator {
    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public void setFirstNumber(int firstNumber) {
        if (firstNumber>0) {
            this.firstNumber = firstNumber;
        }
    }
    public void setSecondNumber(int secondNumber) {
        if (secondNumber>0) {
            this.secondNumber = secondNumber;
        }
    }
    public void setThirdNumber(int thirdNumber) {
        if (thirdNumber>0) {
            this.thirdNumber = thirdNumber;
        }
    }
    public int getFirstNumber(){
        return firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public int getThirdNumber() {
        return thirdNumber;
    }
}
