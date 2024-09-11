package Java;

class Student {
  int id;
  String name;
  int age;
}

class Demo {
  public static void main(String args[]) {
    Student s1 = new Student();
    s1.id = 1;
    s1.name = "A";
    s1.age = 17;

    Student s2 = new Student();
    s2.id = 2;
    s2.name = "B";
    s2.age = 20;

    Student s3 = new Student();
    s3.id = 3;
    s3.name = "C";
    s3.age = 22;

    Student students[] = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    for (int i = 0; i < students.length; i++) {
      System.out.println(students[i].name + ": " + students[i].age);
    }
  }
}
