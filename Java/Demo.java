package Java;

class Demo {
  public static void main(String args[]) {
    StringBuffer sb = new StringBuffer("phucdx");

    sb.append(" from Haiduong");
    sb.insert(0, "Hello ");

    System.out.println(sb);
  }
}
