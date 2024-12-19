package lab.Java_chap02;

// 한 라인 주석
/* 여러 행 주석 */

// 식별자(indentifier)

// 언어 관습
/*
 * 가독성 높은 이름
 * 카멜 표기법 : 클래스(첫 번째 문자 대문자) ex) HelloWorld
                변수, 메소드(첫 번째 문자 소문자) ex) myAge
                상수(모든 문자 대문자) ex) PI
 */

public class Chap02 { //java 이름의 클래스 선언
    public static int sum(int n, int m){
        return n + m;
    }

    public static void main(String[] args){ // main() 메소드에서 실행 시작
        int i = 20; // 변수 선언 : 변수 타입과 변수 이름 선언
        int s;
        char a;

        s = sum(i, 10); // sum() 메소드 호출
        a = '?';
        System.out.println(a); // 문자 '?'화면 출력
        System.out.println("Hello"); //"Hello" 문자열 화면 출력
        System.out.println(s); // 정수 s 값 화면 출력
        System.out.print(" !@#$%^&*()_\\/'\"");
    }   
}

//자바의 데이터 타입
/*
 * 기본 타입 : 8개
 * - boolean
 * - char
 * - byte
 * - short
 * - int
 * - long
 * - float
 * - double
 * 레퍼런스 타입 : 1개, 용도는 3가지
 * - 배열(array)에 대한 레퍼런스
 * - 클래스(class)에 대한 레퍼런스
 * - 인터페이스(interface)에 대한 레퍼런스
 */

//문자열
/*
 * 문자열이 섞인 + 연산 -> 문자열 연결
 * "안녕" + 3 = "안녕3"
 */

//리터럴(literal)
 /*
 * 프로그램에서 직접 표현한 값
 * - 정수 리터럴 : int형으로 컴파일, lon타입 리터럴은 숫자뒤에 L또는l을 붇여 표시
 * - 실수 리터럴 : double 타입으로 컴파일
 * - 문자 리터럴 : ('')로 문자 표현
 * - 논리 리터럴 : ture, flase
 * - null 리터럴 : 레퍼런스에 대입 사용
 * - 문자열 리터럴(스트링 리터럴) : ("")로 표현, String 객체로 자동 처리
 * 숫자 리터럴의 아무 위치에나 언더스코어('_')허용(리터럴 끝, 소수점 앞뒤, L앞, 0x중간이나 끝은 사용 X)
 */

//var키워드
/*
 * 변수 타입 선언 생략 : 컴파일러가 변수 타입 추론
 * 지역 변수의 선언에만 사용
 */

//상수
/*
 * final 키워드 사용
 * 선언 시 초기값 지정
 * 실행 중 값 변경 불가
 * ex) final double PI = 3.141592;
 */

//자동 타입 변환
/*
 * 작은 타입은 큰 타입으로 자동 변환
 * ex) double d = 3.14 * 10 (int 10이 double 10.0으로 자동 변환)
 */

 //강제 타입 변환
/*
 * 개발자가 필요하여 강제로 타입 변환을 지시
 * ex) double d = 1.9; int n = (int)d;
*/

//Scanner클래스
/*
 * import java.util.Scanner;
 * Scanner s = new Scanner(System.in); Scanner객체 생성
 * 입력되는 키 값을 공백으로 구분되는 아이템 단위로 읽음
 * String name = s.next();
 * String city = s.next();
 * int age = s.nextInt();
 * double weight = s.nextDouble();
 * boolean single = s.nextBoolean();
 */

