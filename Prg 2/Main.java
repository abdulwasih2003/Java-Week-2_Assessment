public class Main {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.Name="Ram Kumar";
        e1.age=25;
        e1.ph=824545;
        e1.Address="51,T.Nagar,Chennai";
        e1.salary=35000;

        Manager e2=new Manager();
        e2.Name="Sam";
        e2.age=30;
        e2.ph=82445545;
        e2.Address="510,Anna Nagar,Chennai";
        e2.salary=65000;

        System.out.println("Name : "+e1.Name);
        System.out.println("Age : "+e1.age);
        System.out.println("Phone Number : "+e1.ph);
        System.out.println("Address : "+e1.Address);
        e1.printSalary(e1.salary);
        System.out.println();
        System.out.println("Name : "+e2.Name);
        System.out.println("Age : "+e2.age);
        System.out.println("Phone Number : "+e2.ph);
        System.out.println("Address : "+e2.Address);
        e2.printSalary(e2.salary);
    }

}