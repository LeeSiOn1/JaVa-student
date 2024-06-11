public class ey4 {
  public static void main(String[] args) { // void 대신 int -> int형(정수형으로) 반환해야함
    int result = Adder(10, 20);
    System.out.println("result =" + result);

    System.out.println("Adder메서드=" + Adder(30, 50));
    System.out.println("Minus메서드=" + Minus(30, 50));
    Divide(4, 2);
    Divide(4, 0);
  }

  public static int Adder(int n1, int n2) {
    return n1 + n2; // 아무이상(문제 없이)없다.(안전하다) -> int형을 써서 리턴을 씀
  }

  public static int Minus(int n1, int n2) {
    return n1 - n2;
  }

  public static void Divide(int n1, int n2) {
    if (n2 == 0) {
      System.out.println("0으로 입력 했음 0으로 나눌 수 없다");
      return;
    }
    System.out.println("나눗셈의 결과:" + (n1 / n2));
  }
}
