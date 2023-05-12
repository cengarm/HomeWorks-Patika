public class LabAssistant extends Assistant{

    public LabAssistant(String nameSurname, String phone, String email, String classes, String title, String officeNo) {
        super(nameSurname, phone, email, classes, title, officeNo);
    }
    public void joinLab(){
        System.out.println(getNameSurname() + " Lab dersine giriş yaptı!!");
    }

}
