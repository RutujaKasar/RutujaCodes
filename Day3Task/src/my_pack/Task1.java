package my_pack;

public class Task1 {
	public static void main(String args[])
	{
	System.out.println(getDomain("https://en.wikipedia.org/wiki/Main_Page"));

}
      static String getDomain(String str)
	{
		if(str.startsWith("https://"))
		{
			str=str.substring(8);
		}
		else if(str.startsWith("http://"))
		{
			str=str.substring(7);
		}
		int i=str.indexOf('/');
		str=str.substring(0,i);
		return str;
	}
}
