public class MaximumTest {
    public static String testMaximum(String x, String y, String z){
        String max = x;
        if(y.compareTo(max) > 0){
            max = y;
        }
        if(z.compareTo(max) > 0){
            max = z;
        }
        return max;
    }

    public static void main(String[] args) {
        String xFloat = "Mumbai", yFloat = "Bengaluru", zFloat = "Chennai";
        String maximum = testMaximum(xFloat, yFloat, zFloat);
        System.out.println("The Largest of the Three Strings is = " +maximum);
    }
}
