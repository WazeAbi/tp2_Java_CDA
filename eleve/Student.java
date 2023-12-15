package eleve;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentFirstName;
    private String studentLastName;
    private int studentAge;
    private  List<Integer> notes = new ArrayList<>();
    public List<Integer> getNotes() {
        return notes;
    }

    public void setNotes(List<Integer> notes) {
        this.notes = notes;
    }





    public String getStudentFirstName() {
        return studentFirstName;
    }

    public void setStudentFirstName(String studentFirstName) {
        this.studentFirstName = studentFirstName;
    }

    public String getStudentLastName() {
        return studentLastName;
    }

    public void setStudentLastName(String studentLastName) {
        this.studentLastName = studentLastName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void nameInitial() {
        System.out.println(studentFirstName.substring(0, 1).toUpperCase() + " " + studentLastName.substring(0, 1).toUpperCase());
    }
    public void ageStudent(){
        System.out.println(studentAge);
    }
    public void firsAndLastname(){
        System.out.println(studentFirstName+" "+studentLastName);
    }
    public void addNote(int note){
        notes.add(note);
    }
    public void studentInfo(){
        nameInitial();
        ageStudent();
        firsAndLastname();
        System.out.println("Notes"+notes);
    }



}


