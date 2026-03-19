import java.util.Scanner;

public class CourseManage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CourseBusiness courseManage = CourseBusiness.getInstance();

        int choice=0;
        do{
            System.out.println("menu");
            System.out.println("1. Display Courses");
            System.out.println("2. Add Course");
            System.out.println("3. Update Course");
            System.out.println("4. Delete Course");
            System.out.println("5. Search Course");
            System.out.println("6. Filter Course");
            System.out.println("7. Sort Course");
            System.out.println("8. Exit");
            System.out.print("Select an option: ");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                  courseManage.displayAll();
                  break;
                case 2:
                    courseManage.addCourse(input);
                    break;
                case 3:
                    String idUdate = input.nextLine();
                    courseManage.updateCourse(idUdate, input);
                    break;
                case 4:
                    String idDelete = input.nextLine();
                    courseManage.deleteCourse(idDelete);
                    break;
                case 5:
                    String keyword=input.nextLine();
                    courseManage.searchByInstructor(keyword);
                    break;
                case 6:
                    courseManage.filterByActiveCourse();
                    break;
                case 7:
                    courseManage.sortByFeeDesc();
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Wrong input!");
                    break;

            }
        }while(choice!=8);
    }

}
