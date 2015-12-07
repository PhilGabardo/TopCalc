package pnj.project.topcalc;

import android.content.Context;
import android.widget.Button;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;

public class TCTermButton extends TCButton implements OnClickListener{
	
	public TCTermButton(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public enum Type{
		NON_MINUS_OPERATOR, DECIMAL, INTEGER, MINUS_OPERATOR, LEFT_BRACKET, RIGHT_BRACKET
	}
	
	String label;
	String description;
	String term;
	Type type;
	
	
	
	public boolean isPressable(){
		Type lastType = Calculator.currentCalculation.getLastTyped();
		if (lastType == null){
			return true;
		}
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
	public void action() {
		Calculator.currentCalculation.add(this);
	}
}
