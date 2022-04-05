package com.pra2;
import java.util.*;
public class ScoreTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Vector v=new Vector();
        int maxScore=0;
        for(;;){
            System.out.println("请输入学生成绩（以负数代表输入结束）");
            int score=scanner.nextInt();
            if(score<0){
                break;
            }
            if(score>100){
                System.out.println("输入数据非法，请重新输入");
                continue;
            }
            Integer inScore=score;
            v.addElement(inScore);
            if(maxScore<score)
                maxScore=score;
        }
        char level;
        for (int i=0;i<v.size();i++){
            Object obj=v.elementAt(i);
            Integer inScore=(Integer) obj;
            int score=inScore.intValue();
            switch ((maxScore-score)/10){
                case 0:
                case 1:
                    level='A';break;
                case 2:
                    level='B';break;
                case 3:
                    level='C';break;
                default:
                    level='D';break;
            }
            System.out.println("student-"+i+" score is "+score+",level is "+level);
        }
    }
}
