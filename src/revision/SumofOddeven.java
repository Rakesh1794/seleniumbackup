package revision;

public class SumofOddeven {

	public static void main(String[] args) {
		int oddcount=0,evencount=0;
		for (int i = 1; i <=100; i++) {
			if(i%2==1) {
				oddcount=oddcount+i;
			}else {
				evencount= evencount+i;
			}
		}
		System.out.println("count of odd nos:" +oddcount);
		System.out.println("count of even nos:" +evencount);

	}

}
