package education.listIssues;

/**
 * Created with IntelliJ IDEA.
 * User: solomin-y
 * Date: 7/20/15
 * Time: 2:21 PM

 */
public class ArraysIssues {

    public static void main(String[] args) {
        //int[] array = new int[] {1, 12, 3, 11, 90, 21, 11, 22, 33, 0, -9};
        int[] array = new int[] {10, 10, 10, 1, 2, 3, 20, 20, 20, 0, 1, 2, 3};
        array = sortArray(array);
        for (int i=0 ; i< array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public <T> T[] sortArray(T[] array) {
        return null;
    }

    public static int[] sortArray(int[] source) {
        for (int i=0; i< source.length-1; i++) {
            for (int j=i+1; j< source.length; j++) {
                if (source[j]> source[i]) {
                    int k = source[i];
                    source[i] = source[j];
                    source[j] = k;
                }
            }
        }
        return source;
    }
}
