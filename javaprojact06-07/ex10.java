public class ex10 {
  public static void main(String[] args) {
    float pi = 3.141592f;
    float shortPi = Math.round(pi * 1000) / 1000f; // 소숫점 반올림 (3.142000이 출력)

    System.out.printf("%f \n", shortPi);
  }
}
