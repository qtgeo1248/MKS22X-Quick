import java.util.ArrayList;
import java.util.Random;

public class Driver {
    public static boolean test(int[] data, int k) {
        for (int i = 0; i < data.length; i++) {
            if (i < k) {
                if (data[i] > data[k]) { //when the thing in the left side is wrong
                    return false;
                }
            } else if (i > k) {
                if (data[i] < data[k]) { //when the thing in the right side is wrong
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Random gen = new Random();
        ArrayList<Integer> wrong = new ArrayList<Integer>(); //this is the list of things you got wrong
        for (int i = 0; i < 1000; i++) { //i is the size
            int[] test = new int[i];
            for (int j = 0; j < test.length; j++) { //fills the array
                test[j] = gen.nextInt();
            }
        }
    }
}
