import java.util.Scanner;

public class RahulProblem {
	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many records u want to execute");
		int n = sc.nextInt();
		int dollar,size;
		int[] heights;
		for(int i=1;i<=n;i++) {
			System.out.println("enter total no of Buildings");
			size = sc.nextInt();
			
			heights = new int[size];
			
			System.out.println("amount in dollar");
			dollar = sc.nextInt();
			System.out.println("enter All "+size+" Buildings Heights");
			
			for(int k=0;k<size;k++) {
				heights[k]= sc.nextInt();
			}
			int max = heights[0],count=1;
			
			for(int m=1;m<size;m++) {
				if(heights[m] > max) {
					max = heights[m];
					count++;
				}
			}
			
			System.out.println("Result--->"+dollar * count);
			}
	}

}
