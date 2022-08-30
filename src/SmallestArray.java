public class SmallestArray {
    public static void main(String[] args) {
        int[] arr = {21, 32, 57, 11, 42};
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("The smallest number is: " + smallest);
    }
}
