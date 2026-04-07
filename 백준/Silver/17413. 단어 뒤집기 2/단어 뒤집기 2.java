import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        String str = br.readLine();
        boolean isTag = false;

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);

            if(c == ' ' && !isTag) {
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(" ");
            }
            else if(c == '<' && !isTag) {
                isTag = true;
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(c);
            }
            else if(c == '>' && isTag) {
                isTag = false;
                sb.append(c);
            }
            else if(isTag) {
                sb.append(c);
            }
            else {
                stack.push(c);
            }
        }

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.print(sb);
    }
}