package lab.p1;
import java.util.Scanner;

public class Hwang {
    public static void main(String[] args) {
        //배열의 length필드를 이용하여 배열의 크기만큼 정수를 입력 받고 평균을 구하는 프로그램을 작성하라

        Scanner s = new Scanner(System.in);
        int [] arr = new int [5];
        int sum = 0;

        System.out.println("정수를 입력하시오");

        for(int i = 0; i < arr.length; i++)
        {
            int num = s.nextInt();
            sum += num;
        }

        System.out.printf("평균 : %.2f", (double)sum / arr.length);
   }
}