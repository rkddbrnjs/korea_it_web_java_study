package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("강유권", 25,"rkdfdas","dsa");
             student.setName("홍길동");
//        student.name = "강유권";
//        student.age = 25;
//        student.email = "dsadsa";
//        student.address = "fdsafa";
        System.out.println(student.getEmail());
        student.showInfo();

    }
}
