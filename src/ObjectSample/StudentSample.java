package ObjectSample;

public class StudentSample {
    public static void main(String[] args) {
        //インスタンス
        Student[] students = {
                new Student("たなか",1,1,10),
                new Student("なかむら",2,2,15),
                new Student("さとう",3,3,8),
        };
        System.out.println(students[1]);
        System.out.println(students[2]);
    }
}
