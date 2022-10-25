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
    
    

    public void ShowAllStudents() {
        sortStudentsbyGPA();
        for (Students o : manageStudents)
            System.out.println(o.showInfor());
    }

    public void sortStudentsbyName() {
        Collections.sort(manageStudents, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.getName().charAt(0) - o2.getName().charAt(0);
            }
        });
    }

    public void EditStudents(String id, Double gpa) {
        boolean exist = true;
        for (Students o : manageStudents) {
            if (o.getId().equals(id)) {
                System.out.println("helloooooo");
                o.setScore(gpa);
                exist = false;
            }
        }
        if (exist == false)
            System.out.println("------Update Successful------\n");
        else 
            System.out.println("------Not exist this name------\n");
    }

    public void sortTeacherby() {
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
                if (o1.getScore() == o2.getScore())
                    return o1.getName().charAt(0) - o2.getName().charAt(0) ;
                return (o1.getScore() > o2.getScore() ? -1 : 1);
            }
        });
    }
    
    Students students;
    public void FindHighScore() {
        Double MAX = 0.0;
        
        for (Students o : manageStudents)
            if (o.getScore() > MAX) {
                MAX = o.getScore();
                students = o;
            }
        System.out.println(students.showInfor());
    }

    public void FindStudentByName(String name) {
        boolean exits = true;
        for (Students o : manageStudents)
            if (o.getName().equals(name)) {
                System.out.println(o.showInfor());
                exits = false;
            }
        if (exits)
            System.out.println("Student is not exist");
    }
    public void FindTeacherByName(String name) {
        boolean exits = true;
        for (Teacher o : manageTeachers)
            if (o.getName().equals(name)) {
                System.out.println(o.showInfor());
                exits = false;
            }
        if (exits)
            System.out.println("Teacher is not exist");
    }

    public void ShowAllofTeachers() {
        for (Teacher o : manageTeachers)
            System.out.println(o.showInfor());  
    }
}
