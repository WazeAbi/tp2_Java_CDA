package eleve;

import java.util.List;

public class test {
    public static void main(String[] args) {
        Student First = new Student();
        First.setStudentFirstName("Alex");
        First.setStudentLastName("Dalle");
        First.setStudentAge(22);
        First.addNote(12);
        First.addNote(33);
        First.addNote(33);

        Student Second = new Student();
        Second.setStudentFirstName("Max");
        Second.setStudentLastName("Rowell");
        Second.setStudentAge(22);
        Second.addNote(13);
        Second.addNote(33);
        Second.addNote(33);


        StudentList studentList = new StudentList();
        studentList.addStudent(First);
        studentList.addStudent(Second);
        studentList.showList();

    }
}
