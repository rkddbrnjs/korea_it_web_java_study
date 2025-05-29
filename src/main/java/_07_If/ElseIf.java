package _07_If;

public class ElseIf {
    public static void main(String[] args) {
        //다중 조건문
        int avgScore = 88;

        //90이상이면 'A'
        //80이상이면 'B'
        //70이상이면 'C'
        //나머지는 'D'
        if(avgScore>=90){
            System.out.println("A");
        } else if (avgScore>=80) {
            System.out.println("B");
        } else if (avgScore>=70) {
            System.out.println("C");
        }else {
            System.out.println("D");
        }
        //앞에 참이 나온 조건이 있으면 뒤에는 다 무시
    }


        }
