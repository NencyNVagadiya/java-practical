import java.util.Scanner;

public class VendingMachine 
{

    enum Coin 
    {
        ONE, TWO, FIVE, TEN
    }

    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);

        int total = 0;

        while (total < 15)
             {

            System.out.print("Enter Coin: ");
            Coin c = Coin.valueOf(sc.next().toUpperCase());

            switch (c) {
                case ONE:
                    total += 1;
                    break;

                case TWO:
                    total += 2;
                    break;

                case FIVE:
                    total += 5;
                    break;

                case TEN:
                    total += 10;
                    break;
            }

            System.out.println("Total = " + total);
        }

        System.out.println("Paid. Change = " + (total - 15));

        sc.close();
    }
}
