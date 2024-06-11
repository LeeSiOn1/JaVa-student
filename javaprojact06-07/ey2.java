public class ey2 {
  public static void main(String[] args) {
    int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
        { 21, 22, 23, 24, 25 } };
    for (int i = 0; i < 4; i++) {
      showArr(arr);
      rotateArr(arr);
    }
  }

  public static void showArr(int[][] arr) {
    System.out.println("------다음------");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.printf("%6d", arr[i][j]);
      }
      System.out.println();
    }
    System.out.println();
  }

  public static void rotateArr(int[][] arr) {
    int n = arr.length;
    int[][] temp = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        temp[j][n - 1 - i] = arr[i][j];
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = temp[i][j];
      }
    }
  }
}
