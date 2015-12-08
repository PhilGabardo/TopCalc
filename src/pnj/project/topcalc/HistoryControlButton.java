package pnj.project.topcalc;

import pnj.project.topcalc.TCTermButton.Type;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HistoryControlButton extends Button{
	
	private boolean forward;

	public HistoryControlButton(Context context) {
	    super(context);
	    
	}

	public HistoryControlButton(Context context, final AttributeSet attrs) {
	    super(context, attrs);
	    init(attrs, context);

	}

	public HistoryControlButton(Context context, final AttributeSet attrs, int defStyleAttr) {
	    super(context, attrs, defStyleAttr);
	    init(attrs, context);

	}

	@TargetApi(21)
	public HistoryControlButton(Context context, final AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    super(context, attrs, defStyleAttr);
	    init(attrs, context);

	}
	


	public boolean isForward() {
		return forward;
	}


	public void setForward(boolean forward) {
		this.forward = forward;
	}
	
	private void init(AttributeSet attrs, Context context){
		TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.HistoryControlButton);
	    int dir = a.getInt(R.styleable.HistoryControlButton_direction, 0);
	    if (dir == 1){
	    	setForward(true);
	    }
	    else{
	    	setForward(false);
	    }
		setOnClickListener(new OnClickListener() {

            @Override
        	public void onClick(View v) {
        		if (isForward() && Calculator.calculationHistory.indexToDisplay < Calculator.calculationHistory.history.size()-1){
        			Calculator.calculationHistory.indexToDisplay ++;
        		}
        		if ((!isForward()) && Calculator.calculationHistory.indexToDisplay > 0){
        			Calculator.calculationHistory.indexToDisplay --;
        		}
        		Calculator.calculationHistory.update();
    			Calculator.answer.update();
        	}
        });
	}
	


}
