package Programmss;



public class Vovalvons {
public static void main(String[] args) {
	
	
	char ch = 'd';
//	
//	if(ch == 'a' || ch == 'e' || ch  == 'i'||ch == 'o'||ch =='u' ) {
//		System.out.println("vowel");
//	}else {
//		System.out.println("consonant");
//	}
	
	switch (ch) {
	case 'a':
	case 'e' :
	case 'i':
	case 'o':
	case 'u':
		System.out.println("vowel");
		break;

	default:
		System.out.println("Consonant");
		break;
	}
}
}
