package Basic.Recursion;

public class A6_ReverseArray {
    public void reverse(int[] arr, int n,int start,int end) {

        if (start >= end) {
            return;
        }

        // swap
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // recursive call
        reverse(arr, start + 1, end - 1);
    }
}

