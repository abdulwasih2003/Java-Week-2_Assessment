public class Main{
    public static void main(String[] args) {
        Employee emp1=new Employee();
        Employee emp2=new Employee();
        Employee emp3=new Employee();
        emp1.Name="Robert";
        emp1.year=1994;
        emp1.Address="64-C Walls Street";
        emp2.Name="Sam";
        emp2.year=2000;
        emp2.Address="68-D Walls Street";
        emp3.Name="John";
        emp3.year=1999;
        emp3.Address="26-B Walls Street";
        System.out.println("Name\t\tYear of joining\t\tAddress");
        System.out.println();
        System.out.println(emp1.Name+"\t\t\t"+emp1.year+"\t\t"+emp1.Address);
        System.out.println(emp2.Name+"\t\t\t\t"+emp2.year+"\t\t"+emp2.Address);
        System.out.println(emp3.Name+"\t\t\t"+emp3.year+"\t\t"+emp3.Address);
    }
}

