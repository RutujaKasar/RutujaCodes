package my_pack;

public class CheckPlaindrome {
	static int firstDigit(int n)
	{
		while(n>=10)
		{
			n=n/10;
		}
		return n;
	}
	static int lastDigit(int n)
	{
		return (n%10) ;
	}
	static void printEle(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(firstDigit(arr[i])==lastDigit(arr[i]))
			{
				System.out.print("") ;
			}
			else
			{
				System.out.println(arr[i]) ;
			}
		}
	}
	 public static void main(String[]args)
     {
    	 int arr[] = {50,46,383,85,85,545,50,85,464};
         printEle(arr) ;
     }
}
