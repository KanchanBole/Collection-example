package com.earth;

import java.util.List;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		World w1=new World("earth", "Asia", "india", "maharashtra", "akola", "jatharpeth", "jatharpeth");
    	World w2=new World("earth", "Africa", "nigeria", "ogun", "odogbolu", "ogbo", "ogbo");
    	World w3=new World("earth", "Europe", "sovereign", "albania", "tirana", "monaco", "monaco");
		
		List list=(List) Arrays.asList(w1,w2,w3);
		
		for (Object object : list) {
			
			World w=(World) object;
			
			
			System.out.println(w + "\n");
		}
	}

}
