import java.util.Scanner;

public class ex09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("거리를 입력하세요");
    int time = Integer.parseInt(sc.nextLine());

    int hour = time / 80;
    int min = time % 80;

    System.out.println(hour + "시간");
    System.out.println(min + "분");
    sc.close();
  }
}
