public class TimeTest {
    public static void main(String[] args)
    {
        Time t = new Time(12,43,30);
        System.out.println(t);
//          t.hour = 13;
        t.setHour(t.getHour()+1);   // 현재시간보다 1시간 후로 변경한다.
        //t.getHour을 통하여 위에서 초기화한 시간을 가져오고
        //1을더하여 객체의 인스턴스 변수값을 변경
        System.out.println(t);      // System.out.println(t.toString());과 같다.
    }
}

class Time {
    private int hour;
    private int minute;
    private int second;

    Time(int hour, int minute, int second) { //생성자를통한 인스턴스변수쵝화
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() { return hour; }
    public void setHour(int hour) {
        if (hour < 0 || hour > 23) return;
        this.hour = hour;
    }
    public int getMinute() { return minute; }
    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) return;
        this.minute = minute;
    }
    public int getSecond() { return second; }
    public void setSecond(int second) {
        if (second < 0 || second > 59) return;
        this.second = second;
    }
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
} 