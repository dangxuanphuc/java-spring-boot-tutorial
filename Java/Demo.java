package Java;

interface Computer {
  public void code();
}

class Laptop implements Computer {
  public void code() {
    System.out.println("Code, compile, run");
  }
}

class Desktop implements Computer {
  public void code() {
    System.out.println("Code, compile, run : faster");
  }
}

class Developer {
  public void devApp(Computer com) {
    com.code();
  }
}

class Demo {
  public static void main(String args[]) {
    Developer dev = new Developer();
    Computer lap = new Laptop();
    Computer desk = new Desktop();

    dev.devApp(desk);
  }
}
