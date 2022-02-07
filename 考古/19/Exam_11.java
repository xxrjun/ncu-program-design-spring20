public class Exam_11{
	public static void main(String[] args){
		double m = 2.5;
		int n = 3;
		double result = 0;
		result = pow(m,n);
		System.out.println(result);
	}
	public  static double pow(double m , int n){
		double mCal;
		mCal = m;
		int count = 0 ;
		while(count < n - 1){
			mCal *= m;
			count++;
		}
		return mCal;
	}
}