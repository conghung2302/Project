import java.util.ArrayList;
import java.util.*;

public class Manages {
    ArrayList <Students> manageStudents;
    public ArrayList <Teacher> manageTeachers;

    public Manages(ArrayList<Students> students, ArrayList<Teacher> teachers) {
        this.manageStudents = students;
        this.manageTeachers = teachers;
    }

    
    public Manages(ArrayList<Students> manageStudents) {
        this.manageStudents = manageStudents;
    }

    



    public void addStudent(Students students) {
        this.manageStudents.add(students);
    }
    public void addTeacher(Teacher teacher) {
        this.manageTeachers.add(teacher);
    }
    
    

    public void ShowAllofStudents() {
        for (Students o : manageStudents)
            // System.out.println(o.getName() + " " + o.getAddress() + " " + o.getScore());
            System.out.println(o.showInfor());
    }

    public void ShowAllofTeachers() {
        for (Teacher o : manageTeachers)
            // System.out.println(o.getName() + " " + o.getAge() + " " + o.getGender());
            System.out.println(o.showInfor());    }

    public void sortStudentsbyName() {
        Collections.sort(manageStudents, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.getName().charAt(0) - o2.getName().charAt(0);
            }
        });
    }

    public void sortStudentsbyGPA() {
        Collections.sort(manageStudents, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.getScore() > o2.getScore() ? -1 : 1;
            }
        });
    }

    public void FindStudentByName(String name) {
        for (Students o : manageStudents)
            if (o.getName() == name) {
                System.out.println(o.showInfor());
                break;
            }
    }

    
}
