/* 6-1
import java.io.*;
public class 자바의정석chapter6 {
    public static void main(String[] args) throws IOException {
        StudentCard card1 = new StudentCard(3,false);
        StudentCard card2 = new StudentCard();

        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

class StudentCard{
    int num;
    boolean isKwang;

    StudentCard(){
        this(1,true);
    }
    StudentCard(int num, boolean isKwang){
        this.num=num;
        this.isKwang=isKwang;
    }
    String info(){
        String a="";
        if(isKwang==true) a = "K";
        return num+a;
    }
}
 */
/* 6-3
import java.io.*;
public class 자바의정석chapter6 {
    public static void main(String[] args) throws IOException {
        Student s= new Student();
        s.name="홍길동";
        s.ban=1;
        s.no=1;
        s.kor=100;
        s.eng=60;
        s.math=76;

        System.out.println("이름:"+s.name);
        System.out.println("총점:"+s.getTotal());
        System.out.println("총점:"+s.getAverage());
    }
}

class Student{
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    int getTotal(){
        return kor+eng+math;
    }
    float getAverage(){
        return (float)(kor+eng+math)/3;
    }

}
 */
/* 6-5
import java.io.*;

public class 자바의정석chapter6 {
    public static void main(String[] args) throws IOException {
        Student s = new Student("홍길동", 1, 1, 100, 60, 76);
        System.out.println(s.info());
    }
}

class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    String info() {
        int sum = kor+eng+math;
        float average = (float)(kor+eng+math)/3;
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math+","+sum + "," + average;
    }
}
*/
/*6-6번문제
import java.io.*;
public class 자바의정석chapter6 {
    public static void main(String[] args) throws IOException {
        System.out.println(getDistance(1,1,2,2));
    }

    static double getDistance(int x, int y ,int x1, int y1){
        return Math.sqrt(Math.pow(x-x1,2)+Math.pow(y-y1,2));
    }
}
 */
//6-13번 b d
//6-14번 a? de
//6-18 A  B D
//static 변수나 매서드가 만들어질 떄 , 인스턴스 변수 또는 메서드가 생성되지 않아서 참조할 수 없다.