package pnj.project.topcalc;

import expr.SyntaxException;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;

public class EqualsButton extends TCButton{


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
	public void action() throws SyntaxException {
		if (Calculator.currentCalculation.expression.size() > 0){
			Calculator.currentCalculation.compute();
    	    RefreshButtonEnabling.refresh();
		}
		
		
	}
	
	
	

}
