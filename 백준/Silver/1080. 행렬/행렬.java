import java.io.*;
import java.util.*;

class Main {
    static int[][] a;
    static int[][] b;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        a = new int[n][m];
        for(int i=0; i<n; i++){
            String s= br.readLine();
            for(int j=0; j<m; j++){
                a[i][j] = s.charAt(j)-'0';
            }
        }
        b = new int[n][m];
        for(int i=0; i<n; i++){
            String s= br.readLine();
            for(int j=0; j<m; j++){
                b[i][j] = s.charAt(j)-'0';
            }
        }

        int count=0;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(a[i][j]!=b[i][j] && i+2<n && j+2<m){
                    for(int k=i; k<i+3; k++){
                        for(int l=j; l<j+3; l++){
                            change(k,l);
                        }
                    }
                    count++;
                }
            }
        }

        for(int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                if(a[i][j]!=b[i][j]) {
                    count = -1;
                }
            }
        }
        System.out.print(count);
    }

    static void change(int i, int j){
        if(a[i][j]==1){
            a[i][j]=0;
        }else{
            a[i][j]=1;
        }
    }

}