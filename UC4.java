import java.util.*;
import java.lang.Math;


public class UC4 {
    /**
     * @author Namratha
     * Declaring variables has double
     * taking input from user x & y
     * calculating length of line using formula
     * Printing 2nd length of line value
     */


    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");


        Scanner scan = new Scanner(System.in);
        System.out.println("Cordinates of Line First");  //Taking input from user x & y

        int x1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y1 = scan.nextInt();
        int y2 = scan.nextInt();
        System.out.println("Cordinates for line Second");
        int x3 = scan.nextInt();
        int x4 = scan.nextInt();
        int y3 = scan.nextInt();
        int y4 = scan.nextInt();


        /** @author rekha
         * Calculation line1 and line2
         */

        UC4 line = new UC4();

        double line1 = line.length(x1, x2, y1, y2);    //Declaration
        double line2 = line.length(x3, x4, y3, y4);
        line.comparision(line1, line2);

    }

    /**
     * @author rekha
     * comparing line1 and line 2, and display weather lemgth is equal, else.
     */


    void comparision(double line1, double line2) {

        if (line1 == line2) {

            System.out.println("Lines are equal");
        } else if (line1 < line2) {
            System.out.println("Line2 is greater");
        } else {
            System.out.println("Line1 is greater");
        }

    }

    double length(int x1, int x2, int y1, int y2) {

        double length1 = (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));//calculating length
        System.out.println(Math.sqrt(length1));
        return length1;
    }
}