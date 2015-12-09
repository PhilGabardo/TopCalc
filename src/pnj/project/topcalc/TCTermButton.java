package pnj.project.topcalc;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
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
		NON_MINUS_OPERATOR(0), DECIMAL(1), INTEGER(2), MINUS_OPERATOR(3), LEFT_BRACKET(4), RIGHT_BRACKET(5);
		int id;
		Type(int id) {
	        this.id = id;
	    }
		static Type fromId(int id) {
	        for (Type t : values()) {
	            if (t.id == id) return t;
	        }
	        throw new IllegalArgumentException();
	    }
	}
	
	
	
	
	public boolean isValid(){
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
	    this.type = Type.fromId(a.getInt(R.styleable.TCTermButton_type, 0));
	    term = a.getString(R.styleable.TCTermButton_term);
	    setOnLongClickListener(new View.OnLongClickListener(){
	        @Override
	         public boolean onLongClick(View v) {
	        	openDescription(v,"Calculator Button "+TCTermButton.this.getText().toString(),des);
	        	return true;
	        }
	        });
	}
	

	@Override
	public void action() {
		Calculator.currentCalculation.add(this);
	}


	
	private void openDescription(View view, String title,String message) {
		 AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getContext());
		 alertDialogBuilder.setTitle(title);
		 alertDialogBuilder.setMessage(message);
		 // set positive button: Yes message
		 alertDialogBuilder.setPositiveButton("Okay, I've got it!",new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog,int id) {
				}
			  });
		 AlertDialog alertDialog = alertDialogBuilder.create();
		 alertDialog.show();
	}

}