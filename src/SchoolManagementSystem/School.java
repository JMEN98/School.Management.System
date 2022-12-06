package SchoolManagementSystem;
import  java.util.List;
public class School {
    private List <Teachers> teachers;
    private List <Students> students;


    private  int totalMoneyEarned;
    private  int TotalMoneyspent;

    public School(List <Teachers> teachers, List <Students> student){
        this.teachers=teachers;
        this.students=student;
        totalMoneyEarned=0;
        totalMoneyEarned=0;
    }

    public List<Students> getStudents() {
        return students;
    }

    public void setStudents(List<Students> students) {
        this.students = students;
    }

    public  void  addStudent(Students students){
        students.add(students);
    }

    public List<Teachers> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teachers> teachers) {
        this.teachers = teachers;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned = totalMoneyEarned;
    }

    public int getTotalMoneyspent() {
        return TotalMoneyspent;
    }

    public void setTotalMoneyspent(int totalMoneyspent) {
        TotalMoneyspent = totalMoneyspent;
    }

    public  void  undateTotalMoneySpent(int moneyspent){
        totalMoneyEarned=totalMoneyEarned-moneyspent;
        totalMoneyEarned-=moneyspent;

    }
}
