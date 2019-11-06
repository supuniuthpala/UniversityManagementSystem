import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        int age;
        String course;
        int choice;
        int courseNo;

        System.out.println("Welcome to University Management System\n\n");
        System.out.println("Please select an option to proceed");
        System.out.println("Press [1] Register as a Student");
        System.out.println("Press [2] Register as a Lecturer");

        choice = input.nextInt();
        Course cs = new Course();

        if (choice == 1) {
            System.out.println("Student Registration");
            System.out.println("");
            System.out.println("Please Submit following information");
            System.out.println("1:  Name:");
            name = input.next();
            System.out.println("2:  Age:");
            age = input.nextInt();
            System.out.println("3: Select course number from following list,");
            System.out.println("[1]  SENG 11111-Introduction to programming");
            System.out.println("[2]  SENG 11112-Fundamentals of Engineering");
            System.out.println("[3]  SENG 11113-Data Structures and Algorithem");
            courseNo = input.nextInt();
            Student std=new Student();

            switch (courseNo){
                case 1:
                    cs.SetCourse(CourseName.SENG1111_Introduction_to_Programming);
                    break;
                case 2:
                    cs.SetCourse(CourseName.SENG1112_Fndamantales_of_Engineering);
                    break;
                case 3:
                    cs.SetCourse(CourseName.SENG1113_Data_Structures_and_Algorithms);
                    break;
                default:
            }
            std.SetAge(age);
            std.SetName(name);
            System.out.println("Student Registration Completed");
            System.out.println("Name    :"+std.GetName());
            System.out.println("Age     :"+std.GetAge());
            System.out.println("Subject :"+cs.GetCourse());

        }else{
            System.out.println("Lecturer Registration");
            System.out.println("");
            System.out.println("Please Submit following information");
            System.out.println("1:  Name:");
            name=input.next();
            System.out.println("2:  Age:");
            age=input.nextInt();
            System.out.println("3: Select course number from following list,");
            System.out.println("[1]"+CourseName.SENG1111_Introduction_to_Programming);
            System.out.println("[2]"+CourseName.SENG1112_Fndamantales_of_Engineering);
            System.out.println("[3]"+CourseName.SENG1113_Data_Structures_and_Algorithms);
            courseNo=input.nextInt();
            Lecturer lecturer=new Lecturer();
            switch (courseNo){
                case 1:
                    cs.SetCourse(CourseName.SENG1111_Introduction_to_Programming);
                    break;
                case 2:
                    cs.SetCourse(CourseName.SENG1112_Fndamantales_of_Engineering);
                    break;
                case 3:
                    cs.SetCourse(CourseName.SENG1113_Data_Structures_and_Algorithms);
                    break;
                default:
            }
            lecturer.SetLName(name);
            lecturer.SetLAge(age);
            System.out.println("Lecturer Registration Completed");
            System.out.println("Name    :"+lecturer.GetLName());
            System.out.println("Age     :"+lecturer.GetLAge());
            System.out.println("Subject :"+cs.GetCourse());
        }

    }
}
