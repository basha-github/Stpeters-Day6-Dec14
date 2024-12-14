
public class OwnSplitStr {

	public static void main(String[] args) {
	
		String data = "Welcome to Hyd Good Morning ";
		
		String[] words = cutIntoWords(data);
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
	}

	private static String[] cutIntoWords(String data) {
		
		char ch = ' ';
		String newWord = "";
		int size = 100;
		String[] words = new String[size]; 
		int index = 0;
		for(int i=0;i<data.length();i++) {
			ch = data.charAt(i);
			if(ch == ' ') {
				words[index] = newWord;
				index++;
				newWord = "";
			}
			else {
				newWord = newWord +ch;
			}
		}// for
		if(newWord.length() > 0) {
			words[index] = newWord;
		}
		
		String[] resWords = new String[index];
		
		for(int i=0;i<index;i++) {
			resWords[i] = words[i];
		}
		
		return resWords;
	}

}
