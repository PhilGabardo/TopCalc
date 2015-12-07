package pnj.project.topcalc;

import android.content.Context;
import android.widget.Button;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;

public class DeleteButton extends TCButton implements OnClickListener{


	public DeleteButton(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void action() {
		Calculator.currentCalculation.deleteLast();
	}

}
