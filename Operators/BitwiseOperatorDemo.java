//Program to demonstrate bitwise operator
package org.tnsif.operators;

public class BitwiseOperatorDemo {

	public static void main(String[] args) {
		int x=13, y=9;
		System.out.println(x&y);          //1101 + 1001 = 1001  (Both should be true or 1 the result will be 1)
		System.out.println(x|y);          //1101 | 1001 = 1101   (Any one condn. will be 1 or both are 1 then its 1 )
		System.out.println(x^y);          //1101 ^ 1001 = 0100 (If both condn. are same then result will be 0)
		System.out.println(8>>1);         //8/(2^1)
		System.out.println(8<<1);         //8*(2^1)

	}

}
