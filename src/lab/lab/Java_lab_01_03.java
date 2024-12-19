package lab.lab;

import java.util.Scanner;

public class Java_lab_01_03 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String[] product_names = { "A", "B", "C", "D", "E" };
		int[][] product_sells = new int[12][product_names.length];

		// 월별 판매 데이터
		for (int i = 0; i < 12; i++) {
			System.out.printf("=== %d월 판매 데이터 ===\n", i + 1);

			for (int j = 0; j < product_names.length; j++) {
				product_sells[i][j] = (int) (Math.random() * 10000) % 100;
				System.out.printf("상품 %s의 판매 수량을 입력하세요:%d\n", 
				product_names[j], product_sells[i][j]);
			}
			System.out.println("");
		}

		// 상품별 연간 판매 현황
		int[] produxt_yearlysell = new int[product_names.length];

		System.out.println("=== 상품별 연간 판매 현황 ===");

		for (int i = 0; i < product_names.length; i++) {
			for (int j = 0; j < 12; j++)
			{
				produxt_yearlysell[i] += product_sells[j][i];
			}

			System.out.printf("상품 %s : 총 판매 수량 = %d, 평균 판매 수량 = %.2f\n", 
			product_names[i], produxt_yearlysell[i], (double) produxt_yearlysell[i] / 12);
		}

		// 연간 판매량이 가장 높은 상품
		int Max_Idx = 0;
		for (int i = 0; i < product_names.length; i++) {
			if (produxt_yearlysell[Max_Idx] < produxt_yearlysell[i]) {
				Max_Idx = i;
			}
		}

		System.out.println("");
		System.out.printf("연간 판매 수량이 가장 높은 상품 : %s (총 판매 수량 : %d)\n", 
		product_names[Max_Idx], produxt_yearlysell[Max_Idx]);
		System.out.println("");

		
		// 총 판매 수량을 알고 싶은 월 입력
		while (true) 
		{
			System.out.print("총 판매 수량을 알고 싶은 월을 입력하세요 (1-12): ");
			int month = s.nextInt();
			int monthly_sell = 0;
			
			if (month <=12 && month >= 1)
			{
				for (int i = 0; i < product_names.length; i++)
				{
					monthly_sell += product_sells[month-1][i];
				}
				System.out.printf("%d월의 총 판매 수량 : %d\n", month, monthly_sell);
			}
			
			else
			{
				System.out.print("잘못된 입력입니다. 1-12사이의 숫자를 입력하세요.\n");
				System.out.println("");
				continue;
			}
		
			s.close();	
		}
		
	}

}
