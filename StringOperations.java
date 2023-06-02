public class StringOperations{
	public static void main(String[] args){
	
		String bob = "Bob Collins";
		System.out.println("My name: "+bob);

		String bob1 = bob.replace('B', 'A');
		String bob2 = bob1.replace('C', 'Z');
		System.out.println("Bob replaced chars: "+bob2);

		String url1 = "www.google.com";
		System.out.println(" URL = "+url1);

		String url2 = url1.substring(4, 10)+"1331";
		System.out.println("Url extraction method 1: "+url2);

		int urldot1 = url1.indexOf(".");
		int urldot2 = url1.indexOf(".", urldot1+1);
		String url3 = url1.substring(urldot1+1, urldot2)+"1331";
		System.out.println(" URL extraction method 2: "+url3);
	
	}
}