package Java;

class Calc {
  public final void show() {
    System.out.println("In Calc show");
  }

  public void add(int a, int b) {
    System.out.println(a + b);
  }
}

class AdvCalc extends Calc {
  public void show() { // cannot override final method
    System.out.println("In AdvCalc show");
  }
}

class Demo {
  public static void main(String args[]) {
    AdvCalc obj = new AdvCalc();
    obj.show();
    obj.add(3, 5);
  }
}
