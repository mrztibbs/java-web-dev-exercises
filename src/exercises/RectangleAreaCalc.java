package exercises;
import java.util.Scanner;

public class RectangleAreaCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        double myLength = input.nextDouble();
        System.out.println("Enter the height of the rectangle: ");
        double myHeight = input.nextDouble();
        double totalArea = myLength * myHeight;
        System.out.println("The area of this rectangle is " + totalArea);
    }
}
