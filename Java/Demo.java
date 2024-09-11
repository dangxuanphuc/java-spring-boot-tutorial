package Java;

class Computer {
  public void playMusic() {
    System.out.println("Music playing...");
  }

  public String getMeAPen(int cost) {
    if (cost >= 10) {
      return "Pen";
    }
    return "Nothing";
  }
}

class Demo {
  public static void main(String args[]) {
    Computer com = new Computer();
    com.playMusic();

    String str = com.getMeAPen(20);
    System.out.println(str);
  }
}
