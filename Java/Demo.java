package Java;

class Human {
  private String name;
  private int age;

  public Human() {
    name = "Phucdx";
    age = 24;
  }

  public Human(String name) {
    this.name = name;
    this.age = 22;
  }

  public Human(String name, int age) {
    this.name = name;
    this.age = age;
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
}

class Demo {
  public static void main(String args[]) {
    Human h = new Human();
    Human h1 = new Human("Phucdx1");
    Human h2 = new Human("Phucdx2", 26);
    // h.setAge(26);
    // h.setName("Phucdx");

    System.out.println(h.getName() + " " + h.getAge());
    System.out.println(h1.getName() + " " + h1.getAge());
    System.out.println(h2.getName() + " " + h2.getAge());
  }
}
