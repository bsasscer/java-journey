import java.io.Console;

/*This program performs math operations on an original number, i.e. myNumber and then prints the final result to the console*/
public class MathMagic {

    public static void main(String[] args) {
        int myNumber = 7;
        int stepOne = 7 * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        System.out.println("The final number is " + stepSix + "!");
    }

}
