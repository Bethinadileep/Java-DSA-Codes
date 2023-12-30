//Code by: Dileep

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String s = "APJ Abdul kalam";
	  s.concat(" Sir");
		System.out.println(s);
	}
}
//Output
//APJ Abdul kalam
//Here two objects are created but it is refering to first object only as Strings are Immutable

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		String s = "APJ Abdul kalam";
		s = s.concat(" Sir");
		System.out.println(s);
	}
}

//Output
//APJ Abdul kalam Sir
//Here we have explicitly assings it to the reference variable, it will refere to APJ Abdul Kalam Sir.
