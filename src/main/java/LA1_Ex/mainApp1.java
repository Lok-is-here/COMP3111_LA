package LA1_Ex;

/* COMP3111_LA\src\main\java\LA1_Ex\mainApp1.java
my Java library consists of 2 mathematical functions */

public class mainApp1 {
    public static void main(String[] args) {
        int b = 2;
        int n = 11;
        System.out.println(b+" to power "+n+" = "+ myLibrary.Power(b,n));
        System.out.println(n+"! = " + myLibrary.factorial(n));
        System.out.println("Program ..Ended …");
    }
}
