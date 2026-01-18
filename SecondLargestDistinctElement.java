package assignmentArray;
import java.util.Scanner;
import java.util.Arrays;

//Find the second largest distinct element in the array.


public class SecondLargestDistinctElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Length Of Array Element: ");
		int length=sc.nextInt();
		int arr[]=new int [length];
		
		int max1=arr[0];
		int max2=arr[1];
		
		System.out.println("Enter the Array Element: ");
		for(int i=0;i<length;i++) {
			arr[i]=sc.nextInt();
			if(arr[0]>arr[1]) {
				max1=arr[0];
				max2=arr[1];
			}
			else {
				max2=arr[0];
				max1=arr[1];
			}
		}
		for(int i=2;i<arr.length;i++) {
			if(arr[i]>max1) {
				max2=max1;
				max1=arr[i];
			}
			else if(arr[i]>max2){
				max2=arr[i];
			}
		}
			System.out.println("Second Largest Value is "+max2);
	}

}
