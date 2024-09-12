package Java;

class B extends A {
  public void show() {
    System.out.println(text1);
    System.out.println(text2);
    // System.out.println(text3);
  }
}

class Demo {
  public static void main(String args[]) {
    A obj1 = new A();
    obj1.show();

    B obj2 = new B();
    obj2.show();
  }
}
