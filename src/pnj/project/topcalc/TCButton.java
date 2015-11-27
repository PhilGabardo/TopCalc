package pnj.project.topcalc;

import android.content.Context;
import android.widget.Button;

public class TCButton extends Button{
	
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
}
