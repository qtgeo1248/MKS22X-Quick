import java.util.Random;

public class Quick {

    public static int quickselect(int[] data, int k) {
        return 0; //TEMP
    }

    public static int quickH(int[] data, int k, int start, int end) { //TEMP MAKE PRIVATE LATER
        if (start == end && start == k) { //base case when you have narrowed down everything
            return data[k];
        } else {
            Random gen = new Random();
            int pivotIdx = start + Math.abs(gen.nextInt()) % (end - start + 1);
            int pivot = data[pivotIdx];
            return 0; //TEMP
        }
    }

    public static int partition (int[] data, int start, int end) {
        Random gen = new Random();
        int k = start + Math.abs(gen.nextInt()) % (end - start + 1);
        int pivot = data[k];
        data[k] = data[0];
        data[0] = pivot; //switches the pivot and the first el
        k = 0; //records the value to be returned (will be changed as I go through algorithm)
        for (int i = 1; i < data.length; i++) {
            int temp = data[i];
            if (temp < pivot) { //if you find something less, switch with the k's value and then add one to k
                k++; //adds one to the thing you return
                data[i] = data[k];
                data[k] = temp; //switches the small with the right-most value
            }
        }
        data[0] = data[k];
        data[k] = pivot; //puts the pivot in the right position
        return k;
    }
}
