import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;


public class ServiceImpl implements Service {
    private List<Student>students = new ArrayList<>();
    @Override
    public String createDB(List<Student> students) {
        this.students.addAll(students);
        return null;
    }
    public void filterA() {
        students.stream().filter(student -> student.getName().startsWith("A")).forEach(System.out::println);
    }

    public void filterAge() {
        students.stream().filter(x -> x.getAge() >= 15 & x.getPrice() >= 2000).forEach(System.out::println);
    }

    public void filterPrice() {
        students.stream().max(Comparator.comparing(Student::getPrice)).ifPresent(System.out::println);
    }

    public void filterPriceGirl() {
        System.out.println(students.stream().filter(x -> x.getGender().equals(Gender.FEMALE)).max(Comparator.comparing(Student::getPrice)));
    }

    public void filterName() {
        students.stream().map(Student::getName).forEach(System.out::println);
    }

    public void filterPriceName() {
        students.stream().map(x -> x.getPrice() + 1000).forEach(System.out::println);
    }

    public void filterNameA() {
        System.out.println(students.stream().findFirst());
    }

    public long filterL() {
        return students.size();
    }

    public Map<Gender, List<Student>> filterGroup() {
        return students.stream().collect(Collectors.groupingBy(Student::getGender));
    }

}
