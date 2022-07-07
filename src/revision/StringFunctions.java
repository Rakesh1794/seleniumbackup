package revision;

public class StringFunctions {
public static void main(String[] args) {
	String s= "Rakesh";
	//to find length
	int i=s.length();
	System.out.println(i);
	//to char using index
	char f=s.charAt(3);
	System.out.println(f);
	//to index of given string
	int k=s.indexOf("e");
	int l=s.lastIndexOf("k");
	System.out.println(k);
	System.out.println(l);
	//to check whether s contains
	boolean h=s.contains("ak");
	System.out.println(h);
	//to compare two string
	boolean j = s.equals("Rakesh");
	System.out.println(j);
	boolean d=s.equalsIgnoreCase("rakesh");
}
}
