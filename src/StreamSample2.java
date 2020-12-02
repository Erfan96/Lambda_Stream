import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamSample2 {
    public static void main(String[] args) {
        List<Person> list = Arrays.asList(
        new Person(3, "Ali"),
        new Person(4, "Amir"),
        new Person(4, "Reza"),
        new Person(5, "Hatef"),
        new Person(6, "Mehran"),
        new Person(6, "Davood"),
        new Person(6, "Mohsen"),
        new Person(7, "Mojtaba"),
        new Person(8, "Mohammad")
        );

        Map<Integer, Long> result = list.stream()
                .collect(Collectors.groupingBy(Person::displayPerson, Collectors.counting()));

        System.out.println(result);
    }

    public static class Person{
        private int length;
        private String name;

        public Person(int length, String name){
            setLength(length);
            setName(name);
        }

       public int displayPerson(){
            System.out.println(getLength() + " " + getName());
            return length;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
