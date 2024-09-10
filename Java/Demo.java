package Java;

class Demo {
  public static void main(String args[]) {
    int a = 6;
    String result = "";

    switch (a) {
      case 1:
        result = "Monday";
        break;
      case 2:
        result = "Tueday";
        break;
      case 3:
        result = "Wednesday";
        break;
      case 4:
        result = "Thursday";
        break;
      case 5:
        result = "Friday";
        break;
      case 6:
        result = "Saturday";
        break;
      case 7:
        result = "Sunday";
        break;
      default:
        result = "Enter a valid number";
        break;
    }

    System.out.println(result); // Saturday
  }
}
