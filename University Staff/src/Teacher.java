public class Teacher extends Academician {

    private String doorNo;
    public Teacher(String nameSurname, String phone, String email, String classes, String title,String kapiNo) {
        super(nameSurname, phone, email, classes, title);
        this.doorNo = doorNo;

    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }
}
