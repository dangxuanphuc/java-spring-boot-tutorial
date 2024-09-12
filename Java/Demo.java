package Java;

class Calc {
  public int add(int n1, int n2) {
    return n1 + n2;
  }

  public int sub(int n1, int n2) {
    return n1 - n2;
  }
}

class Demo {
  public static void main(String args[]) {
    AdvCalc ac = new AdvCalc();

    int r1 = ac.add(4, 6);
    int r2 = ac.sub(10, 7);
    int r3 = ac.multi(10, 7);
    int r4 = ac.div(10, 2);

    System.out.println(r1 + " " + r2 + " " + r3 + " " + r4); // 10 3 70 5
  }
}
