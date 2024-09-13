package Java;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Demo {
  public static <T> void main(String args[]) {
    List<Integer> nums = Arrays.asList(1, 4, 2, 6, 7);

    // Function<Integer, Integer> func = n -> n * 2;

    // int result = nums.stream()
    //     .filter(n -> n % 2 == 0)
    //     .map(func)
    //     .reduce(0, (c, e) -> c + e);

    Stream<Integer> sortedValues = nums.stream().filter(n -> n % 2 == 0).sorted();

    sortedValues.forEach(n -> System.out.println(n));
  }
}
