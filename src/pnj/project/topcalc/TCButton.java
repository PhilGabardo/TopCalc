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
	String expression;
	Type type;
	
	
	public TCButton(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPressable(){
		Type lastType = Calculator.currentCalculation.currentCalculation.expression.get(Calculator.currentCalculation.expression.size()-1).type;
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
		Calculator.currentCalculation.expression.add(this);
		
		
	}
}
