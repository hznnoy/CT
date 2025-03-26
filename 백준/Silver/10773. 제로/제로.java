import java.io.*;
import java.util.*;


class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num > 0) {
                st.push(num);
            } else {
                st.pop();
            }
        }
        int sum = 0;
        int size = st.size();

        for (int i = 0; i < size; i++) {
            sum += st.peek();
            st.pop();
        }
        System.out.print(sum);
    }
}