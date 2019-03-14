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
    public static void fillRandom(int[] data) { //from Theodore Wu
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
        //TESTING QUICKSORT
        //FROM THEODORE WU
        Random r = new Random(); int sucesses = 0;
		int tests = 401; System.out.println("testing array sizes 1-400 having numbers from 0-n, asking for a random smallest int. (arrays do not contain duplicates)");
		for (int i = 1; i < tests; i++) {
			int[] data = new int[i];
			int select = i <= 1 ? 0 : r.nextInt(i);
			fillRandom(data);
			//printArray(data);                                            |
			int result = Quick.quickselect(data, select); //sucess message V
			if (result == select) {
                ++sucesses;
            }//System.out.println("your array of size "+i+" sucessfully found the "+select+"th smallest one"); ++sucesses;}
			else {
				if (data.length < 40) {
                    System.out.print("final Array: ");
                    System.out.println(Arrays.toString(data));
                    System.out.println();
                }
				System.out.println("Uh Oh, your array of size "+i+" DID NOT find the "+select+"th smallest one. It returned " + result +" instead of " + select);
			}
		}
		System.out.println("******************************************");
		System.out.println("***testing with duplicates in the array***");
		tests++;
        int[] data = new int[10000];
		for (int i = 0; i < 100; i++) {
            data[i] = r.nextInt(2);
        }
        Quick.quickselect(data, 500); Quick.quickselect(data, 99);
		if (Quick.quickselect(data, 0) == 0) {
            ++sucesses;
        } //chance of this driver failing here ;)
		else {
            System.out.println("uh oh a large array of ones and zeros did not work");
        }
		System.out.println("******************************************");

		System.out.println("You have had " + sucesses + " sucesses and " + (tests-sucesses-1) + " failures.");
		System.out.println( (sucesses == tests-1 ? "CONGRATULATIONS!!!" : "Uh Oh")+" Thats " + (sucesses / (tests-1.0)) * 100 + "% sucess rate.");
		if (sucesses <= tests-100) {
            System.out.println("Yikes!!! Maybe he won't test some of those cases right?");
        } else if (sucesses < tests-1) {
            System.out.println("Maybe if you compile and run again it will work.");
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
        int[] test5 = {2, 1};
        System.out.println(Quick.quickselect(test5, 0));
        System.out.println(Arrays.toString(test5));
        int[] test4 = {-84, -66, -88, 84, 88, -97, -70, -51, 4, -20, -90, -28, 50, 18, -55, -94, -99, 81};
        System.out.println(Quick.quickselect(test4, 3));
        System.out.println(Arrays.toString(test4));
        */
    }
}
