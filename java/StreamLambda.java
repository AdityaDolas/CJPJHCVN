import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamLambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aditya", "ayan", "kayan", "prashant");
        list.stream().forEach(e -> System.out.println(e));
        list.stream().filter(e -> e.endsWith("an")).forEach(e -> System.out.println(e));

        List<Integer> numbers = Arrays.asList(1, 2, 3, 6, 5, 4, 7, 9, 8);
        numbers.stream().filter(e -> e % 2 == 0).forEach(e -> System.out.println(e));

        int sum = numbers.stream().filter(e -> e % 2 == 1).reduce(0, (num1, num2) -> num1 + num2);
        System.out.println(sum);

        numbers.stream().distinct().sorted().forEach(e -> System.out.println(e));
        numbers.stream().distinct().map(e->e*e).forEach(e-> System.out.println(e));

        IntStream.range(1,11).forEach(p-> System.out.println(p));
        IntStream.range(1,11).map(e->e*e).forEach(p-> System.out.println(p));

        list.stream().map(s->s.toUpperCase()).forEach(s-> System.out.println(s));
        list.stream().map(l->l.length()).forEach(l-> System.out.println(l));

        System.out.println("================================================");
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        int max1 = numbers.stream().max((n1,n2)->Integer.compare(n1,n2)).get();
        Optional<Integer> max2 = numbers.stream().max(Integer::compareTo);
        System.out.println(max1);
        System.out.println(max2.get());


        int min1 = numbers.stream().min((n1,n2)->Integer.compare(n1,n2)).get();
        Optional<Integer> min2 = numbers.stream().min(Integer::compareTo);
        System.out.println(min1);
        System.out.println(min2.get());

        List even = numbers.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(even);

        List square = numbers.stream().filter(e->e%2==0).map(e->e*e).collect(Collectors.toList());
        System.out.println(square);

    }
}
