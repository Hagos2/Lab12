package Assignment12;

public class SumArray {
    public static void main(String[] args) {
        int[]num={10,12,6,8,9,10};
 System.out.print(sumArray(num,num.length));
    }

    public static int sumArray(int[] num, int n) {
        if (n <= 0) {
            return 0;
        } else {
            return num[n - 1] + sumArray(num, n - 1);
        }
    }
}