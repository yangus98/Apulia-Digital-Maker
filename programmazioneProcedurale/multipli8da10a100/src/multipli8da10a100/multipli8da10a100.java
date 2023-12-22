package multipli8da10a100;

public class multipli8da10a100 {

	public static void main(String[] args) {
		
		int start = 10;
		
		while (start % 8 != 0) {
			start = start + 1;
		}
		
		for(int i = start; i <= 100; i = i + 8) {
			System.out.print(i+" ");
		}
	}
}
