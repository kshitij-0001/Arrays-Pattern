package assignmentArray;
import java.util.Scanner;
import java.util.ArrayList;

// Given an integer array and a number X, check whether X is present in the array.


public class PresentOrNot {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size of Array: ");
		int size=sc.nextInt();
		
		int arr[]= new int[size];
		
		System.out.println("Enter Array "+size+ " Element: ");
		
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Check the element is present in this array or not: ");
		System.out.println("Enter The Element: ");
		
		int element=sc.nextInt();
		boolean found=false;
		
		for(int i=0;i<size;i++) {
			if(arr[i]==element) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println("Found");
		}
		else {
			System.out.println("Not Found");
		}
		
	}
}
