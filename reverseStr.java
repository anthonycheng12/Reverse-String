package reverse;

public class reverseStr {

	
	
public static void rStr(String str){
	String temp = "";
	for(int i = str.length() - 1; i >= 0; i--){ //start the index at the strings length a.k.a the last character
		temp += str.charAt(i); //finds the character at the given index
	}
	System.out.println(temp); //prints the reversed string
}
	
	public static void main(String[] args) {
		rStr("hello"); //can be any string

	}
	
	
	

}
