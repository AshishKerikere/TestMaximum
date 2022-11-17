public class MaximumTest<T extends Comparable<T>> {
    T x, y, z;

    public MaximumTest(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T maximum (){
        return MaximumTest.maximum(x, y, z);
    }

    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if(y.compareTo(max) > 0) {
            max = y;
        }
        if(z.compareTo(max) > 0) {
            max = z;
        }
        printMax(x, y, z, max);
        return max;
    }

    public static <T> void printMax(T x, T y, T z, T max){
        System.out.println("The Maximum one is = " +max);
    }

    public static void main(String[] args) {
        Integer xInt = 5, yInt = 4, zInt = 3;
        Float xFloat = 5.5f, yFloat = 4.4f, zFloat = 3.3f;
        String xStr = "Mumbai", yStr = "Bengaluru", zStr = "Chennai";

        new MaximumTest(xInt, yInt, zInt).maximum();
        new MaximumTest(xFloat, yFloat, zFloat).maximum();
        new MaximumTest(xStr, yStr, zStr).maximum();
    }
}
