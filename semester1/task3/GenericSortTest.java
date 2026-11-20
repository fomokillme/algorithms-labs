import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class GenericSortTest {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5, 2, 8, 1));
        new GenericInsertionSort<Integer>().sort(numbers);
        System.out.println(numbers);

        List<String> words = new ArrayList<>(List.of("dog", "apple", "cat"));
        new GenericInsertionSort<String>().sort(words);
        System.out.println(words);

        List<UUID> ids = new ArrayList<>(List.of(
            UUID.randomUUID(),
            UUID.randomUUID(),
            UUID.randomUUID()
        ));
        new GenericInsertionSort<UUID>().sort(ids);
        System.out.println(ids);
    }
}
