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
    VeryAdvCalc obj = new VeryAdvCalc();

    int r1 = obj.add(4, 6);
    int r2 = obj.sub(10, 7);
    int r3 = obj.multi(10, 7);
    int r4 = obj.div(10, 2);
    double r5 = obj.power(2, 4);

    System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5); // 10 3 70 5 16.0
  }
}
