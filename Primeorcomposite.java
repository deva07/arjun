import java.util.Scanner;

public class Primeorcomposite {
	public static void main(String[] args){
		int i;
		int n;
		int c=0;
		
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		if(args.length==0){
			System.out.println();
		}
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		
			if(c==2)
				System.out.println("prime number");
			else
				System.out.println(" composite number");
			sc.close();
		
	}

}
