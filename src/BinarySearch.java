public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int left = 0;
        int right = arr.length - 1;
        int key = 5;

        int res = binarySearch(left, right, arr, key);
        if (res == -1) {
            System.out.println("no element found");
        } else {
            System.out.println("element found at index " + res);
        }

    }


    static int binarySearch(int left, int right, int[] arr, int key) {
        while(left<=right) {

            int mid = (right-left)+left/2;

            if (arr[mid] == key) {
                return mid;
            } else if (key > arr[mid]) {
                right--;
            } else {
                left++;
            }
        }


        return -1;
    }
}


