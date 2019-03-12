import java.util.Arrays;

public class Quick {

    public static int quickselect(int[] data, int k) {
        return quickH(data, k, 0, data.length - 1);
    }

    public static int quickH(int[] data, int k, int start, int end) { //TEMP MAKE PRIVATE LATER
        /*if (start == k || end == k) { //base case when you have narrowed down everything
            return data[k];
        } else {*/
        int pivot = data[start];
        int pivotIdx = start; //records the value to be returned (will be changed as I go through algorithm)
        System.out.println(Arrays.toString(data) + ", " + pivotIdx + ", " + pivot);
        for (int i = start + 1; i <= end; i++) {
            int temp = data[i];
            System.out.println(Arrays.toString(data) + ", " + pivotIdx + ", " + pivot);
            if (temp < pivot) { //if you find something less, switch with the k's value and then add one to k
                System.out.println(Arrays.toString(data) + ", " + pivotIdx + ", " + pivot);
                pivotIdx++;
                data[i] = data[pivotIdx];
                data[pivotIdx] = temp; //switches the small with the right-most value
            }
        }
        System.out.println(Arrays.toString(data) + ", " + pivotIdx + ", " + pivot);
        data[start] = data[pivotIdx];
        data[pivotIdx] = pivot; //puts the pivot in the right position
        System.out.println(Arrays.toString(data) + ", " + pivotIdx + ", " + pivot);
        if (pivotIdx > k) { //if you overshoot, you look at the left side
            return quickH(data, k, start, pivotIdx);
        } else if (pivotIdx < k) { //if you undershoot, you look at the right side
            return quickH(data, k, pivotIdx, end);
        } else {
            return pivot;
        }
        //}
    }
}
