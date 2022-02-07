public class test3{
	public static void main(String[] args){
		int x = 0;
		for(x = 0 ;x <=10 ; x++){
		if(x > 7){
			break;
		}
		if(x % 3 == 0){
			continue;
		}
		System.out.print(x);
		}
	}
}