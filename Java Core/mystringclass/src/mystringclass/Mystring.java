package mystringclass;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

public class Mystring {
	public static char[]  concatination(char[] s1,char[] s2,int l1,int l2)
	{char[] r1 = new char[31];
	
	for(int i=0;i<l1;i++)
	{
		r1[i]=s1[i];
	}
	for(int i=0;i<l2;i++)
	{
		r1[i+l1]=s2[i];
	}
	return r1;
	
		
	}
	public static char[] toCharacterArray(String str1,int l1) throws IOException{
		FileWriter fw=new FileWriter("char.txt");
		fw.write(str1);
		fw.close();
		FileReader fr= new FileReader("char.txt");
		char [] ch=new char[l1];
		int c=0,k=0;
		while((c=fr.read())!=-1)
		{
			ch[k]=(char)c;
			k++;
		}
		
		return ch;
	}
	public static String upper (String s1)
	{
		
		return "a";
		}

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		String str1="pradyumn joshi";
		String str2="yash technologies";
		char [] c1=str1.toCharArray();
		char[] c2=str2.toCharArray();
		char[] conString=concatination(c1,c2,str1.length(),str2.length());
		System.out.println(conString);
		char[] charArray=toCharacterArray(str1,str1.length());
		System.out.println(charArray);
			
	}

}
