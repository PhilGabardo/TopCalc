package pnj.project.topcalc;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;

public class TCAnswerButton extends TCTermButton{

	
	public TCAnswerButton(Context context) {
	    super(context);
	    term = "";
	}

	public TCAnswerButton(Context context, AttributeSet attrs) {
	    super(context, attrs);
	    term = "";
	}

	public TCAnswerButton(Context context, AttributeSet attrs, int defStyleAttr) {
	    super(context, attrs, defStyleAttr);
	    term = "";
	}

	@TargetApi(21)
	public TCAnswerButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    super(context, attrs, defStyleAttr);
	    term = "";
	}

	public void update(){
		term = Calculator.calculationHistory.answerToDisplay();
		this.setText(term);
	}

}
