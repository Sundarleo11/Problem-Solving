import java.util.Arrays;

public class ArrayUtilsFull {


    private static int[] insertAtPosition(int arr[], int pos, int value) {

        //updating exiting pos
        int n = arr.length;
        //int;
        // ArrayList<Integer> result=new ArrayList<>();
        int result[] = new int[n];
        for (int i = 0, j = 0; i < n; i++) {
            if (i == pos) {
                result[i] = value;
            } else {
                result[i] = arr[j++];
            }
        }
        return result;

    }

    private static int[] insertSorted(int arr[], int value) {
        int n = arr.length;
        int result[] = new int[n + 1];
        int i = 0;
        //1,2,4,5
        //value=3
        while (i < n && arr[i] < value) {
            result[i] = arr[i];
            i++;
        }

        result[i] = value;
        for (int j = i; j < n; j++) {
            result[j + 1] = arr[j];
        }
        return result;
    }


    private static int[] updateAtIndex(int arr[], int index, int value) {
        int n = arr.length;
        if (index < n && index > 0) {
            arr[index] = value;
        }
        return arr;
    }

    private static int[] updateAllOccurrences(int arr[], int oldvalue, int newvalue) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == oldvalue) {
                arr[i] = newvalue;
            }
        }
        return arr;
    }

    private static int[] deleteAtIndex(int arr[], int index) {

        int n = arr.length;
        if (index < n && index < 0) {
            return arr;
        }

        int result[] = new int[n - 1];
        for (int i = 0, j = 0; i < n; i++) {
            if (i != index) result[j++] = arr[i];
        }
        return result;

    }


    private static int[] deleteAllOccurrences(int arr[], int value) {
        int n = arr.length;

        int count = 0;
        for (int i : arr) {
            if (i == value)
                count++;
        }

        int resize = n - count;

        int result[] = new int[resize];
        //1, 2, 2, 3, 2
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != value) result[j++] = arr[i];
        }
        return result;
    }

    private static int[] reverseArray(int arr[]) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return arr;
    }


    private static int[] rotateArray(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        reverseArrayHelper(arr, 0, n - 1);
        reverseArrayHelper(arr, k, n - 1);
        reverseArrayHelper(arr, 0, k - 1);


        return arr;
    }

    private static void reverseArrayHelper(int arr[], int start, int end) {
        // int n=arr.length;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5};
        System.out.println("Insert at position 2, value 3: " + Arrays.toString(insertAtPosition(arr1, 2, 3)));

        int[] arr2 = {1, 3, 4, 7};
        System.out.println("Insert into sorted array, value 2: " + Arrays.toString(insertSorted(arr2, 2)));

        int[] arr3 = {10, 20, 30};
        System.out.println("Update index 1 to 99: " + Arrays.toString(updateAtIndex(arr3, 1, 99)));

        int[] arr4 = {1, 2, 2, 3};
        System.out.println("Update all 2 to 5: " + Arrays.toString(updateAllOccurrences(arr4, 2, 5)));

        int[] arr5 = {1, 2, 3, 4};
        System.out.println("Delete index 2: " + Arrays.toString(deleteAtIndex(arr5, 2)));

        int[] arr6 = {1, 2, 2, 3, 2};
        System.out.println("Delete all 2: " + Arrays.toString(deleteAllOccurrences(arr6, 2)));

        int[] arr7 = {1, 2, 3, 4, 5};
        System.out.println("Reverse array: " + Arrays.toString(reverseArray(arr7)));

        //anti clock wise
        int[] arr8 = {1, 2, 3, 4, 5};
        System.out.println("Rotate array by 2: " + Arrays.toString(rotateArray(arr8, 2)));


        /*
        Insert at position 2, value 3: [1, 2, 3, 4, 5]
        Insert into sorted array, value 2: [1, 2, 3, 4, 7]
        Update index 1 to 99: [10, 99, 30]
        Update all 2 to 5: [1, 5, 5, 3]
        Delete index 2: [1, 2, 4]
        Delete all 2: [1, 3]
        Reverse array: [5, 4, 3, 2, 1]
        Rotate array by 2: [4, 5, 1, 2, 3]

         */
    }
}
