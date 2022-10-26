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

    public void EditScoreOfStudents(String id, String subject) {
        boolean exist = true;
        subject.toUpperCase();
        for (Students o : manageStudents) {
            if (o.getId().equals(id)) {
                
                if (subject.equals("MATHS")) {
                    System.out.println("Current score is " + o.getScores().getMath());
                    System.out.println("Enter new Score " );
                    Double newScore = scanner.nextDouble();
                    o.scores.setMath(newScore);
                }

                if (subject.equals("ENGLISH")) {
                    System.out.println("Current score is " + o.getScores().getEnglish());
                    System.out.println("Enter new Score " );
                    Double newScore = scanner.nextDouble();
                    o.scores.setEnglish(newScore);
                }

                if (subject.equals("PHYSICS")) {
                    System.out.println("Current score is " + o.getScores().getEnglish());
                    System.out.println("Enter new Score " );
                    Double newScore = scanner.nextDouble();
                    o.scores.setEnglish(newScore);
                }

                if (subject.equals("SCIENCES")) {
                    System.out.println("Current score is " + o.getScores().getSciences());
                    System.out.println("Enter new Score " );
                    Double newScore = scanner.nextDouble();
                    o.scores.setEnglish(newScore);
                }
                if (subject.equals("MUSIC")) {
                    System.out.println("Current score is " + o.getScores().getMusic());
                    System.out.println("Enter new Score ");
                    Double newScore = scanner.nextDouble();
                    o.scores.setEnglish(newScore);
                }

                exist = false;
            }
        }
        if (exist == false)
            System.out.println("------Update Successful------\n");
        else 
            System.out.println("------Not exist this name------\n");
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
