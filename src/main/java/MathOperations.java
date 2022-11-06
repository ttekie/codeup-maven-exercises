import org.apache.commons.math3.util.Precision;

public class MathOperations {

    public static long add(long input1, long input2) {
        return input1 + input2;
    }

    public static double tip(double bill, double tip) {
        return Precision.round(bill * (tip / 100), 2);
    }

    public static int[] addOneToArray(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] += 1;
        }
        return numbers;

        // or use this code instead
//        int i = 0;
//        for(int number : numbers) {
//            numbers[i++] = number + 1;
//        }
//        return numbers;
    }



}
