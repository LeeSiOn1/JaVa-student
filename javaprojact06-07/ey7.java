import java.util.Arrays;
import java.util.Random;

public class ey7 {

  public static void main(String[] args) {
    int[] array = new int[100]; // 배열 길이 선언
    Random random = new Random(); // 랜덤 객체 생성

    for (int i = 0; i < array.length; i++) // 배열 초기화 (1부터 100까지의 랜덤 값)
      array[i] = random.nextInt(100) + 1;

    Arrays.sort(array); // 배열 정렬

    for (int value : array) // 배열 출력
      System.out.print(value + " ");

  }
}