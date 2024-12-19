package lab.Java_chap01;
//Java의 목적
/*
 * 1. 플랫폼 호환성 문제 해결
 *    (WORA:Write Once Run Anywhere)
 * 2. 플랫폼 독립적인 언어 개발
 * 3. 메모리 사용량이 적고 다양한 플랫폼을 가지는 가전 제품에 적용 
 *    (자바 가상 기계는 필요할 때, 클래스 파일 로딩 = 동적 로딩)
 */

//Java의 특성(1)
/*
  * 1. 플랫폼 독립성 
       플랫폼에 상관없이 어디서든지 실행

 * 2. 객체지향
       상속성, 다형성, 캡슐화

 * 3. 클래스로 캡슐화 
       클래스 내에 모든 변수(필드), 함수(메소드) 구현해야 함

 * 4. 소스(.java)와 클래스(.class)파일
       하나의 소스 파일에 여러 클래스 작성 가능 
            : public클래스는 하나만 가능, 소스 파일의 이름과 public으로 선언된 클래스 이름은 같아야 함
       컴파일된 클래스 파일(.class)에는 클래스는 하나만 존재
            : 다수의 클래스를 가진 자바 소스(.java)를 컴파일하면 클래스마다 별도 클래스 파일(.class) 생성
  */

//Java의 특성(2)
/*
 * 1. 실행 코드 배포
        실행코드 : 한 개의 class 파일 또는 다수의 class 파일로 구성
        여러 폴더에 걸쳐 다수의 클래스 파일로 구성된 경우 : jar파일 형대로 배포 가능
        main() 메소드 : 자바 응용프로그램의 실행은 main() 메소드에서 시작
        하나의 클래스 파일에 하나 이상의 main() 메소드가 있을 수 없음
        각 클래스 파일이 main() 메소드를 포함하는 것은 상관없음

 * 2. 패키지
        관련된 야러 클래스를 묶어 관리하는 단위
        패키지는 폴더 개념 : java.lang.System은 java\lang\디렉더리의 System.class파일
    
 * 3. 멀티스레드
        자바는 운영체제의 도움 없이 자체적으로 멀티스레드 지원 : C/C++ 등에서는 멀티스레드 운영체제 API를 호출
 */

//Java의 특성(3)
/*
 * 1. 가비지 컬렉션
        자바는 응요프로그램에서 메모리 반환 기능 없음, 메모리 할당 기능(new)만 있음 : 개발자의 부담 대폭 감소
        가비지 : 할당 후 사용되지 않는 메모리
        자바 가상 기계가 자동으로 가비지 회수

 * 2. 실시간 응용 시스템에 부적합
        자바 응용프로그램은 실행 도중 예측할 수 없는 시점에 가비지 컬렉션 실행
        일정 시간(deadline) 내에 반드시 실행 결과를 내야만 하는 실시간 시스템에는 부적합

 * 3. 자바 프로그램은 안전
        타입 체크가 매우 엄격
        포인터의 개념 없음
 */


//Java 프로그램 개발
public class Chap01 { // 클래스 선언문 / java_chap1 : 클래스 이름 / {와} 사이에 정의 / 자바는 하나 이상의 클래스로 구성
    public static void main(String[] args){ // 자바 프로그램은 main()메소드에서 실행 시작 / 실행을 시작하는 클래스 main() 메소드가 반드시 하나 존재 

        int n = 2030; //지역 변수 선언
        System.out.println("헬로" + n); // 화면에 "헬로2030"출력 / System.out객체는 JDK에서 제공됨

    }    
}

//Java 응용의 종류
/*
 * 1. 데스크톱 응용프로그램
 * 2. 백엔드 웹 응용프로그램
 *    백엔드 : 웹서버에 저장된 데이터베이스 관리, 웹 프론드엔드 응용프로그램으로부터의 요정 처리
 * 3. 모바일/임베디드 응용프로그램
 *    안드로이드 앱 개발에 활용, 다양한 모바일 기기의 응용프로그램 작석에 활용, 임베디드 시스템에서 활용
 */