public class ex12 {
  public static void main(String[] args) {
    // 3차원 배열실습 2차원,3차원을 다차원 배열
    int arr3D[][][] = new int[3][3][3]; // []높이(반), []인원(열), []과목(행)
    int number = 1;

    for (int i = 0; i < arr3D.length; i++) // 배열의 첫번째 차원 // 반[] 인원[] 과목[]
    {
      for (int j = 0; j < arr3D[i].length; j++) // 행의 길이
      {
        for (int k = 0; k < arr3D[i][j].length; k++) // 열의 길이
        {
          System.out.print(number + "\t");
          number++;
        }
        System.out.println();
      }
      System.out.println();
    }
    System.out.println();
  }
}