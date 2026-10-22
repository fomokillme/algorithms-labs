import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentSort implements Sorting<Student> {

    private List<Student> mergeSort(List<Student> students, Comparator<Student> comparator) {
        if (students.size() <= 1) {
            return students;
        }

        int middle = students.size() / 2;
        List<Student> left = mergeSort(new ArrayList<>(students.subList(0, middle)), comparator);
        List<Student> right = mergeSort(new ArrayList<>(students.subList(middle, students.size())), comparator);
        List<Student> result = new ArrayList<>();

        int i = 0;
        int j = 0;
        while (i < left.size() && j < right.size()) {
            if (comparator.compare(left.get(i), right.get(j)) <= 0) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }
        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }
        return result;
    }

    @Override
    public void sort(List<Student> students) {
        List<Student> byAge = mergeSort(students, Comparator.comparingInt(Student::getAge));
        List<Student> byName = mergeSort(byAge, Comparator.naturalOrder());

        for (int i = 0; i < students.size(); i++) {
            students.set(i, byName.get(i));
        }
    }
}

