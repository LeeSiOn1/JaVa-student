public class ey0 {
  public static void main(String[] args) {
    int[][] arr2d = new int[6][9];
    for (int i = 0; i < arr2d.length; i++) {
      for (int j = 0; j < arr2d[i].length; j++) {
        arr2d[i][j] = (i + 3) * (j + 1); // i는 3단 j는 1부터
      }
    }
    for (int i = 0; i < arr2d.length; i++) { // 출력과정(한번에 출력을 못함)
      for (int j = 0; j < arr2d[i].length; j++) {
        System.out.printf("%5d ", arr2d[i][j]); // %5d = 줄칸을 5칸 간격 만큼 벌리겠다
      }
      System.out.println();
    }
  }
}
