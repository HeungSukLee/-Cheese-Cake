class TvTest4 { //객체배열을 생성하느 Example

    public static void main(String args[]) {

        Tv[] tvArr = new Tv[3]; // new를 통하여 TV객체배열 생성.

        // new를 통하여 TV객체를 생성하고 이 값을 객체배열의 원소로 대입.
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10; // tvArr[i]의 channel에 i+10을 저장
        }

        for (int i = 0; i < tvArr.length; i++) {//각각 객체배열의 요소인 TV객체의 채널을 UP
            tvArr[i].channelUp();  // tvArr[i]의 메서드를 호출. 채널이 1증가
            System.out.printf("tvArr[%d].channel=%d%n", i, tvArr[i].channel);
        }
    }
}
/*
class Tv {
     // Tv의 속성(멤버변수)
     String color;           // 색상
     boolean power;          // 전원상태(on/off)
     int channel;          	 // 채널
     // Tv의 기능(메서드)
     void power()   { power = !power; }  // TV를 켜거나 끄는 기능을 하는 메서드
     void channelUp()   {  ++channel; }  // TV의 채널을 높이는 기능을 하는 메서드
     void channelDown() {  --channel; }  // TV의 채널을 낮추는 기능을 하는 메서드
}
*/