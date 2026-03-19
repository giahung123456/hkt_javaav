import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class CourseBusiness {
    private static CourseBusiness instance;
    private  List<Course> courses;

    private CourseBusiness() {
        courses = new ArrayList<>();

    }
 public static CourseBusiness getInstance(){
        if(instance==null){
            instance = new CourseBusiness();
        }
        return instance;
 }

    public void displayAll() {
        for (Course course : courses) {
            System.out.println("-----------------------");
            System.out.println("Course ID: " + course.getCourseID());
            System.out.println("Course Name: " + course.getCourseName());
            System.out.println("Credit: " + course.getCredit());
            System.out.println("Tuition fee: " + course.getTuitionFee());
            System.out.println("Intructor: " + course.getIntructor());
            System.out.println("Status: " + course.isStatus());
            System.out.println("-----------------------------------");
        }

    }
    public void addCourse(Scanner scanner) {

        Course course = new Course();
        Course newCourse = course.inputData(scanner);
        for (Course cour : courses) {
            if (cour.getCourseID() == newCourse.getCourseID()) {
                System.out.println("id trùng,không dc thêm");
                return;
            }
        }
        courses.add(newCourse);

    }
    public void updateCourse  (String id, Scanner scanner) {

        for (Course course : courses) {
            if (!Objects.equals(id, course.getCourseID())) {
                System.out.println("-----------------------------");
                System.out.print("Name Update: " );
                course.setCourseName(scanner.nextLine());
                System.out.print("Credit: " );
                int creditUd = scanner.nextInt();
                scanner.nextLine();
                course.setCredit(creditUd);

                System.out.print("Tuition fee: " );
                double tuitionFeeUd = scanner.nextDouble();
                scanner.nextLine();
                course.setTuitionFee(tuitionFeeUd);
                System.out.print("Intructor: " );
                course.setIntructor(scanner.nextLine());
                System.out.print("Status: " );
                course.setStatus(scanner.nextBoolean());

                System.out.println("-----------------------------");
                return;
            }
        }
        System.out.println("id đã tồn tại không dc thêm");


    }
    void  deleteCourse(String id) {
        for (Course course : courses) {
            if (Objects.equals(id, course.getCourseID())) {
                courses.remove(course);
            }
        }
    }
    void searchByInstructor(String keyword) {
        int count=0;
        for (Course course : courses) {
            if (Objects.equals(keyword, course.getIntructor())) {
                course.displayData();
                count++;
            }
        }
        System.out.println("số lượng: "+count);
    }
   public void filterByActiveCourse() {
        for (Course course : courses) {
            if (course.isStatus()) {
                course.displayData();
            }
        }
   }

}
