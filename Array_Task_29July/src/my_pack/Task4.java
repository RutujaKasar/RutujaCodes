package my_pack;

public class Task4 {
public static void main(String[] args) {
	int arr[]= {2,7,8,3,4,6,10,17,23};
	for (int i = 0; i < arr.length; i++)
	{
		boolean isPrime=true;
		for(int j=2; j<arr[i];j++)
		{
			if(arr[i]%j==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.print(arr[i]+" ");
		}

	}
	
	
}
	
}
