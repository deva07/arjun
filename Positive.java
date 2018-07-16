
    public class Zeroorevenorodd {
	  public static void main(String[] args){
		int a;
		int temp;
		System.out.println("Enter the number");
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		temp=a;
		if(temp==0){
			System.out.println("Given number is zero");
		}
		else if(a%2==0){
			System.out.println("Given number is even");
		}
		else{
			System.out.println("Given number is odd");
		}
	 }

    }
