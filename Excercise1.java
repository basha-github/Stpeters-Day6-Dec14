import java.util.Scanner;

public class Excercise1 {

	public static void main(String[] args) {
	
		// ascending order / desc order 
		// 1 2 15 5 7 3 10
		// Bubble Sort
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of the array");
		int size = sc.nextInt();
		
		int[] num = new int[size];
		System.out.println("enter elements of the array");
		for(int m =0;m<size;m++) {
			num[m] = sc.nextInt();
		}
		
		//int[] num = {15, 4, 3, 2, 1, 20, 7, 8};
		int t;
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i] > num[j]) {
				    t = num[i];
				    num[i] = num[j];
				    num[j]= t;
				}// if
			}// j
		}// i
		for(int k = 0;k<num.length;k++) {
			System.out.print(num[k]+" ");
		}
		
		
		
		
	}

}


