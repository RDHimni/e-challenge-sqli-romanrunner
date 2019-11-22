package com.sqli.test.builder;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author rida_dhimni
 *
 * Nov 21, 2019
 *
 * @project romanrunner
 */

public class Circenses {
	
	public String start = "|  |";
	public String Coin;
	public String Empty;
	public String Obstacle;
	public boolean right;
	public boolean left;

	
	public List<String> circenses = new LinkedList<>();
	public List<String> circensesB = new LinkedList<>();
	public int remplace;

    public  String draw() {
       //circenses.add(start);
    	
    	StringBuilder sb = new StringBuilder();
    	StringBuilder sd = new StringBuilder();

    	sb.append(start);
    	for (Iterator iterator = circenses.iterator(); iterator.hasNext();) {
			String s = (String) iterator.next();
			sb.append(s);
			
		}
    	sd = sb.reverse();
    	return sd.toString();
    }

}
