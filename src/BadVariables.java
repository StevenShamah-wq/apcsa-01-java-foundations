/**
 * Exercise 9 — Fix the Declarations
 *
 * SIX of the lines below are broken. Find them, fix them,
 * and add a comment on each fixed line saying what was wrong.
 *
 * One of them compiles fine but is still a bad idea. Find that one too.
 */
public class BadVariables {
    public static void main(String[] args) {

        int secondPlace = 5;    //Identififiers cannot being with a number

        double price = 9.99;    //double values must be numeric

        boolean isReady = true;   //boolean cant be in quotattions

        char grade = 'A';   //char must have a single quotation

        int gradeLevel = 11;    //class is a reserved java key word

        String name = "Sarah";  //variables start with lower case

        int studentScore = 95;  //all variables are single connected

        System.out.println("If this runs, you fixed them all.");
    }
}
