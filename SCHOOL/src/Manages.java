import java.util.ArrayList;
import java.util.*;

public class Manages {
    ArrayList <Students> manageStudents;
    public ArrayList <Teacher> manageTeachers;

    public Manages(ArrayList<Students> students, ArrayList<Teacher> teachers) {
        this.manageStudents = students;
        this.manageTeachers = teachers;
    }

    public void addStudent(Students students) {
        this.manageStudents.add(students);
    }
    public void addTeacher(Teacher teacher) {
        this.manageTeachers.add(teacher);
    }
    
    

    public void ShowAllofStudents() {
        for (Students o : manageStudents)
            System.out.println(o.showInfor());
    }

    public void ShowAllofTeachers() {
        for (Teacher o : manageTeachers)
            System.out.println(o.showInfor());    }

    public void sortStudentsbyName() {
        Collections.sort(manageStudents, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.getName().charAt(0) - o2.getName().charAt(0);
            }
        });
    }
    public void EditStudents(String id, Double gpa) {
        for (Students o : manageStudents) {
            if (o.getId() == id) {
                o.setScore(gpa);
            }
        }
    }

    public void sortStudentsbyGPA() {
        Collections.sort(manageStudents, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                int s1 = o1.getName().charAt(0);
                int s2 = o2.getName().charAt(0);
                // return o1.getScore() > o2.getScore() ? -1 : 1;
                return ((o1.getScore() > o2.getScore())
                    || ((o1.getScore() == o2.getScore()) && (s1 > s2)) ? -1 : 1);
            }
        });
    }


    public void FindStudentByName(String name) {
        for (Students o : manageStudents)
            if (o.getName() == name) {
                System.out.println(o.showInfor());
            }
    }
}
