public class Employee { // Super sınıf
    private String nameSurname;
    private String phone;
    private String email;

    public Employee() {
    }

    public Employee(String nameSurname, String phone, String email) {
        this.nameSurname = nameSurname;
        this.phone = phone;
        this.email = email;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void enter(){
        System.out.println(this.nameSurname + " Üniversiteye giriş yaptı !!");
    }
    public void exit(){
        System.out.println(this.nameSurname + " Üniversiteden çıkış yaptı !!");
    }
    public void dininghall(){
        System.out.println(this.nameSurname + " Yemekhaneye giriş yaptı !!");
    }
}
