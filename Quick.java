import java.util.Arrays;

public class Quick {

    public static int quickselect(int[] data, int k) {
        return quickH(data, k, 0, data.length - 1);
    }

    public static int quickH(int[] data, int k, int start, int end) {
        int pivot = data[start];
        int pivotIdx = start; //records the value to be returned (will be changed as I go through algorithm)
        for (int i = start + 1; i <= end; i++) {
            int temp = data[i];
            if (temp < pivot) { //if you find something less, switch with the k's value and then add one to k
                pivotIdx++;
                data[i] = data[pivotIdx];
                data[pivotIdx] = temp; //switches the small with the right-most value
            }
        }
        data[start] = data[pivotIdx];
        data[pivotIdx] = pivot; //puts the pivot in the right position
        if (pivotIdx > k) { //if you overshoot, you look at the left side
            return quickH(data, k, start, pivotIdx - 1);
        } else if (pivotIdx < k) { //if you undershoot, you look at the right side
            return quickH(data, k, pivotIdx + 1, end);
        } else {
            return pivot;
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
