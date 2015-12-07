package pnj.project.topcalc;

import android.content.Context;
import android.view.View;
import android.widget.Button;

public class HistoryControlButton extends Button{
	
	private boolean forward;

	public HistoryControlButton(Context context, boolean forward) {
		super(context);
		this.setForward(forward);
	}
	
	
	@Override
    public void setOnClickListener(final OnClickListener l) {

        super.setOnClickListener(new OnClickListener() {

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


	public boolean isForward() {
		return forward;
	}


	public void setForward(boolean forward) {
		this.forward = forward;
	}


}
