public class SecondLargest {
    public static void main(String[] args) {
        int[] a = {20, 64, 31, 42, 55, 15};
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }
        System.out.println("Second-Highest number of the array is: " + a[1]);
    }
}
