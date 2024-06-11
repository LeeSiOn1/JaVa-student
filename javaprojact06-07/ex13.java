import java.util.Scanner;

public class ex13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // 스캐너 객체 생성

    System.out.print("학생 수 입력하세요: ");
    int studentCount = scanner.nextInt();

    int[][][] scores = new int[5][studentCount][3]; // 3차원 배열 생성 (반, 학생, 과목)
    // 5개의 반, 각 반에 studentCount명의 학생, 국어, 영어, 수학 점수

    for (int classId = 0; classId < 5; classId++) {
      for (int studentId = 0; studentId < studentCount; studentId++) { // 학생별 점수 입력
        System.out.printf("%d반 %d번째 학생의 점수를 입력하세요(국어 영어 수학): ", classId + 1, studentId + 1);
        scores[classId][studentId][0] = scanner.nextInt();
        scores[classId][studentId][1] = scanner.nextInt();
        scores[classId][studentId][2] = scanner.nextInt();
      }
    }

    for (int classId = 0; classId < 5; classId++) { // 반 반복
      for (int studentId = 0; studentId < studentCount; studentId++) { // 학생
        int totalScore = 0;
        for (int subject = 0; subject < 3; subject++) { // 과목 반복
          totalScore += scores[classId][studentId][subject];
        }
        double averageScore = (double) totalScore / 3;

        System.out.printf("%d반 %d번째 학생의 총점: %d, 평균: %.2f\n", classId + 1, studentId + 1, totalScore, averageScore);
      }
    }

    // scanner 닫기
    scanner.close();
  }
}