package pnj.project.topcalc;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;

public class TCAnswerButton extends TCTermButton{

	
	public TCAnswerButton(Context context) {
	    super(context);
	}

	public TCAnswerButton(Context context, AttributeSet attrs) {
	    super(context, attrs);
	}

	public TCAnswerButton(Context context, AttributeSet attrs, int defStyleAttr) {
	    super(context, attrs, defStyleAttr);
	}

	@TargetApi(21)
	public TCAnswerButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    super(context, attrs, defStyleAttr);
	}

	public void update(){
		this.setText(Calculator.calculationHistory.answerToDisplay());
	}

}
