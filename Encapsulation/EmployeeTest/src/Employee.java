public class Employee {
    public int id;
    public String name;
    public String surName;
    public double salery;
    public int experince;

    public Employee(){

    }

    public Employee(int id, String name, String surName, double salery, int experince) {
        this.surName = surName;
        this.salery = salery;
        this.experince = experince;
        this.id = id;
        this.name = name;
    }


    public void employeeInfoPrint()
    {
        System.out.println("*********EMPLOYEE INFOS*********");
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("SurName : " + surName);
        System.out.println("Experince : " + experince);
    }

    public void makeARaise(int raiseinfo)
    {
        System.out.println("You gain raise : "+ raiseinfo);
        System.out.println("Your current current salary : "+ (salery + raiseinfo));

    }
    public void restart(String OS, String who ){
        System.out.println(who +" currently " + OS + " It is  formatting the operating system. ");
    }
}
