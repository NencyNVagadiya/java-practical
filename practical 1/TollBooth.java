import java.util.Scanner;
public class TollBooth
{
    public static void main(String[] args)
    {
        int total=0;
        int c=0;
        int b=0;
        int t=0;
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.print("Enter your vehicle type: ");
            String i=sc.next();
            if(i.equals("bike"))
            {
                total+=20;
                b++;
            }
             if(i.equals("car"))
            {
                total+=50;
                c++;
            }
             if(i.equals("truck"))
            {
                total+=150;
                t++;
            }
            if(i.equals("done"))
            {
                break;
            }
        }
        System.out.println("Total toll: " +total);
        if(b>c && b>t){
            System.out.println("Most frequant: Bike");
        }
         if(c>b && c>t){
            System.out.println("Most frequant: Car");
        }
         if(t>c && t>b){
            System.out.println("Most frequant: Truck");
        }
        sc.close();
    }
}
