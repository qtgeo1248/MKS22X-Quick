import java.util.Arrays;

public class Quick {

    public static int quickselect(int[] data, int k) {
        return quickH(data, k, 0, data.length - 1);
    }

    public static int quickH(int[] data, int k, int start, int end) {
        int ans = partition(data, start, end);
        if (ans == k) { //case when you find it
            return data[ans];
        }
    }

    private static int partition(int[] data, int start, int end) {
        int pivot = data[start];
        int i = start + 1; //records the value to be returned (will be changed as I go through algorithm)
        int j = end; //records the index of the greater than
        while (i != j) {
            int temp = data[i];
            if (temp < pivot) { //if you find something less, do nothing
                i++; //adds one to the thing you return
            } else { //if you find something more, move it to the end
                data[i] = data[j];
                data[j] = temp;
                j--;
            }
        }
        data[start] = data[i];
        data[i] = pivot; //puts the pivot in the right position
        return i;
    }
}
