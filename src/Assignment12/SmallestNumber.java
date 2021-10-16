package Assignment12;

public class SmallestNumber {
    public static void main(String[] args) {
        int[] arr = {1, 10, 2, 64};
        System.out.print(smallestAmount(arr,arr[0], 0));
    }

    public static int smallestAmount(int[] arr, int min, int i) {
        int result = arr[0];
        if (arr.length == i) {
            return min;
        } else {
            if (min >= arr[i])
                min = arr[i];
            return smallestAmount(arr, min, i + 1);
        }


    }
}
