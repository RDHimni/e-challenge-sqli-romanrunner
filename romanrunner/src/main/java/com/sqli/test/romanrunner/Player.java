package com.sqli.test.romanrunner;

import com.sqli.test.builder.Circenses;

/**
 * @author rida_dhimni
 *
 * Nov 21, 2019
 *
 * @project rm
 */

public class Player {

	String Name;
	Circenses circenses;
	int foward;
	int score;
	char PL;
	boolean right ;
	
	public Player(String name) {
		// TODO Auto-generated constructor stub
		this.Name= name;
		this.foward = -1;
		this.score = 0;
	}
	
	public void startGame(Circenses circenses) {
		// TODO Auto-generated method stub
		this.circenses =circenses;
		
		String uperName = Name.toUpperCase();
		char PL = uperName.charAt(0);
		String start =  "| "+PL+"|";
		
	//	System.out.println(circenses.start);
		circenses.start = start;
	//	System.out.println(circenses.start);
	}

	public Player forward() {
		// TODO Auto-generated method stub
		this.foward++;
		
				
				String uperName = Name.toUpperCase();
				char PL = uperName.charAt(0);
				this.PL = PL;
			if(this.right == false) {	
				//String start =  "\n| "+PL+"|";
				String Pfin =    "\n|#"+PL+"|";
				if(this.foward == circenses.circenses.size()-1){
				     circenses.circenses.set(this.foward, Pfin);
				     for (int i = 0; i < this.foward; i++) {
				    	 
				    	 if (circenses.circensesB.get(i).equals("\n|  |"))
					     circenses.circenses.set(i, "\n|  |");
				    	 if (circenses.circensesB.get(i).equals(circenses.Coin)) {
					     circenses.circenses.set(i, "\n| x|");	
					     
				    	 }}	
		
				}else {
				     circenses.circenses.set(this.foward,"\n| "+PL+"|");
		
				     for (int i = 0; i < this.foward; i++) {
				    	 
				    	 if (circenses.circensesB.get(i).equals("\n|  |"))
					     circenses.circenses.set(i, "\n|  |");
				    	 if (circenses.circensesB.get(i).equals(circenses.Coin))
					     circenses.circenses.set(i, "\n| x|");
					}		 
					 circenses.start =  "| @|";
		
				}
			}else {
				//String start =  "\n|@"+PL+"|";
				String Pfin =    "\n|"+PL+"#|";
				if(this.foward == circenses.circenses.size()-1){
				     circenses.circenses.set(this.foward, Pfin);
				     for (int i = 0; i < this.foward; i++) {
				    	 
				    	 if (circenses.circensesB.get(i).equals("\n|  |"))
					     circenses.circenses.set(i, "\n|  |");
				    	 if (circenses.circensesB.get(i).equals(circenses.Coin))
					     circenses.circenses.set(i, "\n| x|");			}	
		
				}else {
				     circenses.circenses.set(this.foward,"\n|"+PL+" |");
		
				     for (int i = 0; i < this.foward; i++) {
				    	 
				    	 if (circenses.circensesB.get(i).equals("\n|  |"))
					     circenses.circenses.set(i, "\n|  |");
				    	 if (circenses.circensesB.get(i).equals(circenses.Coin))
					     circenses.circenses.set(i, "\n| x|");
					}		 
					 circenses.start =  "| @|";
		
				}
				
			}
			
			return this;
		
	}

	public int score() {
		int i;
 		if(this.foward == circenses.circenses.size()-1){

			this.score += 100;
		}
 		else {

 		
	     for ( i = 0; i <= this.foward; i++) {

			
	    	 
	    	 if (circenses.circensesB.get(i).equals(circenses.Coin) 
	    			 && (circenses.circenses.get(i).equals("\n| x|")
	    					 ||circenses.circenses.get(i).equals("\n| "+PL+"|")))
	 			this.score += 10;
		}
	     
 		}


		
		return this.score;
	}

	public Player right() {
		// TODO Auto-generated method stub
		this.right = true;
		String uperName = Name.toUpperCase();
		char PL = uperName.charAt(0);
		this.PL = PL;
		circenses.start = "|"+PL+"@|";
		
		return this;
		
	}

	public Player left() {
		// TODO Auto-generated method stub
		this.right = false;
		this.foward --;
   
		return forward();

	}

}
