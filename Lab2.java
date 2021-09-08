/**AUTHOR: Gregory Feng
 * FILENAME: Lab2.java
 * SPECIFICATION: Program that concatenates your inputed first name and last name and prints the resultant string to all
 * upper case and the length of your full name including the space in-between. Also, the result of the comparison between
 * a string defined by = "" and new String(); is shown using == and .equals.
 * FOR: CSE 110 - Lab #2
 * TIME SPENT: 15 minutes
 */
import java.util.*;
public class Lab2 {
	public static void main(String[] args) {
		//Variable definitions
		Scanner scanner = new Scanner(System.in); 
		String name;
		String test1 = "",test2 = new String();
		//Name input
		System.out.print("Enter your first name: ");
		name = scanner.next().trim();
		System.out.print("Enter your last name: ");
		name = name+" "+scanner.next().trim();
		//Output
		System.out.print("Upper case name: "+name.toUpperCase()+"\n"+"Name Length: "+name.length()+"\n");
		//Comparison ==
		System.out.print("String comparison using \"==\" does ");
		if (!(test1==test2)) {
			System.out.print("NOT ");
		}
		System.out.print("work.\n");
		//Comparison .equals
		System.out.print("String comparison using \"equals\" does ");
		if (!(test1.equals(test2))) {
			System.out.print("NOT ");
		}
		System.out.print("work.\n");
	}
}
