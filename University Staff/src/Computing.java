public class Computing extends Officer {
    private  String duty;

    public Computing() {
    }

    public Computing(String nameSurname, String phone, String email,String duty) {
        super(nameSurname, phone, email);
        this.duty = duty;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }
    public void network(){
        System.out.println(getNameSurname() +"  Görevine başladı ");
    }
}
