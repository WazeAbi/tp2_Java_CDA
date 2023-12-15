package eleve;
import java.util.List;
import java.util.ArrayList;


public class StudentList {
   private List<Student> list = new ArrayList<>();

   public void addStudent(Student Student){
       list.add(Student);
   }
   public void showList(){
       for(Student Student : list){
           Student.studentInfo();
       }
   }

}
