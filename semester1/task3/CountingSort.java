
import java.util.List;

public class CountingSort implements Sorting<Integer> {

    @Override
    public void sort(List<Integer> nums) {
        int[] count = new int[128];

        for (int num : nums) {
            count[num]++;
        }

        int index = 0;

        for (int value = 0; value < 128; value++) {
            for (int i = 0; i < count[value]; i++) {
                nums.set(index, value);
                index++;
            }
        }
    }
}
