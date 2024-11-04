import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0; //과목별(학점*과목평점) 합
        double scoreSum = 0; //학점 총합
        double gradeToInt =0; //등급을 점수로 환산
        
        for(int i=0; i<20; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");       
            String name = st.nextToken();
            double score = Double.parseDouble(st.nextToken()); //학점
            String grade = st.nextToken(); //등급
    
            switch(grade){ 
                case "A+" : gradeToInt = 4.5; break;
                case "A0" : gradeToInt = 4.0; break;
                case "B+" : gradeToInt = 3.5; break;
                case "B0" : gradeToInt = 3.0; break;
                case "C+" : gradeToInt = 2.5; break;   
                case "C0" : gradeToInt = 2.0; break;    
                case "D+" : gradeToInt = 1.5; break;
                case "D0" : gradeToInt = 1.0; break;
                case "F" : gradeToInt = 0.0; break;
                default : break;
            }
            
            if(!grade.equals("P")){
                sum += score * gradeToInt;
                scoreSum += score;
            }
        }
        double avg = sum/scoreSum; // 전공평점 = 과목별(학점*과목평점)합 / 학점 총합
        System.out.printf("%.6f",avg);       
    }
}
