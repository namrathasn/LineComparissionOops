
import java.util.*;
import java.lang.Math;


public class UC2
{

    /**
     * @author Namratha
     * Declaring variables has double
     * taking input from user x & y
     * calculating length of line using formula
     *Printing length of line value
     */


    public static void main(String[] args)
    {

        System.out.println("Welcome to Line Comparison Computation Program");

        double x1, x2, y1, y2, LengthofLine,LengthofLine2;    //Declaration

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of x1");

        x1 = scan.nextDouble();   //Taking input from user x & y
        System.out.println("Enter the value of x2");
        x2 = scan.nextDouble();
        System.out.println("Enter the value of y1");
        y1 = scan.nextDouble();
        System.out.println("Enter the value of y2");
        y2 = scan.nextDouble();
        LengthofLine = Math.sqrt(  (Math.pow((x2-x1),2))  + (Math.pow((y2-y1),2)) );
        System.out.println(LengthofLine);


        /**
         * @author rekha
         * Declaring variables has double
         * taking input from user x & y
         * calculating length of line using formula
         *Printing 2nd length of line value
         */

        System.out.println("Enter the value of x1"); //Taking input from user x & y
        x1 = scan.nextDouble();
        System.out.println("Enter the value of x2");
        x2 = scan.nextDouble();
        System.out.println("Enter the value of y1");
        y1 = scan.nextDouble();
        System.out.println("Enter the value of y2");
        y2 = scan.nextDouble();
        LengthofLine2 = Math.sqrt(  (Math.pow((x2-x1),2))  + (Math.pow((y2-y1),2)) );
        System.out.println(LengthofLine2);

        /**
         * comparing length of line and length of line2
         * and stating weather both lines equal or not
         */

        if(LengthofLine == LengthofLine2)
        {
            System.out.println("Length of line is equal");
        }

        else
        {
            System.out.println("Length of line is not equal");

        }
    }
}