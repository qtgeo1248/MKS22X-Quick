import java.util.Random;

public class Quick {

    public static int quickselect(int[] data, int k) {
        return quickH(data, k, 0, data.length - 1);
    }

    public static int quickH(int[] data, int k, int start, int end) { //TEMP MAKE PRIVATE LATER
        if (start == k || end == k) { //base case when you have narrowed down everything
            return data[k];
        } else {
            Random gen = new Random();
            int pivotIdx = start + Math.abs(gen.nextInt()) % (end - start + 1);
            int pivot = data[pivotIdx];
            data[pivotIdx] = data[start];
            data[start] = pivot; //switches the pivot and the first el
            pivotIdx = start; //records the value to be returned (will be changed as I go through algorithm)
            for (int i = start + 1; i <= end; i++) {
                int temp = data[i];
                if (temp < pivot) { //if you find something less, switch with the k's value and then add one to k
                    pivotIdx++;
                    data[k] = temp; //switches the small with the right-most value
                }
            }
            data[start] = data[pivotIdx];
            data[pivotIdx] = pivot; //puts the pivot in the right position
            if (pivotIdx >= k) { //if you overshoot, you look at the left side
                return quickH(data, k, start, pivotIdx);
            } else { //if you undershoot, you look at the right side
                return quickH(data, k, pivotIdx, end);
            }
        }
    }
}
