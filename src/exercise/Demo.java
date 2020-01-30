/*
 * All rights Reserved, Designed By baowei
 *
 * 注意：本内容仅限于内部传阅，禁止外泄以及用于其他的商业目的
 */
package src.exercise;

/**
 * @author yan.zhang
 * @date 2019/11/19 15:43
 */
public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Demo.BinarySearch(arr, 0, arr.length - 1, 7));
//        System.out.println(Arrays.toString(arr));
    }

    private static int BinarySearch(int[] arr, int L, int R, int target) {
        if (L <= R) {
            int mid = L + ((R - L) >> 1);
            if (arr[mid] == target) return mid;
            if (arr[mid] < target) {
                return BinarySearch(arr, mid + 1, R, target);
            } else {
                return BinarySearch(arr, L, mid - 1, target);
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int low, int high, int target) {
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (target < arr[mid]) {
                high = mid - 1;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else return mid;
        }
        return -1;
    }


    private static void swap(int[] arr, int j, int i) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

    }
}

