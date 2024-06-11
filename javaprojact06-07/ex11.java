
public class ex11 {
  public static void main(String[] args) {
    int[] arr = new int[100];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = (i + 1) * 10;
    }
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 7 == 0 || arr[i] % 9 == 0)
        System.out.printf("%d\n", arr[i]);
    }

  }
}
