import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class RadixSort implements Sorting<BigInteger> {
    @Override
    public void sort(List<BigInteger> nums) {
        BigInteger place = BigInteger.ONE;

        for (int i = 0; i < 20; i++) {
            List<List<BigInteger>> buckets = new ArrayList<>();

            for (int j = 0; j < 10; j++) {
                buckets.add(new ArrayList<>());
            }

            for (BigInteger num : nums) {
                int digit = num.divide(place).mod(BigInteger.TEN).intValue();
                buckets.get(digit).add(num);
            }

            ListIterator<BigInteger> it = nums.listIterator();

            for (List<BigInteger> bucket : buckets) {
                for (BigInteger num : bucket) {
                    it.next();
                    it.set(num);
                }
            }

            place = place.multiply(BigInteger.TEN);
        }
    }
}
