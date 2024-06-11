import java.util.*;

public class ex06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("거리를 입력바람");
    int i = Integer.parseInt(sc.nextLine());
    int k = 0;
    if (i < 1000) {
      System.out.print(i + "m");
    }

    else {
      k = (i / 1000);
      System.out.print(k + "km");
    }
    sc.close();
  }
}
