public class RemoveElement {

    public int removeElementInplace(int[] arr, int val) {
        int left = 0;

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] != val) {
                arr[left] = arr[right];
                left++;
            }
        }

        return left;
    }
}
