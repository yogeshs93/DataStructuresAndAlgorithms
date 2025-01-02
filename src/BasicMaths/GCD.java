package BasicMaths;

public class GCD {

	public static void main(String[] args) {
		
		Euclidean(18,24);

	}

	private static void gcd(int n1, int n2) {
		int gcd=1;
		for(int i=1;i<=Integer.min(n1,n2);i++) {
			if(n1%i==0 && n2%i==0) {
				gcd=i;
			}
		}
		System.out.println(gcd);
		
	}
	
	private static void gcd1(int n1, int n2) {
		
		for(int i=Integer.min(n1,n2);i>=1;i--) {
			if(n1%i==0 && n2%i==0) {
				System.out.println(i);
				break;
			}
		}
		
		
	}
	
	//Euclidean Algorithm
	
private static void Euclidean(int a, int b) {
		
		while(a>0 && b>0) {
			if(a>b) a=a%b;
			else b=b%a;
		}
		if(a==0) {
			System.out.println(b);
		}
		else {
			System.out.println(a);
		}
		
		
	}

}
