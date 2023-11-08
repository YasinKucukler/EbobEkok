import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.println("Girilen iki sayının EBOB'u: " + Ebob(n1,n2));
        System.out.println("Girilen iki sayının EKOK'u: " + Ekok(n1,n2));
    }
    static int Ebob(int n1, int n2)
    {
        int i= 1, ebob = 0;
        while(i<=n1)
        {
            if(n1 % i == 0 && n2 %i == 0)
            {
                ebob = i;
            }
            i++;
        }
        return ebob;
    }
    static int Ekok(int n1, int n2)
    {
        int i =1, ekok = 0;
        while(i <= n1*n2)
        {
            if((i%n1 == 0) && (i%n2 == 0))
            {
                ekok = i;
                break;
            }
            i++;
        }
        return ekok;
    }
}