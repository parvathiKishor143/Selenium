package RahulsCourse;

import java.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Streams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> names= new ArrayList<String>();
		names.add("Anna");
		names.add("Ben");
		names.add("Amaya");
		names.add("Cathi");
		names.add("Angel");
		
	//names.stream().filter(s->s.startsWith("A")).sorted().forEach(s->System.out.println(s) ); // strats with A and sorted
	//names.stream().filter(s->s.startsWith("A")).sorted().limit(1).forEach(s->System.out.println(s) );// limits to 1 count
	//long count=	names.stream().filter(s->s.startsWith("A")).sorted().count();// count
	//System.out.println(count) ;
	
	//Stream.of("megha","devu","arjun","devi").map(s->s.toUpperCase()).forEach(s->System.out.println(s));// map to modify the string
	
	List<String> names1= Arrays.asList("megha","devu","arjun","devi","Ben"); 
	
	Stream<String> s= Stream.concat(names.stream(), names1.stream());// combine two lists
	boolean flag=s.anyMatch(d->d.equalsIgnoreCase("MEGHA"));
	System.out.println(flag) ;
	
	List<Integer> num= Arrays.asList(1,2,3,2,4,5,7,6);
	
	List<Integer> num1=num.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(num1) ;
	
		
	}

}
