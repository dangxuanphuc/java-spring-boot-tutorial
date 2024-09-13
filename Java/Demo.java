package Java;

class CustomException extends RuntimeException {
  public CustomException(String string) {
    super(string);
  }
}

class A {
  public void show() throws ClassNotFoundException {
    Class.forName("Java");
  }
}

class Demo {
  static {
    System.out.println("Class Loaded");
  }

  public static void main(String args[]) {
    A obj = new A();
    try {
      obj.show();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
