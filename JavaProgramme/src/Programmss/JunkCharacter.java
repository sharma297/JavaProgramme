package Programmss;

public class JunkCharacter {
public static void main(String[] args) {
	
	String s = "%%%%$$$##@###@#234444Hem";
	String rev =s.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(rev);
}
}
