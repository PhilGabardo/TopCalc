package pnj.project.topcalc;

import android.content.Context;
import android.util.AttributeSet;

public class TCAnswerButton extends TCTermButton{

	
	public TCAnswerButton(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public void update(){
		this.setText(Calculator.calculationHistory.answerToDisplay());
	}

}
