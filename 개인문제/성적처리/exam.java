//자바 성적처리 프로그램
public class exam {
    public static void main(String[] args) {
        int[] sum = new int[5];    // 학생별 점수 합계
        String[] hakjum = new String[5]; // 학생별 학점
        double[] scoreGrade = new double[5]; // 학생별

        double avr = 0.0;  // 모든 학생의 점수 평균
        int tot = 0;       // 모든 학생의 점수 합계


        Student st[] = new Student[5];   // 학생 5명 생성 및 각 학생의 점수 입력
        st[0] = new Student("Kim", 22, 32, 12, 10);
        st[1] = new Student("Choi", 25, 35, 19, 10);
        st[2] = new Student("Park", 28, 36, 17, 10);
        st[3] = new Student("Lee", 21, 33, 20, 9);
        st[4] = new Student("Han", 27, 37, 15, 10);


        for (int i = 0; i < sum.length; i++) {

            sum[i] = st[i].getSum(); // 학생별 점수 합계
            tot += sum[i];           //모든 학생점수 합계

            if (sum[i] >= 90) {       // 학생별 학점
                if (sum[i] >= 95) {
                    hakjum[i] = "A+";
                } else {
                    hakjum[i] = "A";
                }
            } else if (sum[i] >= 80) {
                if (sum[i] >= 85) {
                    hakjum[i] = "B+";
                } else {
                    hakjum[i] = "B";
                }
            } else if (sum[i] >= 70) {
                if (sum[i] >= 75) {
                    hakjum[i] = "C+";
                } else {
                    hakjum[i] = "C";
                }
            } else if (sum[i] >= 60) {
                if (sum[i] >= 65) {
                    hakjum[i] = "D+";
                } else {
                    hakjum[i] = "D";
                }
            } else {
                hakjum[i] = "F";
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("%s의 중간고사는 %d점, 기말고사는 %d점, 과제 점수는 %d점, 출석은 %d점 입니다%n", st[i].n, st[i].jumsu[0], st[i].jumsu[1], st[i].jumsu[2], st[i].jumsu[3]);
            System.out.printf("전체 총점은 %d점 이고, 학점은 %s입니다%n", sum[i], hakjum[i]);
        }

        avr = (double) (tot / 5); // 모든 학생 평균
        System.out.printf("전체 평균은 %.1f점 입니다.", avr);
    }
}

class Student {
    int jumsu[] = {0, 0, 0, 0};                                    //중간, 기말, 과제, 출석
    String n;
    int sum = 0;

    Student() {
        this("이름없음", 0, 0, 0, 0);
    }

    Student(String name, int midd, int fn, int pro, int ab) {   //이름 ,중간, 기말, 과제, 출석
        this.n = name;
        this.jumsu[0] = midd;
        this.jumsu[1] = fn;
        this.jumsu[2] = pro;
        this.jumsu[3] = ab;
    }

    int getSum() {
        for (int i = 0; i < jumsu.length; i++) {
            sum += jumsu[i];
        }
        return sum;
    }
}
