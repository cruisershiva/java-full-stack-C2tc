package org.tnsif.looping;

import java.util.Scanner;;

public class WhileLoopExecutor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(n>=1)
		{
			System.out.print(n+" ");
			n--;
		}
		s.close();
	}

}
