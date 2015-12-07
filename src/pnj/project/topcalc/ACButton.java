package pnj.project.topcalc;

import android.content.Context;
import android.view.View.OnClickListener;

public class ACButton extends TCButton implements OnClickListener{


	public ACButton(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void action() {
		Calculator.currentCalculation.reset();
		// TODO Auto-generated method stub
		
	}

}
