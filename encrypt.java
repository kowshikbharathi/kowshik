
package assign;
import java.util.*;
import java.util.Scanner;
public class umm {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String []r=str.split(" ");
		String output="";
		//splitting given string in array of strings
	//	for (int i=0;i<r.length;i++)
		//{
			//System.out.println(r[i]);
	//	}
     //converting array of string into character array
			for(int i=0;i<r.length;i++)
			{
				//int l=0;
				char c[]=r[i].toCharArray();
			
				//for(int j=0;j<c.length;j++)
				//{
				
					//l++;
				//System.out.print(c[j]);
				//}
				char f[]=new char[26];
				int p=0;
				//converting  value to character at end of program
				for(char d='a';d<='z';d++)
				{
					 f[p]=d;
					p++;
				}
				//System.out.println(f);
				int size=c.length;
				//System.out.print(c.length);
				for(int m=0;m<=size-2;m++)
				{
					int x=0;
					//value of keyword (last letter of the word)
					for(char b='a';b<=c[size-1];b++)
					{
						x++;
						
				}//System.out.print(x);
					int y=0;
					//value of remaining characters
						for(char e='a';e<=c[m];e++)
						{
							y++;
						}//System.out.print(y);
						int z =y-x;
					//	System.out.print(z);
						if(z>0)
						{
							output=output+f[z-1];
							//System.out.print (f[z-1]);
						}
						else
						{
							output=output+f[25+z];
							//System.out.print (f[25+z]);
						}
						}
				
					System.out.print(output+c[size-1]+" ");
			//	System.out.println(output);
			//String a=new String(c+"");
			//System.out.println(c+"");
			}
			
			
		}
}
