package pnj.project.topcalc;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Toast;

public class TCTermButton extends TCButton{
	
	String label;
	String description;
	String term;
	Type type;
	
	
	public TCTermButton(Context context) {
	    super(context);
	    
	}

	public TCTermButton(Context context, final AttributeSet attrs) {
	    super(context, attrs);
	    init(attrs, context);
	}

	public TCTermButton(Context context, final AttributeSet attrs, int defStyleAttr) {
	    super(context, attrs, defStyleAttr);
	    init(attrs, context);
	}

	@TargetApi(21)
	public TCTermButton(Context context, final AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    super(context, attrs, defStyleAttr);
	    init(attrs, context);
	}

	public enum Type{
		NON_MINUS_OPERATOR, DECIMAL, INTEGER, MINUS_OPERATOR, LEFT_BRACKET, RIGHT_BRACKET
	}
	
	
	
	
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
	
	
	private void init(AttributeSet attrs, Context context){
	    TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.TCTermButton);
	    final String des = a.getString(R.styleable.TCTermButton_description);
	    setOnLongClickListener(new View.OnLongClickListener(){
	        @Override
	         public boolean onLongClick(View v) {
	        	Toast.makeText(getContext(), des, Toast.LENGTH_LONG).show();;
	        	return true;
	        }
	        });
	}
	

	@Override
	public void action() {
		//Calculator.currentCalculation.add(this);
	}
}