public class Q{
	int a = 6;
	public void method(){
		int a = 8;
		a = a +1;//a = 9
		this.a = a +2;//this.a = 11

		System.out.print(a);
	}
}

public class Qtest{
	public static void main(String[] args){
		Q q = new Q();
		q.method();
		System.out.print(q, a);
	}
}