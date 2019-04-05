package epam4;

import java.io.*;
import java.util.*;

public class t4 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc=new Scanner(System.in);
         int q=sc.nextInt();
         Stack<Integer> r=new Stack<Integer>();
         Stack<Integer> f=new Stack<Integer>();
         while(q>0)
         {
             int t=sc.nextInt();
             if(t==1)
             {
                 int x=sc.nextInt();
                 r.push(x);
             }
             else
             {
                 if(f.empty())
                 {
                 while(!r.empty())
                 {
                     f.push(r.peek());
                     r.pop();
                 }
                 }
                 if(!f.empty())
                 {
                     if(t==2)
                     {
                         f.pop();
                     }
                     if(t==3)
                     {
                         System.out.println(f.peek());
                     }
                 }
             }
            q--;
         }
    }
}

