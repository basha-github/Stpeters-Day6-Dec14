
public class Excercise4 {

	public static void main(String[] args) {
	
		String data = "Welcome to Java World";
		
		data = data.toUpperCase();
		
		int[] count = {
				0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
				};
		char ch = ' ';
		int index;
		for(int i=0;i<data.length();i++) {
			ch = data.charAt(i);
			if(ch >='A' && ch <='Z') {
				index = (int)(ch -65);
				count[index]++;// 'A'  65 % 65
			}
		}
		for(int i=0;i<26;i++) {
			if(count[i] > 0)
			System.out.println("["+(char)(i+65)+"]--->"+count[i]);
		}
	}

}
