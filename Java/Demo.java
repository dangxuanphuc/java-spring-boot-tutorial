package Java;

abstract class Car {
  public abstract void drive();

  public abstract void fly();

  public void playMusic() {
    System.out.println("Play music");
  }
}

abstract class Toyota extends Car {
  public void fly() {
    System.out.println("Flying...");
  }
}

class UpdateToyota extends Toyota {
  public void drive() {
    System.out.println("Driving...");
  }
}

class Demo {
  public static void main(String args[]) {
    Car obj = new UpdateToyota();
    obj.drive();
    obj.fly();
    obj.playMusic();
  }
}
