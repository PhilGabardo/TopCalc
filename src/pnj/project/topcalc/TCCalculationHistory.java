package pnj.project.topcalc;

import java.util.ArrayList;

public class TCCalculationHistory {
	static ArrayList<TCCurrentCalculation> history;
	int indexToDisplay;
	
	public TCCalculationHistory(){
		history = new ArrayList<TCCurrentCalculation>();
		indexToDisplay = -1;
	}
	
	public void add(TCCurrentCalculation calc){
		history.add(calc);
		indexToDisplay++;
	}
	
	public void resetIndex(){
		indexToDisplay = history.size() - 1;
	}
	
	public String answerToDisplay(){
		if (history.size() == 0) return "";
		return history.get(indexToDisplay).getCurrentCalculation().answer;
	}

}
