package lab;

class Circle{
    int radius;

    Circle(int r){ // 매개 변수가 있는 생성자
        this.radius = r; //this는 class에 포함 되어 있는 변수
        // System.out.println("첫번째 생성자");
    }

    double getArea()
    {
        return this.radius * this.radius * 3.1415926;
    }

    Circle(){ //매개 변수가 없는 생성자
        this(3);
        // System.out.println("두번째 생성자");
    }

}
public class Java_chap04_ex01 {
    public static void main(String[] args) {
        Circle c = new Circle(7);
        c.radius = 5;
        System.out.printf("원 반지름 : %d, 면적 : %.2f\n", c.radius, c.getArea());

        Circle a = new Circle();
        System.out.printf("원 반지름 : %d, 면적 : %.2f\n", a.radius, a.getArea());


        Circle pizza = new Circle(11);
        Circle donut = new Circle(3);
        System.out.printf("피자 %d인치, 도넛 %d인치\n", pizza.radius, donut.radius);

        pizza = donut; // 메모리 누수, pizza의 접근 방법이 사라짐
        System.out.printf("피자 %d인치, 도넛 %d인치\n", pizza.radius, donut.radius);
        donut.radius = 7;
        System.out.printf("피자 %d인치, 도넛 %d인치\n", pizza.radius, donut.radius);

        int [] nums = new int[3];
        for (int i =0; i < 3; i++)
        {
            nums[0] = i *3;
        }

        Circle [] circles = new Circle[3];
        for (int i = 0; i < circles.length; i++)
        {
            circles[i] = new Circle(i * 3); // 객체형 배열의 각 원소에 대한 객체를 생성해야 한다!
            // circles[i].radius = i * 3;
            System.out.printf("%d %.2f\n",circles[i].radius,circles[i].getArea());
        }

    }
    
}
