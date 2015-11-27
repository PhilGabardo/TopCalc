package pnj.project.topcalc;

import android.content.Context;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class DeleteButton extends Button implements OnClickListener{

	public DeleteButton(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onClick(View v) {
		Calculator.currentCalculation.expression.remove(Calculator.currentCalculation.expression.size() - 1);
	}

}
