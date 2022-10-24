import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Students> students = new ArrayList<Students>();
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();

        Manages manage = new Manages(students, teachers);
    
        Students s1 = new Students("no1","Elon", "NYC", 
            "08726342", 20, "Boy", 9.0, "IT1");
        
        Students s2 = new Students("no2","Lisa", "UK", 
            "052771873", 19, "Girl", 8.5, "Design1");
        Students s3 = new Students("no3","Dung", "VN", 
            "8283821", 19, "Boy", 5.0, "Sing1");
        Students s4 = new Students("no3","Anna", "Canada", 
            "199321", 29, "Girl", 9.2, "Bussiness");
        Students s5 = new Students("no4", "Banana", "Austraulina", 
            "199321", 24, "Girl", 9.2, "Docter");
        Teacher t1 = new Teacher("T1", "Tesla", "USA", "01234", 87, "Boy", "Physics");

        manage.addStudent(s1);
        manage.addStudent(s2);
        manage.addStudent(s3);
        manage.addStudent(s4);
        manage.addStudent(s5);
        manage.sortStudentsbyGPA();
        // manage.ShowAllofStudents();


        
        manage.addTeacher(t1);
        // manage.ShowAllofTeachers();
        // manage.FindStudentByName("Anna");
        
        manage.ShowAllofStudents();
        // manage.ShowAllofTeachers();

        // delete
    }
}
