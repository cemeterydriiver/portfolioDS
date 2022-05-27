public class Main{
	public static void main(string[] args){
		int a1 = 15;
		int n = 20;
		int r = 17;
		int an = a1+(n-1)*r;
		System.out.println(an);

		a1 = an - (n-1)*r;
		System.out.println(an);
		//an = a1 + (n-1)*r
		//an = an - (n-1)*r

		r = (an - a1)/(n - 1);
		System.out.println(r);
		//an = a1 + (n-1)*r
		//r = an - a1 + (n-1)/
		//r = (an - a1)/(n-1)

		n = (an-r+a1)/r;
			System.out.println(r);
		//an = a1 + (n-1)*r
		//an = a1 + nr - r
		//nr = an - a1 - r
		//n = (an - r =a1)/r

	}
}


