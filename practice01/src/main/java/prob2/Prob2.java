package prob2;

public class Prob2 {
	public static void main(String[] args) {
		int j=0;
		for(int i=0;i<9;i++) {
			for(int k=j;k<j+10;k++) {
				System.out.print(k+1+" ");
			}
			System.out.println();
			j++;
		}
		
	}
}
