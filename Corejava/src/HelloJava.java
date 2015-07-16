
public class HelloJava {

	public static void main(String[] args) {
	/*
	 * we run this as Run configuration and give the arguments
	 * System.out.println("hello" + " " +  args[0] + " " +  args[1]) ;
	 */
		
		System.out.println(hello(args[0]));
	}

	public static String hello(String args){
		return "hello" + args ;
	}
}
