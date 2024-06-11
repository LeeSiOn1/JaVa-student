public class ey3 {
  // 메소드(함수)에 대해서 메소드 다루기
  // void 키워드 반환 하지 않는다 라는 것인데 반환되는 것과 반환되지 않는 메소드에 대해 알아보자
  public static void main(String[] args) {
    System.out.println("프로그램시작");
    // 메소드 호출
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
    HieveryOne(33, 170); // 값을 HieveryOne에 값이 33이라고 전달됌
    HieveryOne(44, 175); // 값을 HieveryOne에 값이 44이라고 전달됌
    HieveryTwo(arr); // arr배열 이름 자체가 주소(번지)를 전달
  }

  public static void HieveryOne(int age, double height) { // 이 함수에서만 실행 (반환 x)
    System.out.println("좋은 오후입니다~!");
    System.out.println("제나이는" + age + "세입니다.");
    System.out.println("제 키는" + height + "cm입니다.");
  }

  public static void HieveryTwo(int[] ptr) {
    for (int i = 0; i < ptr.length; i++) {
      System.out.println(ptr[i]);
    }
  }

  public static void HieveryThree() {
    System.out.println("다음에 뵙겠습니다.");
  }
}
