import java.time.LocalDate;

public class Student {
    private String studentId;        // รหัสนักศึกษา
    private String name;              // ชื่อนักศึกษา
    private String loginName;         // ชื่อ login
    private String password;          // รหัสผ่าน
    private LocalDate registrationDate; // วันสมัครเข้าเรียน

    // คอนสตรัคเตอร์เพื่อกำหนดค่าเริ่มต้น
    public Student(String studentId, String name, String loginName, String password, LocalDate registrationDate) {
        this.studentId = studentId;
        this.name = name;
        this.loginName = loginName;
        this.password = password;
        this.registrationDate = registrationDate;
    }

    // Getter และ Setter
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    // ฟังก์ชันสำหรับแสดงข้อมูลของนักศึกษา
    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Name: " + name + ", Login: " + loginName + ", Registered on: " + registrationDate;
    }

    // ฟังก์ชันสำหรับเปลี่ยนรหัสผ่าน
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }

}