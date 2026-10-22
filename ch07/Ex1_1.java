/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Ex1_1 {
	public static void main(String[] args) {
	    
	    Scanner keyin = new Scanner(System.in);
        int[] m = new int[7]; // 只能使用m[0],m[1],…,m[6]
		int[] M = new int[31]; // for month
		// 只能使用dayofweek[0],dayofweek[1],…,dayofweek[6]
		char[] dayofweek = new char[] {'日','一','二','三','四','五','六'}; 
		int total = 0, i;
		for (i = 0; i < 7; i++) // 累計7天的花費
		 {
			System.out.print("輸入星期" + dayofweek[i] + "的花費:");
            // m[i] = keyin.nextInt();
            M[i] = keyin.nextInt();
            // total = total + m[i];            
			total = total + M[i];
		 }
		System.out.println("一星期總花費:" + total);
		keyin.close();
	}
}
