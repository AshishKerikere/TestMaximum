import  java.util.Scanner;
public class MaximumTest {
    public static Integer testMaximum(Integer x, Integer y, Integer z){
        Integer max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        Integer xInt = 5, yInt = 4, zInt = 3;
        Integer maximum = testMaximum(xInt, yInt, zInt);
        System.out.println("The Largest of the Three Integers is = " +maximum);
    }
}
