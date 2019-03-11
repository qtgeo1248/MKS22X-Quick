public class Driver {
    public static boolean test(int[] data, int k) {
        for (int i = 0; i < data.length; i++) {
            if (i < k) {
                if (data[i] > data[k]) { //when the thing in the left side is wrong
                    return false;
                }
            } else if (i > k) {
                if (data[i] < data[k]) { //when the thing in the right side is wrong
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] test1 = {7, 3, 4, 10};
        System.out.println(Quick.quickselect(test1, 2));
    }
}
