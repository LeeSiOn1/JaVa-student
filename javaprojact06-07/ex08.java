import java.util.Scanner;

public class ex08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("김치찌개 입력");
    int a = Integer.parseInt(sc.nextLine());
    System.out.print("된장찌개 입력");
    int b = Integer.parseInt(sc.nextLine());
    System.out.print("제육볶음 입력");
    int c = Integer.parseInt(sc.nextLine());

    int total = a * 5000 + b * 4000 + c * 6000;
    int each = total / 5;

    System.out.println("총합계: " + total + "원");
    System.out.println("인당: " + each + "원");
    sc.close();
  }
}
