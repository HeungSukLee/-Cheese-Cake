class Point implements Cloneable { // clone을 사용하기 위해서는 Cloneable을 구현해야한다.
    // 점을 복제 할 것이기때문에 Cloneable을 구현한다.
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return "x="+x +", y="+y;
    }
    public Object clone(){
        Object obj = null;
        try{
            obj= super.clone();
        }catch (CloneNotSupportedException e){}
        return obj;
    }
}

class CloneEx1 {
    public static void main(String[] args){
        Point original = new Point(3, 5);
        Point copy = (Point)original.clone(); // 복제(clone)해서 새로운 객체를 생성
        System.out.println(original);
        System.out.println(copy);
    }
}