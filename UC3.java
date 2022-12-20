import java.util.*;
import java.lang.Math;


public class UC3 {

    /**
     * @author Namratha
     * Declaring variables has double
     * taking input from user x & y
     * calculating length of line using formula
     * Printing length of line value
     */


    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        double x1, x2, y1, y2, Line1, Line2;    //Declaration

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of x1");

        x1 = scan.nextDouble();   //Taking input from user x & y
        System.out.println("Enter the value of x2");
        x2 = scan.nextDouble();
        System.out.println("Enter the value of y1");
        y1 = scan.nextDouble();
        System.out.println("Enter the value of y2");
        y2 = scan.nextDouble();
        Line1 = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.println(Line1);


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
        Line2 = Math.sqrt((Math.pow((x2 - x1), 2)) + (Math.pow((y2 - y1), 2)));
        System.out.println(Line2);

        /**
         * comparing line1 and line2
         * and displaying weather both lines equal, greater or lesser
         */

        if (Double.compare(Line1, Line2) == 0) {

            System.out.println("Lines are equal");
        } else if (Double.compare(Line1, Line2) > 0) {
            System.out.println("Line1 is greater than Line2");
        } else {
            System.out.println("Line2 is greater than Line1");
        }

    }
}