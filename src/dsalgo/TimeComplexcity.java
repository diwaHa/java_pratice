package dsalgo;

public class TimeComplexcity {

	public static void main(String srgs[]) {
		
		double time =  System.currentTimeMillis();
		
		TimeComplexcity tm = new TimeComplexcity();
		System.out.println(tm.findSum(999999));
		System.out.println("time taken "+(System.currentTimeMillis()-time)+" millosecond");
	}
//	public int findSum(int n) {
//		return n+(n+2)/2;
//	}		

	public int findSum(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++) {
			sum =sum+i;
		}
		return sum;
	}
	
} 


