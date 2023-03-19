import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Base,Power;
        System.out.print("Enter the base value : ");
        Base = sc.nextInt();
        System.out.print("Enter the power value : ");
        Power = sc.nextInt();
        int res = power(Base,Power);
        System.out.println(Base +"^"+ Power +"="+ res);
    }

    public  static int power(int base,int power)
    {
        if(power !=0)
        {
            return (base*power(base,power-1));
        }
        else {
            return 1;
        }
    }
}