public class Teacher {
    String name;
    String phone;
    String branch;

    Teacher(String name, String branch, String phone){
        this.name = name;
        this.branch =branch;
        this.phone=phone;

    }
    void print(){
        System.out.println("Adı :" + this.name);
        System.out.println("Telefonu :" + this.phone);
        System.out.println("Bölümü :" + this.branch);
    }

}

