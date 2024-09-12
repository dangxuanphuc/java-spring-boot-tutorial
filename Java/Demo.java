package Java;

class Laptop {
  String model;
  int price;

  public String toString() {
    return "Laptop [model=" + model + ", price=" + price + "]";
  }

  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Laptop other = (Laptop) obj;
    if (model == null) {
      if (other.model != null)
        return false;
    } else if (!model.equals(other.model))
      return false;
    if (price != other.price)
      return false;
    return true;
  }
}

class Demo {
  public static void main(String args[]) {
    Laptop obj = new Laptop();
    obj.model = "iPhone";
    obj.price = 1000;

    Laptop obj1 = new Laptop();
    obj1.model = "iPhone";
    obj1.price = 1000;

    boolean result = obj.equals(obj1);
    System.out.println(result);
  }
}
