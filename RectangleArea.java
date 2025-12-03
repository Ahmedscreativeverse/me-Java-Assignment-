

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter length: ");
        intLength = input.nextInt();
        
        System.out.print("Enter width: ");
        intWidth = input.nextInt();
        
        intArea = intLength * intWidth;
        
        System.out.println("The area of the rectangle is " + intArea);
        
    }
}
