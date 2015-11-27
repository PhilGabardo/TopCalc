package pnj.project.topcalc;

import android.content.Context;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class EqualsButton extends Button implements OnClickListener{

	public EqualsButton(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onClick(View arg0) {
		Calculator.currentCalculation.calculate();
		Calculator.currentCalculation = new TCCalculation();
		
	}
	
	
	

}
