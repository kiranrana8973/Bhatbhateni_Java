import java.util.ArrayList;

public class Test {

    Student s;
    public static void main(String[] args) {
        ArrayList<Student> lstStudent = new ArrayList<Student>();
        
        lstStudent.add(new Student("Nguyen Van A", "Hanoi", 12));
        lstStudent.add(new Student("Nguyen Van B", "Hanoasdi", 1222));
        lstStudent.add(new Student("Nguyen Van C", "Hanoasdi", 123));

        for(Student s : lstStudent) {
            System.out.println(s.getLname());
        }

        lstStudent.add(new Student("Nguyen Van C", "Hanoaasdsdi", 123));

       for(int i=0;i<lstStudent.size();i++) {
            System.out.println(lstStudent.get(i).getLname());
       }
    }
}
