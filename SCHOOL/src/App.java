import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Students> students = new ArrayList<Students>();
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();

        Manages manage = new Manages(students, teachers);
    
        Students s1 = new Students("Elon", "NYC", "08726342", 20, "Boy", 9.0, "IT1");
        manage.addStudent(s1);
        Students s2 = new Students("Lisa", "UK", "052771873", 19, "Girl", 8.5, "Design1");
        Students s3 = new Students("Dung", "VN", "8283821", 19, "Boy", 5.0, "Sing1");
        Students s4 = new Students("Anna", "Canada", "199321", 29, "Girl", 9.2, "Bussiness");
        manage.addStudent(s4);
        manage.addStudent(s2);
        manage.addStudent(s3);

        // manage.ShowAllofStudents();


        Teacher t1 = new Teacher("Tesla", "USA", "01234", 87, "Boy", "Physics");
        manage.addTeacher(t1);
        // manage.ShowAllofTeachers();
        // manage.FindStudentByName("Lisa");
        manage.sortStudentsbyGPA();
        manage.ShowAllofStudents();
        manage.ShowAllofTeachers();
        // delete
    }
}
