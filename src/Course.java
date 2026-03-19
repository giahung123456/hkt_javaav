import java.util.Scanner;

public class Course {
    private String courseID;
    private String courseName;
    private int credit;
   private double tuitionFee;
   private String intructor;
   private boolean status;

    public Course() {
    }

    public Course(String courseID, String courseName, int credit, double tuitionFee, String intructor, boolean status) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.credit = credit;
        this.tuitionFee = tuitionFee;
        this.intructor = intructor;
        this.status = status;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public double getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(double tuitionFee) {
        this.tuitionFee = tuitionFee;
    }

    public String getIntructor() {
        return intructor;
    }

    public void setIntructor(String intructor) {
        this.intructor = intructor;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Course inputData(Scanner scanner) {

        System.out.print("Enter course ID: ");
       String courseID = scanner.nextLine();
//        boolean checkInput = courseID.matches("[CO]+d{3}");
//        if (!checkInput) {
//            System.out.println("Invalid course ID");
//            return null;
//        }
        System.out.print("Enter course name: ");
       String courseName = scanner.nextLine();
//      if(courseName.length()<5||courseName==null){
//          System.out.println("Invalid course name");
//          return null;
//      }
        System.out.print("Enter credit: ");
       int credit = scanner.nextInt();
        scanner.nextLine();
//        if(credit<1||credit>100){
//            System.out.println("Invalid credit");
//            return null;
//        }
        System.out.print("Enter tuition fee: ");
       double tuitionFee = scanner.nextDouble();
        scanner.nextLine();
//        if(tuitionFee<0){
//            System.out.println("Invalid tuition fee");
//            return null;
//        }
        System.out.print("Enter intructor: ");
       String intructor = scanner.nextLine();

//        if(intructor==null){
//            System.out.println("Invalid intructor");
//            return null;
//        }
        System.out.print("Enter status: ");
       boolean status = scanner.nextBoolean();
        if(status==true){
            System.out.println("Đang mở");
        }else {
            System.out.println("Đã đóng");
        }
        return new Course(courseID,courseName,credit,tuitionFee,intructor,status);
    }
    public void displayData() {
        System.out.println("-----------------------------------");
        System.out.println("Course ID: " + courseID);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credit: " + credit);
        System.out.println("Tuition fee: " + tuitionFee);
        System.out.println("Intructor: " + intructor);
        System.out.println("Status: " + status);
        System.out.println("-----------------------------------");
    }
}
