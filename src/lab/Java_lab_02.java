package lab;

import java.util.Scanner;

public class Java_lab_02 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		String[] category = {"스토리", "연출", "연기", "음악", "시각효과"};
		
		//분석할 영화의 수
		while (true) {
			System.out.print("분석할 영화의 수를 입력하세요 (최대 10개) : ");
			int movieCnt = s.nextInt();
			if (movieCnt <= 10 && movieCnt > 0)
			{
				String[] movies = new String[movieCnt];
				int [][] scoreTable = new int[movieCnt][category.length];
				float [] meanTable = new float[movieCnt];
				float [] category_meanTable = new float[category.length];
				
				
				for (int i = 0; i < movieCnt; i ++) 
				{
					float movieMean = 0;
					System.out.printf("영화 %d의 제목을 입력하세요 : ", i+1); //영화 제목입력
					String movieTitle = s.next();
					movies[i] = movieTitle;
					System.out.printf("'%s' 영화의 각 카테고리 평점을 입력하세요 (1~5) : \n", movieTitle); //각 카테고리 평점입력 (스토리 연출, 연기, 음악, 시각효과)
					
					//scoreTable 채우기
					for (int j = 0; j <(category.length); j++)
					{
						while (true) 
						{
							System.out.printf(" %s :", category[j]);
							int score = s.nextInt();
							if (score <= 5 && score >=0)
							{
								scoreTable[i][j] = score;
								movieMean += score;
								break;
							}
							else
							{
								System.out.println(" 1 ~ 5 사이의 숫자를 입력하세요.");
								continue;
							}
						}
						
					}
					s.nextLine(); // 버퍼 제거
					
					//각 영화별 평점
					movieMean /= category.length;
					meanTable[i] = movieMean;
				}
				
				//카테고리별 평점
				for (int i =0; i < category.length; i++ )
				{
					float categoryMean = 0;
					for (int j =0; j < movieCnt; j++)
					{
						categoryMean += scoreTable[j][i];
					}
					categoryMean /= movies.length;
					category_meanTable[i] = categoryMean;
				}
				
				//각 영화별 평균 평점 출력
				for (int i = 0; i <movieCnt; i++)
				{
					System.out.printf("'%s' 평균 평점 : %.1f\n",movies[i], meanTable[i] );
				}
				
				//각 카테고리별 평균 평점 출력
				for (int i = 0; i < category.length; i ++)
				{
					System.out.printf("'%s' 평균 : %.1f\n", category[i], category_meanTable[i]);
				}
				
				//최고 평점 영화 찾기(인덱스 넘버 찾기)
				int max_Idx = 0;
				for (int i = 0; i < movies.length; i++ )
				{
					if ( meanTable[max_Idx] < meanTable[i])
					{
						max_Idx = i;
					}
				}
				
				//최고 평점 영화 출력
				System.out.printf("평균평점이 가장 높은 영화 : '%s'\n", movies[max_Idx]);
				
				
			}
			else
			{
				System.out.print("1~10사이의 숫자를 입력하세요.");
				continue;
		
			}
			s.close();
		}
		
		
		
		//영화 평균 평점 (평균평점이 가장 높은 영화:)
		
		//카테고리펼 평균 평점
		

	}

}
