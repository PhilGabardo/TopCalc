package pnj.project.topcalc;

import java.util.ArrayList;

public class TCCalculation {
	ArrayList<TCButton> expression;
	String answer;
	
	public TCCalculation(){
		expression = new ArrayList<TCButton>();
	}

	public void calculate() {
		answer = String.valueOf(parse());
	}
	
	public String toString(){
		String expressionString = "";
		for (int i = 0; i < expression.size(); i++){
			expressionString += expression.get(i).expression;
		}
		return expressionString;
	}
	
	public int parse(){
		return 0;
	}

}
