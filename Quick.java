import java.util.Arrays;
import java.util.Random;
import java.lang.Math;

public class Quick {

    public static int quickselect(int[] data, int k) {
        return quickselectH(data, k, 0, data.length - 1);
    }

    private static int quickselectH(int[] data, int k, int start, int end) {
        int ans = partition(data, start, end);
        while (ans != k) {
            if (ans < k) { //case when you undershoot
                start = ans + 1;
                ans = partition(data, start, end);
            } else { //case when you overshoot
                end = ans - 1;
                ans = partition(data, start, end);
            }
        }
        return data[ans];
    }

    public static void quicksort(int[] data) {
        quicksortH(data, 0, data.length - 1);
    }

    private static void quicksortH(int[] data, int start, int end) {
        if (start < end) {
            int ans = partition(data, start, end);
            quicksortH(data, start, ans - 1);
            quicksortH(data, ans + 1, end);
        }
    }

    private static int partition(int[] data, int start, int end) {
        Random gen = new Random();
        int pivotIdx = median(data, start, end);
        int pivot = data[pivotIdx];
        data[pivotIdx] = data[start];
        data[start] = pivot;
        int i = start; //records the value to be returned (will be changed as I go through algorithm)
        int j = end; //records the index of the greater than
        while (i < j) {
            int temp = data[i];
            if (temp < pivot || i == start) { //if you find something less, do nothing
                i++; //adds one to the thing you return\
            } else if (temp > pivot) { //if you find something more, move it to the end
                data[i] = data[j];
                data[j] = temp;
                j--;
            } else { //when you find something equal
                int place = Math.abs(gen.nextInt()) % 2;
                if (place == 0) {
                    i++;
                } else {
                    data[i] = data[j];
                    data[j] = temp;
                    j--;
                }
            }
        }
        if (data[i] > pivot) {
            i--;
        }
        data[start] = data[i];
        data[i] = pivot; //puts the pivot in the right position
        return i;
    }

    private static int median(int[] data, int start, int end) {
        int middle = (start + end) / 2;
        if ((data[start] <= data[end] && data[start] >= data[middle]) || (data[start] >= data[end] && data[start] <= data[middle])) {
            return start;
        } else if ((data[middle] <= data[end] && data[middle] >= data[start]) || (data[middle] >= data[end] && data[middle] <= data[start])) {
            return middle;
        } else {
            return end;
        }
    }

    public static int[] partitionDutch(int[] data, int start, int end) {
        Random gen = new Random();
        int pivotIdx = median(data, start, end);
        int pivot = data[pivotIdx];
        data[pivotIdx] = data[start];
        data[start] = pivot;
        int lt = start; //records the value to be returned (will be changed as I go through algorithm)
        int i = start; //records the duplicates
        int gt = end; //records the index of the greater than
        while (i < gt) {
            int temp = data[i];
            if (temp == pivot) {
                i++;
            }
        }
        int[] ans = {};
        return ans;//TEMP
    }
}
