package epam4;

import java.util.*;
public class t1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

String s=sc.nextLine();
boolean fl=false;
String h[]= {"H","Q","+","9"};
for(int i=0;i<4;i++)
{
	if(s.contains(h[i]))
	{
		fl=true;
	}
}
if(fl==true)
{
	System.out.println("YES");
}
else
	System.out.println("NO");
	}
}
