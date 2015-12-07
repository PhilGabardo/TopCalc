package pnj.project.topcalc;

import android.content.Context;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class EqualsButton extends TCButton implements OnClickListener{

	public EqualsButton(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void action() {
		Calculator.currentCalculation.compute();
		
	}
	
	
	

}
