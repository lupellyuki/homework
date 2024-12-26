import java.time.LocalDate;

public class Enrollment {
    private Student student;        // นักศึกษา (อ้างอิงถึงคลาส Student)
    private Course course;          // รายวิชา (อ้างอิงถึงคลาส Course)
    private LocalDate enrollmentDate; // วันที่ลงทะเบียนรายวิชา

    // คอนสตรัคเตอร์เพื่อกำหนดค่าเริ่มต้น
    public Enrollment(Student student, Course course, LocalDate enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    // Getter และ Setter
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public LocalDate getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(LocalDate enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    // ฟังก์ชันสำหรับแสดงข้อมูลการลงทะเบียน
    @Override
    public String toString() {
        return "Student: " + student.getName() + " (ID: " + student.getStudentId() + "), Course: " + course.getCourseName() 
               + " (Course ID: " + course.getCourseId() + "), Enrollment Date: " + enrollmentDate;
    }

    public static void main(String[] args) {
        // สร้างอ็อบเจ็กต์ของนักศึกษา
        Student student1 = new Student("12345", "John Doe", "johndoe123", "password123", LocalDate.of(2024, 12, 1));

        // สร้างอ็อบเจ็กต์ของรายวิชา
        Course course1 = new Course("CS101", "Introduction to Computer Science", 3);

        // สร้างอ็อบเจ็กต์ของการลงทะเบียน
        Enrollment enrollment1 = new Enrollment(student1, course1, LocalDate.of(2024, 12, 15));

        // แสดงข้อมูลการลงทะเบียน
        System.out.println(enrollment1);
    }
}
