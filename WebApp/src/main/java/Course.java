public class Course {
    private String courseId;       // รหัสรายวิชา
    private String courseName;     // ชื่อรายวิชา
    private int creditHours;       // จำนวนหน่วยกิจ

    // คอนสตรัคเตอร์เพื่อกำหนดค่าเริ่มต้น
    public Course(String courseId, String courseName, int creditHours) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.creditHours = creditHours;
    }

    // Getter และ Setter
    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    // ฟังก์ชันสำหรับแสดงข้อมูลของรายวิชา
    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Course Name: " + courseName + ", Credit Hours: " + creditHours;
    }

    public static void main(String[] args) {
        // ตัวอย่างการสร้างอ็อบเจ็กต์ของรายวิชา
        Course course1 = new Course("CS101", "Introduction to Computer Science", 3);

        // แสดงข้อมูลของรายวิชา
        System.out.println(course1);

        // การเปลี่ยนแปลงข้อมูลรายวิชา
        course1.setCourseName("Advanced Computer Science");
        course1.setCreditHours(4);

        // แสดงข้อมูลที่อัปเดต
        System.out.println("Updated Course: " + course1);
    }
}
