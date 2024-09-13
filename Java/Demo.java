package Java;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class Demo {
  public static <T> void main(String args[]) {
    List<String> names = Arrays.asList("John", "Navin", "Emily", "Dele");

    String name = names.stream()
        .filter(str -> str.contains("p"))
        .findFirst()
        .orElse("Not found");

    System.out.println(name);
  }
}
