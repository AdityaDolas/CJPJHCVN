import java.util.Arrays;
import java.util.List;

public class StreamLambda {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("aditya", "ayan", "kayan", "prashant");
        list.stream().forEach(e -> System.out.println(e));
        list.stream().filter(e -> e.endsWith("an")).forEach(e -> System.out.println(e));

        List<Integer> numbers = Arrays.asList(1,2,3,6,5,4,7,9,8);
        numbers.stream().filter(e->e%2==0).forEach(e-> System.out.println(e));

        int sum = numbers.stream().filter(e->e%2==1).reduce(0, (num1,num2)->num1+num2);
        System.out.println(sum);
    }
}
