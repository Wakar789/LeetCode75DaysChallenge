
public class StringPractice {
	
	public static void main(String args[]) {
	
	//String : String is the type of Object that can store sequence of character's as an elements.
	//There are two way of creating String in Java
	//1.String Literal(static memory)   
	//2.using new keyword(Heap memory)
	
    //String Literal : To make java more Memory efficient.(means no new objects are created if it already exist in String constant pool)
	//Syntax : String str = "Hello";
	
	//Using new Keyword(Heap Memory) : 
	//Syntax: String str = new String("Welcome");
	
	String s1 = "Wakar";
	String s2 = new String("Wakar Ali");
	
	System.out.println(s1);//Wakar
	System.out.println(s2);//Wakar Ali
	
	//CharSequence interface : it is used for representing the sequence of characters in Java.
	//classes which are implemented the CharSequence interface
	//1.String 
	//2.StringBuffer (multi thread)
	//3.StringBuilder (single thread)
	
	//String: it is an immutable class (means once you created then you cann't change the object and if you want to change then you need to create the new object)
	
	String s3 = new String("hello");
	s3.concat("Wakar");
	
	System.out.println(s3);//hello
	
	//becouse String is immmutable, we can't modify the existing Object, if we want to print "hello Wakar" then I have to assign the valu in the new object
	//means a constant cann't be changed once created
	
	String s4 = s3.concat("Wakar");
	System.out.println(s4);
	
	//StringBuffer : it is a peer class of String, it is a mutable in class and it is thread safe class
	//used by multi thread program
	//Syntax : StringBuffer str = new StringBuffer("Hello");
	
	StringBuffer s5 = new StringBuffer("Hello, Today is Sunday");
	System.out.println(s5);//Hello, Today is Sunday
	
	//StringBuilder : it is an alternative of String and StrinBuffer, 
	//it is not thread safe, it is used only within the thread. it is single threaded program.
	//Syntax : StringBuilder str = new StringBuilder();
	
	StringBuilder s6 = new StringBuilder();
	s6.append("hello sir ji");
	
	//Merge Strings Alternately : LeetCode problem
	String word1 = "abc";
	String word2 = "pqr";
	
	StringBuilder str = new StringBuilder();
	
	int i=0;
	
	while(i < word1.length() || i < word2.length()) {
		if(i < word1.length()) {
			str =  str.append(word1.charAt(i));
		}
		if(i < word2.length() ) {
			str = str.append(word2.charAt(i));
		}
		i++;
	}
	System.out.println(str);
	
	
	
	
	
	
	
	}

}
