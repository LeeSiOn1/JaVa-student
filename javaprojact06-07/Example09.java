import java.util.Random;

public class Example09 {
  public static void main(String[] args) {
    Random random = new Random();
    random.setSeed(System.currentTimeMillis()); // 랜덤 객체(클래스) 생성
    System.out.println("n미만의 랜덤정수" + random.nextInt(10)); // 10범위 안에 랜덤값이 발생
  }
}
