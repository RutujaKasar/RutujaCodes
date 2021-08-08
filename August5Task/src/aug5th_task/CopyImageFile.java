package aug5th_task;
import java.io.*;
public class CopyImageFile {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			
		
   FileInputStream in= new FileInputStream("C:\\Users\\NI3 COM\\Desktop\\Revature\\revature_India_26th_July_13Week\\Week1(Git,Java)\\notes & images");
   FileOutputStream o = new FileOutputStream("D:\\copy.jpg");
   BufferedInputStream B=new BufferedInputStream(in);
   BufferedOutputStream Bo= new BufferedOutputStream(o);
   
   int a =0;
   while(a!=-1) {
	   a=B.read();
	   Bo.write(a);
   }
   B.close();
   Bo.close();
		}
		 catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
