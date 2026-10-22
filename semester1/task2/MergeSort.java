
import java.util.ArrayList;
import java.util.List;

public class MergeSort implements Sorting<Integer> {

    private void slice(List<Integer> nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int middle = (start + end) / 2;

        slice(nums, start, middle);
        slice(nums, middle + 1, end);

        merge(nums, start, middle, end);
    }

    private void merge(List<Integer> nums, int start, int middle, int end) {
        List<Integer> temp = new ArrayList<>();

        int left = start;
        int right = middle + 1;

        while (left <= middle && right <= end) {
            if (nums.get(left) <= nums.get(right)) {
                temp.add(nums.get(left));
                left++;
            } else {
                temp.add(nums.get(right));
                right++;
            }
        }

        while (left <= middle) {
            temp.add(nums.get(left));
            left++;
        }

        while (right <= end) {
            temp.add(nums.get(right));
            right++;
        }

        for (int i = 0; i < temp.size(); i++) {
            nums.set(start + i, temp.get(i));
        }
    }

    @Override
    public void sort(List<Integer> nums) {
        slice(nums, 0, nums.size() - 1);
    }
}
