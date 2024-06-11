public class ex05 {
  public static void main(String[] args) {
    int num = 3; // 변수 선언시 메모리를 할당 변수명 지정 후 값을 초기화[*중요*대부분 이렇게 사용 0으로라도 초기화 해야함]
    System.out.printf("%d \n", num);

    int i; // 변수만 선언
    i = 20; // 값을 20으로 초기화
    System.out.printf("%d \n", i);

    String str = "Hi~";
    System.out.printf("문자출력 %s\n", str); // 정수로 출력할 땐 printf를 사용
    float PI = 3.1415f; // 상수는 대문자로 정의(개발자끼리의 약속)
    System.out.println(PI); //
    // const float PI = 3.1415f;
    // system.out.println(PI);
    // PI = 2.7f;
    // float fpi = 3.14f;
    // double dpi = fpi; // 자동형변환 프로모션이라고 함
    // float double 형변환 또는 자동형변환이라고 함
    // (자료형)값 => 캐스팅(sasting)
    // float fpi2 = (float) dpi; // 형변환은 되지만 데이터 손실이 일어남
    // 더 작은 자료형의 변수에 저장하면 자료의 손실
    // 자동형 변환 허용
    // byte b = 225;
    // byte c = 127; 8bit = 1byte
    // short s = 32767; 16bit = 2byte
    // 빈번하게 쓰이지 않는 자료를 보관할 때 사용;
    int aaa = 10;
    int bbb = ++aaa; // 즉시 증가
    int ccc = aaa++; // 한줄 다음에 증가
    System.out.printf("%d \n", bbb);
    System.out.printf("%d \n", ccc);
    char Asci = 'A'; // 정수형 자료형이지만 문자 하나 출력할 때 쓰임
    System.out.printf("%c \n", Asci);

    // short s1 = 10; // 0000 0000은 1byte를 말함 10이면 0000 1010이다.
    // byte b1 = s1; // short다음 byte불가능한 이유 : short는 2byte이고 byte은 1byte이다.byte안에
    // short를 정의하면 메모리 할당한 값이 초과되기 때문에 overflow(오버플로우 현상)이 발생;
    // byte
    // byte b2 = 20;
    // short s2 = b2;
    // System.out.printf("%D \n", s2);
    // final int MAX = 100;
    // System.out.printf(format:"%d \n", MAX);
    // final int MAX; //선언, 상수는 따로 초기화를 하면 안된다.
    // MAX =100;
    // final int MAX =100; //이건 가능
  }
}