package lab;

// 한 라인 주석
/* 여러 행 주석 */

public class java_chap2 { //java 이름의 클래스 선언
    public static int sum(int n, int m){
        return n + m;
    }

    public static void main(String[] args){ // main() 메소드에서 실행 시작
        int i = 20;
        int s;
        char a;

        s = sum(i, 10); // sum() 메소드 호출
        a = '?';
        System.out.println(a); // 문자 '?'화면 출력
        System.out.println("Hello"); //"Hello" 문자열 화면 출력
        System.out.println(s); // 정수 s 값 화면 출력
    }
    
}
