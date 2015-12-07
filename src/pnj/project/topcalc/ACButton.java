package pnj.project.topcalc;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;

public class ACButton extends TCButton implements OnClickListener{



	public ACButton(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void action() {
		Calculator.currentCalculation.reset();
		// TODO Auto-generated method stub
		
	}

}
