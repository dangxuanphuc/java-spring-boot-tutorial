package Java;

class A {
  public A() {
    super();
    System.out.println("In A");
  }

  public A(int n) {
    super();
    System.out.println("In A int");
  }
}

class B extends A {
  public B() {
    super(1);
    System.out.println("In B");
  }

  public B(int n) {
    this();
    System.out.println("in B int");
  }
}

class Demo {
  public static void main(String args[]) {
    B obj = new B(2);

    // In A int
    // In B
    // In B int
  }
}
