package assignmentArray;
import java.util.Scanner;
import java.util.Arrays;

// Replace all negative elements in the array with 0 and print the updated array.

public class ReplaceNegativeElement {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int i;
		System.out.println("Declare the Array Length: ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the "+size+" array element");;
		for( i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(i=0;i<size;i++) {
			if(arr[i]<0) {
				arr[i]=0;
			}
		}
		System.out.println("the Modified Array is:"+Arrays.toString(arr));
		sc.close();
	}

}
