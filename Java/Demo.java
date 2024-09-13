package Java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Demo {
  public static <T> void main(String args[]) {
    List<String> names = Arrays.asList("John", "Navin", "Emily", "Dele");
    List<String> uNames = names.stream().map(String::toUpperCase).toList();

    uNames.forEach(System.out::println);
  }
}
