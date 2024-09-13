package Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
  private String name;
  private int age;


  public Student(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String toString() {
    return "Student [name=" + name + ", age=" + age + "]";
  }
}

class Demo {
  public static <T> void main(String args[]) {
    List<String> names = Arrays.asList("John", "Navin", "Emily", "Dele");
    List<Student> students = new ArrayList<>();

    // students = names.stream().map(name -> new Student(name)).toList();
    students = names.stream().map(Student::new).toList();

    System.out.println(students);
  }
}
