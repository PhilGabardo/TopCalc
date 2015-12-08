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
	
	Handler handel = new Handler();
	
	Runnable run = new Runnable() {

	    @Override
	    public void run() {
	        Toast.makeText(getContext(), "TEST2", Toast.LENGTH_LONG).show();

	    }
	};
	
	
	public TCTermButton(Context context) {
	    super(context);
	    

	        setOnLongClickListener(new View.OnLongClickListener(){
	        @Override
	         public boolean onLongClick(View v) {
	        	Toast.makeText(getContext(), description, Toast.LENGTH_LONG).show();;
	        	return true;
	        }
	        });
	}

	public TCTermButton(Context context, final AttributeSet attrs) {
	    super(context, attrs);

	    setOnLongClickListener(new View.OnLongClickListener(){
	        @Override
	         public boolean onLongClick(View v) {
	        	String bar = attrs.getAttributeValue(null, "description");
	        	Toast.makeText(getContext(), bar, Toast.LENGTH_LONG).show();;
	        	return true;
	        }
	        });
	}

	public TCTermButton(Context context, final AttributeSet attrs, int defStyleAttr) {
	    super(context, attrs, defStyleAttr);

	    setOnLongClickListener(new View.OnLongClickListener(){
	        @Override
	         public boolean onLongClick(View v) {
	        	String bar = attrs.getAttributeValue(null, "description");
	        	Toast.makeText(getContext(), bar, Toast.LENGTH_LONG).show();;
	        	return true;
	        }
	        });
	}

	@TargetApi(21)
	public TCTermButton(Context context, final AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    super(context, attrs, defStyleAttr);

	        setOnLongClickListener(new View.OnLongClickListener(){
	        @Override
	         public boolean onLongClick(View v) {
	        	String bar = attrs.getAttributeValue(null, "description");
	        	Toast.makeText(getContext(), bar, Toast.LENGTH_LONG).show();;
	        	return true;
	        }
	        });
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
	
	

	@Override
	public void action() {
		//Calculator.currentCalculation.add(this);
	}
}
