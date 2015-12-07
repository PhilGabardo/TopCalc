package pnj.project.topcalc;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;

public class TCTermButton extends TCButton{
	
	public TCTermButton(Context context) {
	    super(context);
	}

	public TCTermButton(Context context, AttributeSet attrs) {
	    super(context, attrs);
	}

	public TCTermButton(Context context, AttributeSet attrs, int defStyleAttr) {
	    super(context, attrs, defStyleAttr);
	}

	@TargetApi(21)
	public TCTermButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    super(context, attrs, defStyleAttr);
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
