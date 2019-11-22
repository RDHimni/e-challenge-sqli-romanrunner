package com.sqli.test.builder;

/**
 * @author rida_dhimni
 *
 * Nov 21, 2019
 *
 * @project romanrunner
 */

public class CircensesBuilder implements ICircensesbuilder{

	Circenses circenses;
	
	public CircensesBuilder() {
		// TODO Auto-generated constructor stub
        circenses = new Circenses();
     //   circenses.circenses.add(circenses.start);


	}
	
	@Override
	public Circenses build() {
		// TODO Auto-generated method stub
		circenses.circenses.add("\n|##|");
		circenses.circensesB.add("\n|##|");
           return circenses;
	}

	@Override
	public ICircensesbuilder addCoin() {
		// TODO Auto-generated method stub

		
		if (circenses.right == true) {
			if(circenses.remplace == 1) {

		     String coin = circenses.circenses.get(circenses.circenses.size()-1);

             
              StringBuilder sb = new StringBuilder(coin);
		          sb.setCharAt(sb.length()-3, 'o');
		          
		          coin = sb.toString();




			
			circenses.circenses.set(circenses.circenses.size()-1, coin);
			circenses.circensesB.set(circenses.circenses.size()-1, coin);
			//circenses.left = false;
			circenses.remplace = 0;
			
			}else {
				//ajouter
				circenses.Coin = "\n|o |";
				circenses.circenses.add(circenses.Coin);
				circenses.circensesB.add(circenses.Coin);
			}
			
		}else {
					if (circenses.left == true) {
						if(circenses.remplace == 1) {
						
						
						
					     String coin = circenses.circenses.get(circenses.circenses.size()-1);
							
							     
							     char Cl = coin.charAt(coin.length()-2);
					             
					              StringBuilder sb = new StringBuilder(coin);
							          sb.setCharAt(sb.length()-3, Cl); 
							          sb.setCharAt(sb.length()-2, 'o');
							          
							          coin = sb.toString();
					              

						
						
						circenses.circenses.set(circenses.circenses.size()-1, coin);
						circenses.circensesB.set(circenses.circenses.size()-1, coin);
						//circenses.right = false;
						
						circenses.remplace = 0;

						}else {
							circenses.Coin = "\n| o|";
							circenses.circenses.add(circenses.Coin);
							circenses.circensesB.add(circenses.Coin);
						}
					}else {
						circenses.Coin = "\n| o|";
						circenses.circenses.add(circenses.Coin);
						circenses.circensesB.add(circenses.Coin);
					}
		}
		

		return this;
	}

	@Override
	public ICircensesbuilder addEmptySlot() {
		// TODO Auto-generated method stub
		circenses.Empty = "\n|  |";
		circenses.circenses.add(circenses.Empty);
		circenses.circensesB.add(circenses.Empty);

		return this;
	}

	@Override
	public ICircensesbuilder addObstacle() {
		// TODO Auto-generated method stub
		circenses.Obstacle = "\n| _|";
		circenses.circenses.add(circenses.Obstacle);
		circenses.circensesB.add(circenses.Obstacle);

		return this;
	}

	@Override
	public ICircensesbuilder right() {
		// TODO Auto-generated method stub
		circenses.right = true;
		circenses.left = false;
		circenses.remplace = 1;
		return this;
	}

	@Override
	public ICircensesbuilder left() {
		// TODO Auto-generated method stub
		circenses.left = true;
		circenses.right = false;
		circenses.remplace = 1;
		return this;
	}

}
