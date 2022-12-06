package SchoolManagementSystem;

public class Students {
    private  int id;
    private  String name;
    private  int grade;
    private  int fessPaid;
    private int feesTotal;

    public Students(int id, String name, int grade){
        this.fessPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;

    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public  void updateFeesPaid(int fees){
        fessPaid+=fees;

    }

    public void add(Students students) {
    }
}
