package pnj.project.topcalc;

import android.annotation.TargetApi;
import android.content.Context;
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
	
	Handler handel = new Handler();
	
	Runnable run = new Runnable() {

	    @Override
	    public void run() {
	        Toast.makeText(getContext(), description, Toast.LENGTH_LONG).show();

	    }
	};
	
	@Override
    public void setOnTouchListener(final OnTouchListener l) {
	 super.setOnTouchListener(new OnTouchListener() {
		 

		@Override
		public boolean onTouch(View arg0, MotionEvent arg1) {
			switch (arg1.getAction()) {
	         case MotionEvent.ACTION_DOWN:
	             handel.postDelayed(run, 5000/* OR the amount of time you want */);
	             break;

	         default:
	             handel.removeCallbacks(run);
	             break;

	         }
	         return true;
		}

	    });
	 
	 
	}

	@Override
	public void action() {
		Calculator.currentCalculation.add(this);
	}
}
