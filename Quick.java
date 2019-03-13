import java.util.Arrays;

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

    }

    public static void quicksortH(int[] data, int start, int end) {
        int ans = partition(data, start, end);
        if (start != end) {
            
        }
    }

    public static int partition(int[] data, int start, int end) {
        if (data.length == 0) {
            return 0;
        }
        int pivot = data[start];
        int i = start; //records the value to be returned (will be changed as I go through algorithm)
        int j = end; //records the index of the greater than
        while (i != j && i <= end) {
            int temp = data[i];
            if (temp <= pivot) { //if you find something less, do nothing
                i++; //adds one to the thing you return\
            } else { //if you find something more, move it to the end
                data[i] = data[j];
                data[j] = temp;
                j--;
            }
        }
        if (data[i] > pivot) {
            i--;
        }
        data[start] = data[i];
        data[i] = pivot; //puts the pivot in the right position
        return i;
    }
}
