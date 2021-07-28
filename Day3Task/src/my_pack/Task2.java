package my_pack;



public class Task2 {
public static void main(String[] args) {
	System.out.println(checkWebSecurity("https://en.wikipedia.org/wiki/Main_Page"));
	
}
static String checkWebSecurity(String str)
{
	if(str.startsWith("https"))
	{
		System.out.println("Website is Secure");
	}
	else
	{
		System.out.println("Website is not Secure");
	}
	return str;
	}
}
