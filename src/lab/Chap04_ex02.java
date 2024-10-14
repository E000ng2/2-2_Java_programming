package lab;
import java.util.*;

public class Chap04_ex02 {

	//함수 (function)를 정의하는 방법
	
	//반환형 함수이름(파라미터...) (필요한 코드)
	//파라미터는 생략할 수 있고, 반환값이 없다면 반환형은 void
			
	//1. 반환값 X, 파라미터 X - 단순히 어떤 내용을 출력하는 경우에 적합
	static void myfunc1()
	{
		//변수 또는 함수를 인식할 수 있는 범위(Scope) - local scope
		int a = 10, b = 20;
		int c = a + b;
		System.out.println("myfunc1 실행 - " + c);
	}
	
	//2. 반환값 O, 파라미터 X
	//값을 반환할 때 return 예약어 사용
	static double myfunc2()
	{
		System.out.print("myfunc2 실행 - ");
		double P1 = 3.1415926;
		return P1;
	}
	
	//3. 반환값 X, 파라미터 O - 파람미터는 데이터형과 이름을 같이 나열
    //함수를 정의할 때 전달받아야 하는 값(a,b) => 파라미터
    //a와 b는 함수의 호출과 동시에 전달한 argument의 값으로 초기화되는 변수다.
    //myfunc에서 a순서에 변수 x를 전달 했다면 a와 x는 같은가? 같지 않다!!
    //"a와 x가 같냐?"는 질문은 명확하게 하면 "변수 a와 x가 가르키는 메모리 주소가 같냐?"
    //메모리 주소는 동일하지 않고, argument에 나열한 변수의 '값'만 전달된다.
	static void myfunc3(int a, int b)
	{
        //int a = 10; 선언 안됨
        //int b = 20; 선언 안됨
		int c = a + b;
		System.out.printf("myfunc3 실행 - %d + %d = %d\n", a, b, c);
	}
	
	//4. 반환값 O, 파라미터 O
    //모든 프로그래밍 언어에서 함수는 하나의 정보만 반환할 수 있다. 
    //자바에서는 인스턴스를 만들어서 반환하거나 배열에 담아서 반환
    static int myfunc4(int a, int b)
    {
        int c = a + b;
        System.out.print("myfunc4 실행 - ");
        return c;
    }

    //5. 배열 반환
    static int[] myfunc5(int a, int b)
    {
        System.out.println("myfunc5 실행 - ");
        int [] results = new int[4];
        results[0] = a + b;
        results[1] = a - b;
        results[2] = a * b;
        results[3] = a / b;

        return results;
    }

    //main 함수의 numbers와 myfunc6 함수의 nums는 같다.
    static int myfunc6(int[] nums, int y)
    {
        int sum = 0;
        for(int n : nums)
        {
            nums[1] = 70;
            y = 55;
            sum += n;
        }
        System.err.print("myfunc6 실행 - ");
        return sum;
    }


	
			
			
	public static void main(String[] args) {
		
        myfunc1();

		double P1 = myfunc2();
		System.out.println("원주율 : " + P1); 

        //함수를 호출할 때 전달하는 값(10,20) => argument
		myfunc3(2,5);
        int x = 2, y = 5;
        myfunc3(x, y);

        int sum = myfunc4(x, y);
        System.out.printf("%d + %d = %d\n", x, y, sum);
		
        int[] maths = myfunc5(x, y);
        String[] op = {"+", "-", "*", "/"};
        for (int i = 0; i < maths.length; i++)
        {
            System.out.println(op[i] + ":" + maths[i]);
        }

        int[] numbers = {30, 50, 20};
        int tmp = 20;
        int total = myfunc6(numbers, tmp);

        System.out.print("총합 : " + total);
        System.out.println("numbers : " + Arrays.toString(numbers));
        System.out.println("tmp : " + tmp);

	

    }


}
