package Java;

class Human {
  public Human() {
    System.out.println("Object created");
  }

  public void show() {
    System.out.println("In a show");
  }
}

class Demo {
  public static void main(String args[]) {
    new Human().show();

    // Object created
    // In a show
  }
}
