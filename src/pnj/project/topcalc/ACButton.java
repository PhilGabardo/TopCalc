package pnj.project.topcalc;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;

public class ACButton extends TCButton{

	public ACButton(Context context) {
	    super(context);
	}

	public ACButton(Context context, AttributeSet attrs) {
	    super(context, attrs);
	}

	public ACButton(Context context, AttributeSet attrs, int defStyleAttr) {
	    super(context, attrs, defStyleAttr);
	}

	@TargetApi(21)
	public ACButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    super(context, attrs, defStyleAttr);
	}


	@Override
	public void action() {
		Calculator.currentCalculation.reset();
	    RefreshButtonEnabling.refresh();
	}
	
	

}
