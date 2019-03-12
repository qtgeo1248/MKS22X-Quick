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
        Random gen = new Random();
        ArrayList<Integer> wrong = new ArrayList<Integer>(); //this is the list of things you got wrong
        for (int i = 1; i <= 16385; i++) { //i is the size    //131073 is 2^14+1
            int[] test = new int[i];
            for (int j = 0; j < test.length; j++) { //fills the array
                test[j] = gen.nextInt() % 100;
            }
            int k = Math.abs(gen.nextInt()) % i;
            int ans = Quick.quickselect(test, k);
            //System.out.println(Arrays.toString(test));
            //System.out.println(k + ", " + ans);
            //System.out.println(test(test, k, ans));
            if (!test(test, k, ans)) {
                wrong.add(i);
            }
        }
        if (wrong.size() == 0) {
            System.out.println("DID ALL THINGS CORRECT\nCONGRADULATIONS YOU MAY NOW SLEEP");
        } else {
            System.out.println("Did these sizes WRONG:");
            System.out.println(wrong);
        }
        /*
        int[] slow = new int[16385];
        for (int i = 0; i < slow.length; i++) {
            slow[i] = Math.abs(gen.nextInt()) % 2;
        }
        System.out.println("5000: " + Quick.quickselect(slow, 5000));
        */
    }
}
