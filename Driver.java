import java.util.ArrayList;
import java.util.Random;
import java.lang.Math;
import java.util.Arrays;

public class Driver {
    public static boolean test(int[] data, int k, int ans) {
        int less = 0;
        int same = 0;
        int greater = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < ans) {
                less++;
            } else if (data[i] == ans) {
                same++;
            } else {
                greater++;
            }
        }
        return (less <= k) && (same + less >= k);
    }
    public static void main(String[] args) {
        /*
        Random gen = new Random();
        ArrayList<Integer> wrong = new ArrayList<Integer>(); //this is the list of things you got wrong
        for (int i = 1; i < 10; i++) { //i is the size
            int[] test = new int[i];
            for (int j = 0; j < test.length; j++) { //fills the array
                test[j] = gen.nextInt() % 100;
            }
            int k = Math.abs(gen.nextInt()) % i;
            int ans = Quick.quickselect(test, k);
            System.out.println(Arrays.toString(test));
            System.out.println(k + ", " + ans);
            System.out.println(test(test, k, ans));
        }
        */
        int[] data = {5, 2, 3, 4, 1, 0};
        System.out.println(Arrays.toString(data));
        System.out.println("3, " + Quick.quickselect(data, 3));
    }
}
