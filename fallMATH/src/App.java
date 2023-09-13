import java.util.*;
import java.lang.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
		int x,y,z;
		ArrayList<Integer> set = new ArrayList<Integer>();
		ArrayList<Integer> set2 = new ArrayList<Integer>();
		//setBuilder(set);
		//stat sm = new stat(set);
		
		//setBuilder(set2);
		//System.out.println(sm.isExclusive(set, set2));
		//System.out.println(sm.probabilityOfSetAtIndex(2));
		
		XYcords xy = new XYcords(1,2);
		System.out.println(xy.toString());
	}

	public static <Set extends List> void setBuilder(Set set) {
		char c = 'y';
		while(c == 'y'){
			System.out.println("Enter a number: ");
			Scanner sc = new Scanner(System.in);
			set.add(sc.next());
			System.out.println("Do you want to add another number? (y/n)");
			c = sc.next().charAt(0);
			
			
		}
	}
}
