package ordina3NumFunc;

public class ordina3NumFunc {

	public static void main(String[] args) {
		int insNum1 = 5;
		int insNum2 = 2;
		int insNum3 = 10;
		
		if(insNum1 < insNum2) {
			if(insNum1 < insNum3) {
				if(insNum2 < insNum3) {
					ordina3Num(insNum1,insNum2,insNum3);
				}else {
					ordina3Num(insNum1,insNum3,insNum2);
				}
			}else {
				ordina3Num(insNum3,insNum1,insNum2);
			}
		}else {
			if(insNum1 < insNum3) {
				ordina3Num(insNum2,insNum1,insNum3);
			}else {
				if(insNum2 < insNum3) {
					ordina3Num(insNum2,insNum3,insNum1);
				}else {
					ordina3Num(insNum3,insNum2,insNum1);
				}
			}
		}
	}
	
	static void ordina3Num(int num1, int num2, int num3){
		int a = num1;
		int b = num2;
		int c = num3;
		
		System.out.println("I numeri riordinati sono: "+a+" "+b+" "+c);
	}

}
