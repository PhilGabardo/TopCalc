package pnj.project.topcalc;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;

public class DeleteButton extends TCButton{


	public DeleteButton(Context context) {
	    super(context);
	}

	public DeleteButton(Context context, AttributeSet attrs) {
	    super(context, attrs);
	}

	public DeleteButton(Context context, AttributeSet attrs, int defStyleAttr) {
	    super(context, attrs, defStyleAttr);
	}

	@TargetApi(21)
	public DeleteButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    super(context, attrs, defStyleAttr);
	}

	@Override
	public void action() {
		Calculator.currentCalculation.deleteLast();
	    RefreshButtonEnabling.refresh();
	}

}
