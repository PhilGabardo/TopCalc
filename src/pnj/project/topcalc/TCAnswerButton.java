package pnj.project.topcalc;

import android.content.Context;

public class TCAnswerButton extends TCTermButton{

	public TCAnswerButton(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public void update(){
		this.setText(Calculator.calculationHistory.answerToDisplay());
	}

}
