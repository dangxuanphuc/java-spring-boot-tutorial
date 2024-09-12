package Java;

class Human {
  private String name;
  private int age;

  public Human() {
    name = "Phucdx";
    age = 24;
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
    // h.setAge(26);
    // h.setName("Phucdx");

    System.out.println(h.getName() + " " + h.getAge());
  }
}
