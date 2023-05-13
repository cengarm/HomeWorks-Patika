public class Main {
    public static void main(String[] args){
        Employee fabrika=new Employee("Mehmet Kaya",9800,1,2023);
        fabrika.tax();
        fabrika.bonus();
        fabrika.raiseSalary();

        System.out.println(fabrika.toString());
    }
}

