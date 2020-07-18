class TvTest4 {
    public static void main(String args[]) {

        Tv[] tvArr = new Tv[3];
        //객체 배열 역시 생성이 가능하다.
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10;
        }
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();
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