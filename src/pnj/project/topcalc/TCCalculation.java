package pnj.project.topcalc;

import java.util.ArrayList;

public class TCCalculation {
	ArrayList<TCButton> expression;
	String answer;

	public void calculate() {
		TCCalculationHistory.history.add(Calculator.currentCalculation);
		// TODO Auto-generated method stub
		
	}

}
