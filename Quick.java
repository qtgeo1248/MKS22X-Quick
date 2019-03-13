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

    public static void quicksortH(int[] data, int start, int end) {
        int ans = partition(data, start, end);
        if (start < end) {
            quicksortH(data, start, ans - 1);
            quicksortH(data, ans + 1, end);
        }
    }

    public static int partition(int[] data, int start, int end) {
        Random gen = new Random();
        if (data.length == 0) {
            return 0;
        }
        int pivotIdx = median(data, start, end);
        int pivot = data[pivotIdx];
        data[pivotIdx] = data[start];
        data[start] = pivot;
        int i = start; //records the value to be returned (will be changed as I go through algorithm)
        int j = end; //records the index of the greater than
        System.out.println("a" + pivot + ", " + i + ", " + j + Arrays.toString(data));
        while (i != j) {
            int temp = data[i];
            if (temp < pivot) { //if you find something less, do nothing
                i++; //adds one to the thing you return\
                System.out.println("b" + pivot + ", " + i + ", " + j + Arrays.toString(data));
            } else if (temp > pivot) { //if you find something more, move it to the end
                data[i] = data[j];
                data[j] = temp;
                j--;
                System.out.println("c" + pivot + ", " + i + ", " + j + Arrays.toString(data));
            } else { //when you find something equal
                int place = Math.abs(gen.nextInt()) % 2;
                if (place == 0) {
                    i++;
                    System.out.println("d" + pivot + ", " + i + ", " + j + Arrays.toString(data));
                } else {
                    data[i] = data[j];
                    data[j] = temp;
                    j--;
                    System.out.println("e" + pivot + ", " + i + ", " + j + Arrays.toString(data));
                }
            }
        }
        if (data[i] > pivot) {
            i--;
        }
        data[start] = data[j];
        data[j] = pivot; //puts the pivot in the right position
        System.out.println("f" + pivot + ", " + i + ", " + j + Arrays.toString(data));
        return i;
    }

    public static int median(int[] data, int start, int end) {
        int middle = (start + end) / 2;
        if ((data[start] <= data[end] && data[start] >= data[middle]) || (data[start] >= data[end] && data[start] <= data[middle])) {
            return start;
        } else if ((data[middle] <= data[end] && data[middle] >= data[start]) || (data[middle] >= data[end] && data[middle] <= data[start])) {
            return middle;
        } else {
            return end;
        }
    }
}
