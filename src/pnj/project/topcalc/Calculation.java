package pnj.project.topcalc;

import java.util.ArrayList;

public class Calculation {
	String terms;
	String answer;
	
	public Calculation(String terms, String answer){
		this.terms = terms;
		this.answer = answer;
	}
	
	public Calculation(TCCurrentCalculation tcCurrentCalculation) {
		answer = tcCurrentCalculation.answer;
		terms = tcCurrentCalculation.toScreen();
		
	}

	public String toScreen(){
		return terms + "=" + answer;
	}

}
