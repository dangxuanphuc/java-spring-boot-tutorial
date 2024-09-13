package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
  int age;
  String name;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public String toString() {
    return "Student [age=" + age + ", name=" + name + "]";
  }
}

class Demo {
  public static void main(String args[]) {
    Comparator<Student> com = (i, j) -> i.age > j.age ? 1 : -1;

    List<Student> students = new ArrayList<>();
    students.add(new Student(21, "A"));
    students.add(new Student(18, "B"));
    students.add(new Student(29, "C"));

    Collections.sort(students, com);

    for (Student s : students) {
      System.out.println(s);
    }
  }
}
