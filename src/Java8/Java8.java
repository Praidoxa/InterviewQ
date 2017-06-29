package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by praidoxa on 19.05.17.
 */
public class Java8 {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
//get list of unique squares
        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        squaresList.forEach(System.out::println);


        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
//get count of empty string
        List<String> list = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("Result: " + list);

        String str=null;
        Optional<String> str1 = Optional.ofNullable(str);
        String out = str1.orElse("lklkl");
        System.out.println(out);
        str1.ifPresent(System.out::println);

    }
}
