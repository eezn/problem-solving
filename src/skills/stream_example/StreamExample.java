package skills.stream_example;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String[] args) {

        List<String> numerics = Arrays.asList("1", "2", "3");

        for (String val : numerics){
            System.out.println(val);
        }

        // forEach
        numerics.stream().forEach(val -> {System.out.println(val);});
        numerics.stream().forEach(val -> System.out.println(val));
        numerics.stream().forEach(System.out::println);
        numerics.forEach(System.out::println);

        List<String> newNumerics = new ArrayList<>();
        numerics.stream().forEach(val -> newNumerics.add(val));

        // filter
        Optional<String> findNumeric = numerics.stream().filter(val -> val == "1").findAny();
        findNumeric = numerics.stream().filter(val -> Objects.equals(val, "1")).findAny();
        System.out.println(findNumeric.get());

        numerics.stream().filter(val -> Objects.equals(val, "1")).forEach(System.out::println);

        List<String> numerics2 = Arrays.asList("1", "2", "1", "3", "1");
        List<String> findNumeric2 = numerics2.stream()
                .filter(val -> Objects.equals(val, "1"))
                .collect(Collectors.toList());
        System.out.println(findNumeric2);

        List<Student> students = new ArrayList<>();
        Student a = new Student();
        Student b = new Student();

        a.setName("jin-lee");
        a.setAge("32");
        b.setName("minkang");
        b.setAge("33");
        students.add(a);
        students.add(b);

        students.stream().forEach(student -> System.out.println(student.toString()));
    }
}
