package pnj.project.topcalc;

import android.content.Context;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class TCButton extends Button implements OnClickListener{
	
	public enum Type{
		NON_MINUS_OPERATOR, DECIMAL, INTEGER, MINUS_OPERATOR, LEFT_BRACKET, RIGHT_BRACKET
	}
	
	String label;
	String description;
	String term;
	Type type;
	
	
	public TCButton(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPressable(){
		Type lastType = Calculator.currentCalculation.getLastTyped();
		if (type == Type.NON_MINUS_OPERATOR){
			if (lastType == Type.DECIMAL){
				return false;
			}
			return true;
		}
		if (type == Type.NON_MINUS_OPERATOR){
			return true;
		}
		if (type == Type.NON_MINUS_OPERATOR){
			return true;
		}
		if (type == Type.NON_MINUS_OPERATOR){
			return true;
		}
		if (type == Type.NON_MINUS_OPERATOR){
			return true;
		}
		if (type == Type.NON_MINUS_OPERATOR){
			return true;
		}
		return true;
	}

	@Override
	public void onClick(View v) {
		Calculator.currentCalculation.add(this);
	}
}
