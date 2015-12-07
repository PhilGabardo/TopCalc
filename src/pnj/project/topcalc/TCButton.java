package pnj.project.topcalc;

import android.content.Context;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class TCButton extends Button implements OnClickListener{
	
	
	
	public TCButton(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void onClick(View v) {
		for (TCTermButton term : Calculator.tcbuttons){
			if (term.isPressable()){
				term.setVisibility(View.VISIBLE);
			}
			else{
				term.setVisibility(View.GONE);
			}
		}
		action();
	}


	public void action() {
		
	}
}
