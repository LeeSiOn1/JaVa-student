import java.util.Scanner;

public class ex07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("거스름돈을 입력하세요.");
    int charge = Integer.parseInt(sc.nextLine());

    System.out.println("50000원 권" + (charge / 50000) + "개");
    charge = charge % 50000;
    System.out.println("10000원 권" + (charge / 50000) + "개");
    charge = charge % 10000;
    System.out.println("5000원 권" + (charge / 5000) + "개");
    charge = charge % 5000;
    System.out.println("1000원 권" + (charge / 1000) + "개");
    charge = charge % 1000;
    System.out.println("500원 권" + (charge / 500) + "개");
    charge = charge % 500;
    System.out.println("100원 권" + (charge / 100) + "개");
    charge = charge % 100;
    System.out.println("50원 권" + (charge / 50) + "개");
    charge = charge % 50;
    System.out.println("10원 권" + (charge / 10) + "개");
    charge = charge % 10;
    sc.close();
  }
}
