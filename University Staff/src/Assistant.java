public class Assistant extends Academician{

    private String officeNo;




    public Assistant(String nameSurname, String phone, String email, String classes, String title, String officeNo) {
        super(nameSurname, phone, email, classes, title);
        this.officeNo = officeNo;
    }
    public void quiz(){
        System.out.println(this.getNameSurname() +  " Sınav Yaptı");
    }

    public String getOfficeNo() {
        return officeNo;
    }

    public void setOfficeNo(String officeNo) {
        this.officeNo = officeNo;
    }
}
