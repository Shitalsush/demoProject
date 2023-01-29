package projectDemo;
import java.util.Scanner;
public class SumOfDigit {

	public static void main(String[] args) {
		int n,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements that u want to store:");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Array is:");
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
		
		for(int i=0;i<size;i++)
		{
			while(a[i]>0)
			{
			
			n=a[i]%10;
			sum=sum+n;
			a[i]=a[i]/10;
			}
			System.out.println("Sum of digit is:"+sum);
			sum=0;
		}
		

	}

}
