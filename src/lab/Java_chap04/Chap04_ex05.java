package lab.Java_chap04;

class MyMath {
    public static int myabs(int n)
    {
        if (n >= 0)
            return n;

        else
            return -n;
        
    }

    private MyMath() {}
}

public class Chap04_ex05 {
    public static void main(String[] args) {
        int a = -77, b = -55;

        // MyMath mm = new MyMath(); -> MyMath의 생성자가 private이므로 객체 생성 불가!!
        // a = mm.myabs(a);
        // b = mm.myabs(b);

        a = MyMath.myabs(a); //MyMath가 static일 때만 가능!!
        b = MyMath.myabs(b); //MyMath가 static일 때만 가능!!
        
    }
    }