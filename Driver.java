import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;

public class Driver {
    public static boolean test(int[] data, int k, int ans) {
        int less = 0;
        int same = 0;
        int greater = 0;
        for (int i = 0; i < data.length; i++) {
            
        }
    }
    public static void main(String[] args) {
        Random gen = new Random();
        ArrayList<Integer> wrong = new ArrayList<Integer>(); //this is the list of things you got wrong
        for (int i = 0; i < 1000; i++) { //i is the size
            int[] test = new int[i];
            for (int j = 0; j < test.length; j++) { //fills the array
                test[j] = gen.nextInt();
            }
            int k = Math.abs(gen.nextInt()) % i;
            int ans = Quick.quickselect(test, k);
        }
    }
}
