package Programmss;

import java.io.StringBufferInputStream;

public class ReverseWithBuffer {

	public static void main(String[] args) {
		
		String s = "Shamra";
		StringBuffer bs = new StringBuffer(s);
		StringBuffer ss=bs.reverse();
		System.out.println(ss);
	}
}
