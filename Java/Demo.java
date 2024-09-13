package Java;

import java.util.Map;
import java.util.HashMap;

class Demo {
  public static void main(String args[]) {
    Map<String, Integer> students = new HashMap<>();
    students.put("A", 20);
    students.put("B", 17);
    students.put("C", 29);

    System.out.println(students);
  }
}
