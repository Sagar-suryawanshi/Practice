
public class Armstrong {
	public static void main(String[] args) {
		int n=153;
		int temp=n;
		int rem;
		int sum=0;
		while(temp!=0) {
			rem=temp%10;
			sum=sum+rem*rem*rem;
			temp=temp/10;
		}
		if(sum==n) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("not armstrong");
		}
	}

}
