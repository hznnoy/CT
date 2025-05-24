
import java.util.*;
import java.io.*;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
    static int [] score;
	static int [] cal;
	static int n,l;
	static int max;
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int tc=1; tc<=T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken()); // 재료수
			l = Integer.parseInt(st.nextToken()); // 제한 칼로리

			score = new int[n+1];
			cal = new int[n+1];
			
			
			for(int i=0; i<n; i++) {
				st = new StringTokenizer(br.readLine());
				score[i] = Integer.parseInt(st.nextToken());
				cal[i] = Integer.parseInt(st.nextToken());
			}
			max=0;
			dfs(0,0,0);
			
			System.out.println("#"+tc+" "+max);
		}
    }
	static void dfs(int sumcal, int count, int sumscore) {		
        if(sumcal>l) return;
		if(count==n) {
			if(sumcal<=l) {
				max = Math.max(max, sumscore);
			}
			return;
		}
		
		//선택하는 경우 
		dfs(sumcal+cal[count], count+1, sumscore+score[count]);
		//선택하지 않는 경우
		dfs(sumcal, count+1, sumscore);
	}
	
}