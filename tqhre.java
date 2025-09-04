public class tqhre {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 7, 1, 9};
        int result = linearSearch(numbers, 9);
        System.out.println(result);
    }
}
