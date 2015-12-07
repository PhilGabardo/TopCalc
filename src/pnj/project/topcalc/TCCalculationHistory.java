package pnj.project.topcalc;

import java.util.ArrayList;

public class TCCalculationHistory {
	static ArrayList<TCCurrentCalculation> history;
	int indexToDisplay;
	
	public TCCalculationHistory(){
		history = new ArrayList<TCCurrentCalculation>();
	}

}
