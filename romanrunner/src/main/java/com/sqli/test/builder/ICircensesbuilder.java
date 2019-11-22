package com.sqli.test.builder;

/**
 * @author rida_dhimni
 *
 * Nov 21, 2019
 *
 * @project romanrunner
 */

public interface ICircensesbuilder {
	
	 Circenses build();
	 ICircensesbuilder addCoin();
	 ICircensesbuilder addEmptySlot();
	 ICircensesbuilder addObstacle();
	 ICircensesbuilder right();
	 ICircensesbuilder left();


}
