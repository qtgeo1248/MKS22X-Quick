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
    public static void fillRandom(int[] data) {
        Random r = new Random();
	    int index = 0;
	    for (int i = 0; i < data.length; i++) {
            data[i] =  i; //r.nextInt(data.length); fills with random numbers
        }
        for (int i = 0; i < data.length; i++) {
            int copy = data[i];
	        int rand = r.nextInt(data.length);
	        data[i] = data[rand];
	        data[rand] = copy;
        }
    }
    public static void main(String[] args) {
        /* //TESTING QUICKSELECT
        Random gen = new Random();
        ArrayList<Integer> wrong = new ArrayList<Integer>(); //this is the list of things you got wrong
        for (int i = 1; i <= 1025; i++) { //i is the size    //1025 is 2^10+1
            System.out.println(i);
            int[] test = new int[i];
            for (int j = 0; j < test.length; j++) { //fills the array
                test[j] = gen.nextInt() % 100;
            }
            int k = Math.abs(gen.nextInt()) % i;
            System.out.println(Arrays.toString(test) + ", " + k);
            int ans = Quick.quickselect(test, k);
            //System.out.println(Arrays.toString(test));
            //System.out.println(k + ", " + ans);
            //System.out.println(test(test, k, ans));
            if (!test(test, k, ans)) {
                wrong.add(i);
            }
            System.out.println(i);
        }
        if (wrong.size() == 0) {
            System.out.println("DID ALL THINGS CORRECT\nCONGRADULATIONS YOU MAY NOW SLEEP");
        } else {
            System.out.println("Did these sizes WRONG:");
            System.out.println(wrong);
        }
        */




        /*
        int[] slow = new int[16385];
        for (int i = 0; i < slow.length; i++) {
            slow[i] = Math.abs(gen.nextInt()) % 2;
        }
        System.out.println("5000: " + Quick.quickselect(slow, 5000));
        */
        /*
        int[] test1 = {6, 2, 7, 3, 1, 3};
        System.out.println(Quick.quickselect(test1, 1));
        System.out.println(Arrays.toString(test1));
        int[] test2 = {8, 2, 6, 1, 4, 3, 7, 9, 0};
        System.out.println(Quick.quickselect(test2, 4));
        System.out.println(Arrays.toString(test2));
        int[] test3 = {3};
        System.out.println(Quick.quickselect(test3, 0));
        System.out.println(Arrays.toString(test3));
        int[] test4 = {-84, -66, -88, 84, 88, -97, -70, -51, 4, -20, -90, -28, 50, 18, -55, -94, -99, 81};
        System.out.println(Quick.quickselect(test4, 3));
        System.out.println(Arrays.toString(test4));
        */
    }
}
