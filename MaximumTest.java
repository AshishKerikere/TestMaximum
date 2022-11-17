import  java.util.Scanner;
public class MaximumTest {
    public static Float testMaximum(Float x, Float y, Float z){
        Float max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        Float xFloat = 5.5f, yFloat = 4.4f, zFloat = 3.3f;
        Float maximum = testMaximum(xFloat, yFloat, zFloat);
        System.out.println("The Largest of the Three Float is = " +maximum);
    }
}
