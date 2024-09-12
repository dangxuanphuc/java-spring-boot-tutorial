package Java;

class Human {
  private String name;
  private int age;

  public String getName() {
    return name;
  }

  public void setName(String n) {
    name = n;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int a) {
    age = a;
  }
}

class Demo {
  public static void main(String args[]) {
    Human h = new Human();
    h.setAge(26);
    h.setName("Phucdx");

    System.out.println(h.getName() + " " + h.getAge());
  }
}
