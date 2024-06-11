public class ey1 {
  public static void main(String[] args) { // 이 줄은 프로그램의 진입점인 main 메서드를 시작합니다. 문자열 배열을 args입력으로 사용
    int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } }; // 1부터 16까지의 정수로 채워진 4개의 행과
                                                                                             // 4개의 열로 명명된 2D 배열을 초기화
    for (int i = 0; i < 4; i++) { // 4번 반복되는 for 루프를 시작합니다.
      showArr(arr); // showArr배열을 전달하여 arr배열의 내용을 표시하는 메서드를 호출
      rotateArr(arr); // rotateArr배열을 시계 방향으로 회전시키는 메서드를 호출하여 배열을 arr전달
    }
  }

  public static void showArr(int[][] arr) { // 2D 배열을 arr입력 매개변수로 사용하는 메서드를 정의
    System.out.println("----Show Array----"); // 배열 표시 시작을 표시하는 구분선을 출력
    for (int i = 0; i < arr.length; i++) { // 배열의 행을 반복하는 루프를 시작
      for (int j = 0; j < arr[i].length; j++) { // 각 행 내의 배열 열을 반복하는 루프를 시작
        System.out.printf("%5d", arr[i][j]); // 너비가 5자인 배열의 현재 요소 값을 인쇄
      }
      System.out.println(); // 행의 모든 ​​요소를 ​​인쇄한 후 개행 문자를 인쇄
    }
    System.out.println(); // 배열의 다른 행을 구분하기 위해 추가 개행 문자를 인쇄 *개행문자 = 텍스트의 한 줄이 끝남을 표시하는 문자 또는 문자열*
  }

  public static void rotateArr(int[][] arr) { // 2D 배열을 arr입력 매개변수로 사용하는 메서드를 정의
    int n = arr.length; // 배열의 길이를 계산 arr하고 이를 변수에 할당
    int[][] temp = new int[n][n]; // 입력 배열과 동일한 차원을 가진 임시 2D 배열을 만듬 [ㅑㅜㅎ]
    for (int i = 0; i < n; i++) { // 배열의 행을 반복하는 루프를 시작
      for (int j = 0; j < n; j++) { // 각 행 내의 배열 열을 반복하는 루프를 시작
        temp[j][n - 1 - i] = arr[i][j]; // 입력 배열의 요소를 회전하여 arr임시 배열에 저장
      }
    }
    for (int i = 0; i < n; i++) { // 배열의 행을 반복하는 루프를 시작
      for (int j = 0; j < n; j++) { // 각 행 내의 배열 열을 반복하는 루프를 시작
        arr[i][j] = temp[i][j]; // 회전된 요소를 임시 배열에서 temp입력 배열로 다시 복사
      }
    }
  }
}
