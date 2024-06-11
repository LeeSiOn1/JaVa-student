public class ey6 {
  public static void main(String[] args) {
    Three();
  }

  public static void Three() {
    for (int i = 3; i <= 7; i++) {
      for (int j = 0; j <= 9; j++) {
        System.out.println("3단 ~ 7단" + i + " * " + j + " = " + (i * j));
      }
      System.out.println();
    }
  }
}