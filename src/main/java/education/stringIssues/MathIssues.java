package education.stringIssues;

/**
 * Created with IntelliJ IDEA.
 * User: solomin-y
 * Date: 7/20/15
 * Time: 10:26 AM

 */
public class MathIssues {

    public static void main(String[] args) {
        //System.out.println(findNOK(11,165));
        System.out.println(findNOD2(66,0));
    }

    public static long findNOD(long num1, long num2) {
        long min = Math.min(num1, num2);
        long max = Math.max(num1, num2);
        long modulo = max % min;
        if (modulo == 0)
            return min;
        while (modulo > 0) {
            long nextModulo = min % modulo;
            if (nextModulo == 0)
                return modulo;
            min = modulo;
            modulo = nextModulo;
        }
        return min;
    }

    public static long findNOK(long num1, long num2) {
        return num1*num2 / findNOD(num1, num2);
    }

    public static long findNOD2(long num1, long num2) {
        long min = Math.min(num1, num2);
        long max = Math.max(num1, num2);
        long modulo = max % min;
        if (modulo == 0)
            return min;
        while (findNOD2(min, modulo) % modulo != 0) {}
        return modulo;
    }

    /*public static boolean isNumberHappy(long number) {
        if (String.valueOf(number).toCharArray().length != 6)
            throw new IllegalArgumentException("Incorrect input parameters");
        for (int i=1; i<=6; i++) {
            long rest =
        }
    } */

    /*private static int getLastNumber(long number) {
        long result = number;
        while (result > 0) {

        }
    } */
}
