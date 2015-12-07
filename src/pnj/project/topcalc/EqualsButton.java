package pnj.project.topcalc;

import android.annotation.TargetApi;
import android.content.Context;
import android.widget.Button;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;

public class EqualsButton extends TCButton implements OnClickListener{


	public EqualsButton(Context context) {
	    super(context);
	}

	public EqualsButton(Context context, AttributeSet attrs) {
	    super(context, attrs);
	}

	public EqualsButton(Context context, AttributeSet attrs, int defStyleAttr) {
	    super(context, attrs, defStyleAttr);
	}

	@TargetApi(21)
	public EqualsButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    super(context, attrs, defStyleAttr);
	}
	@Override
	public void action() {
		Calculator.currentCalculation.compute();
		
	}
	
	
	

}
