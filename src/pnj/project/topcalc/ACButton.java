package pnj.project.topcalc;

import android.content.Context;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class ACButton extends Button implements OnClickListener{

	public ACButton(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onClick(View v) {
		Calculator.currentCalculation.reset();
		// TODO Auto-generated method stub
		
	}

}
