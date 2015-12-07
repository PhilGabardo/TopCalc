package pnj.project.topcalc;

import android.annotation.TargetApi;
import android.content.Context;
import android.widget.Button;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;

public class TCButton extends Button implements OnClickListener{
	
	
	
	public TCButton(Context context) {
	    super(context);
	}

	public TCButton(Context context, AttributeSet attrs) {
	    super(context, attrs);
	}

	public TCButton(Context context, AttributeSet attrs, int defStyleAttr) {
	    super(context, attrs, defStyleAttr);
	}

	@TargetApi(21)
	public TCButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    super(context, attrs, defStyleAttr);
	}



	@Override
	public void onClick(View v) {
		for (TCTermButton term : Calculator.tcbuttons){
			if (term.isPressable()){
				term.setVisibility(View.VISIBLE);
			}
			else{
				term.setVisibility(View.GONE);
			}
		}
		action();
	}


	public void action() {
		
	}
}
