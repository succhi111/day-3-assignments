public class LargestArray {
    public static void main(String[] args) {
        int[] arr = {25, 38, 54, 21, 47};
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest number is: " + largest);
    }
}
