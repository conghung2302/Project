package school;
import java.util.ArrayList;
import java.util.Scanner;


import Admin.Scores;
      

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Students> students = new ArrayList<Students>();
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();

        Manages manage = new Manages(students, teachers);

        
        while (true) {
            System.out.println("-----------Application Manager Students and Teacher-----------");
            System.out.println("Enter 1: Insert Person ");
            System.out.println("Enter 2: Show information Person");
            System.out.println("Enter 3: Find persions by name: ");
            System.out.println("Enter 4: Add Score for Student");
            System.out.println("Enter 5: Edit score");
            System.out.println("Enter 6: Show All Students in Grade");
            System.out.println("Enter 7: Exit:");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: Insert a Students");
                    System.out.println("Enter b: Insert a Teacher");
                    String text = scanner.nextLine();
                    switch (text) {
                        case "a": {
                            manage.addStudent(InpuStudents());
                            break;
                        }
                        case "b": {
                            manage.addTeacher(InputTeacher());
                            break;
                        }
                            default:
                            System.out.println("Invalid");
                        break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("Enter a: Show all Students");
                    System.out.println("Enter b: Show all Teacher");

                    String text = scanner.nextLine();
                    switch (text) {
                        case "a": {
                            manage.ShowAllStudents();
                            break;
                        }
                        case "b": {
                            manage.ShowAllofTeachers();
                            break;
                        }
                        case "c": {
                            return;
                        }
                            default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "3": {
                    System.out.println("Enter a: Find Student By Name");
                    System.out.println("Enter b: Find Teacher by Name");
                    System.out.println("Enter c: Find High Score");
                    String text = scanner.nextLine();
                    switch (text) {
                        case "a": {
                            System.out.println("Enter name ");
                            String name = scanner.nextLine();
                            manage.FindStudentByName(name);
                            break;
                        }
                        case "b": {
                            String name = scanner.nextLine();
                            manage.FindTeacherByName(name);
                            break;
                        }
                        case "c": {
                            manage.FindHighScore();
                        }
                            default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "4": {
                    System.out.println("Enter Id ");
                    String id = scanner.nextLine();
                    System.out.println("Enter Math");
                    Double math = scanner.nextDouble();
                    System.out.println("Enter English");
                    Double english = scanner.nextDouble();
                    System.out.println("Enter Music");
                    Double music = scanner.nextDouble();
                    System.out.println("Enter Science");
                    Double science = scanner.nextDouble();
                    System.out.println("Enter Physics");
                    Double physics = scanner.nextDouble();

                    Scores gpa = new Scores(math, english, physics, music, science);
                    manage.AddScoreStudents(id, gpa);
                    break;
                }
                case "5": {
                    System.out.println("Enter id ");
                    String _id = scanner.nextLine();
                    System.out.println("Enter subject ");
                    String _subject = scanner.nextLine();
                    manage.EditScoreOfStudents(_id, _subject);
                    break;
                }
                case "6": {
                    System.out.println("Enter grade: ");
                    String grade = scanner.nextLine();
                    manage.ShowScore(grade);
                }
                case "7": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                continue;
            }
        }
    }

    

    public static Teacher InputTeacher() {
        Scanner scanner = new Scanner(System.in);        

        System.out.print("Enter id: ");
        String id = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter subject: ");
        String subject = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, address, phone, age, gender, subject);
        System.out.println("------Update Successful------\n");
        return teacher;
    }

    public static Students InpuStudents() {

        Scanner scanner = new Scanner(System.in);        

        System.out.print("Enter id: ");
        String id = scanner.nextLine();

        System.out.print("Enter name: ");
        String name = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter phone: ");
        String phone = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter gender: ");
        String gender = scanner.nextLine();

        System.out.print("Enter Grade: ");
        String grade = scanner.nextLine();
        Students student = new Students(id, name, address, phone, age, gender, grade);           
        System.out.println("------Update Successful------\n");
        return student;
        
    }
}
