import java.io.*;
import java.util.*;

class Main {
    static int[][] board = new int[5][5];
    static int count;
    static boolean useUp = false;
    static boolean useDown = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int k = 0, l = 0;
        int a = 0, b = 0;
        for (int i=0; i<5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<5; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i=0; i<5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=0; j<5; j++) {
                int num = Integer.parseInt(st.nextToken());

                for (k=0; k<5; k++) {
                    for (l=0; l<5; l++) {
                        if (board[k][l] == num) {
                            board[k][l] = 0;
                            a = k;
                            b = l;
                        }
                    }
                }

                int t = 0;
                rCheck(a, b);
                lCheck(a, b);
                upCheck();
                downCheck();

                if (count >= 3) {
                    System.out.println(i * 5 + j + 1);
                    return;
                }
            }
        }
    }

    private static void rCheck(int i, int j) {
        int zeroCount = 0;
        for (int k=0; k<5; k++) {
            if (board[i][k] == 0)
                zeroCount++;
        }
        if (zeroCount == 5)
            count++;
    }

    private static void lCheck(int i, int j) {
        int zeroCount = 0;
        for (int k=0; k<5; k++) {
            if (board[k][j] == 0)
                zeroCount++;
        }
        if (zeroCount == 5)
            count++;
    }

    private static void upCheck() {
        int zeroCount = 0;
        if (!useUp) {
            for (int i=0; i<5; i++) {
                if (board[4 - i][i] == 0)
                    zeroCount++;
            }
            if (zeroCount == 5) {
                count++;
                useUp = true;
            }
        }
    }

    private static void downCheck() {
        int zeroCount = 0;
        if (!useDown) {
            for (int i=0; i<5; i++) {
                if (board[i][i] == 0)
                    zeroCount++;
            }
            if (zeroCount == 5){
                count++;
                useDown = true;
            }
        }
    }
}