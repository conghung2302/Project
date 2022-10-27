package school;
import java.util.ArrayList;

import Admin.*;

import java.util.*;

public class Manages {
    Scanner scanner;
    ArrayList <Students> manageStudents;
    ArrayList <Teacher> manageTeachers;

    public Manages(ArrayList<Students> students, ArrayList<Teacher> teachers) {
        this.manageStudents = students;
        this.manageTeachers = teachers;
    }                               

    public void addStudent(Students students) {
        Scores sc = new Scores();
        students.scores = sc;
        this.manageStudents.add(students);
    }
    public void addTeacher(Teacher teacher) {
        this.manageTeachers.add(teacher);
    }

    public void ShowScore (String grade) {
        for (Students o :manageStudents)
            if (o.getGrade().equals(grade)) {
                System.out.println("{" + o.getGrade() + " " + o.getName() + " " + o.scores.ShowScore());
            }
                
    }
    

    public void ShowAllStudents() {
        
        // sortStudentsbyName();
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

    public void EditScoreOfStudents(Students student, String subject, Double newscore) {
        subject = subject.toUpperCase();
        if (subject.equals("MATHS")) {
            student.scores.setMath(newscore);
        }
        if (subject.equals("ENGLISH")) {
            student.scores.setEnglish(newscore);
        }
        if (subject.equals("PHYSICS")) {
            student.scores.setPhysics(newscore);
        }
        if (subject.equals("MUSIC")) {
            student.scores.setMusic(newscore);
        }
        if (subject.equals("SCIENCES")) {
            student.scores.setSciences(newscore);
        }
    }

    public void sortTeacherbyName() {
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
                if (o1.getScores().getAverageofscore() == o2.getScores().getAverageofscore())
                    return o1.getName().charAt(0) - o2.getName().charAt(0) ;
                return (o1.getScores().getAverageofscore() > o2.getScores().getAverageofscore() ? -1 : 1);
            }
        });
    }
    
    Students students;
    public void FindHighScore() {
        Double MAX = 0.0;
        
        for (Students o : manageStudents)
            if (o.getScores().getAverageofscore() > MAX) {
                MAX = o.getScores().getAverageofscore();
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

    public void AddScoreStudents(String id, Scores gpa) {
        for (Students o : manageStudents)
            if (o.getId().equals(id)) {
                o.setScores(gpa);
            }
    }
}
