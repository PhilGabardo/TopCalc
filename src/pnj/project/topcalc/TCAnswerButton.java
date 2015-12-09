package pnj.project.topcalc;

import pnj.project.topcalc.TCTermButton.Type;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;

public class TCAnswerButton extends TCTermButton{

	
	public TCAnswerButton(Context context) {
	    super(context);
	    term = "";
	    type = Type.NUMBER;
	}

	public TCAnswerButton(Context context, AttributeSet attrs) {
	    super(context, attrs);
	    term = "";
	    type = Type.NUMBER;

	}

	public TCAnswerButton(Context context, AttributeSet attrs, int defStyleAttr) {
	    super(context, attrs, defStyleAttr);
	    term = "";
	    type = Type.NUMBER;

	}

	@TargetApi(21)
	public TCAnswerButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    super(context, attrs, defStyleAttr);
	    term = "";	    
	    type = Type.NUMBER;

	}

	public void update(){
		term = Calculator.calculationHistory.answerToDisplay();
		this.setText(term);
	}

}
