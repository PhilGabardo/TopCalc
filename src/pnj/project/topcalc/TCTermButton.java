package pnj.project.topcalc;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

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
		UNARY_OPERATOR(0), BINARY_OPERATOR(1), DECIMAL(2), NUMBER(3), MINUS_OPERATOR(4), LEFT_BRACKET(5), RIGHT_BRACKET(6);
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
		if (type == Type.UNARY_OPERATOR){
			if (lastType == Type.NUMBER){
				return false;
			}
			if (lastType == Type.RIGHT_BRACKET){
				return false;
			}
			if (lastType == Type.DECIMAL){
				return false;
			}
			return true;
		}
		if (type == Type.BINARY_OPERATOR){
			if (lastType == Type.UNARY_OPERATOR){
				return false;
			}
			if (lastType == Type.BINARY_OPERATOR){
				return false;
			}
			if (lastType == Type.DECIMAL){
				return false;
			}
			if (lastType == Type.MINUS_OPERATOR){
				return false;
			}
			if (lastType == Type.LEFT_BRACKET){
				return false;
			}
			return true;
		}
		if (type == Type.DECIMAL){
			if (lastType != Type.NUMBER){
				return false;
			}
			return true;
		}
		if (type == Type.NUMBER){
			if (lastType != Type.RIGHT_BRACKET){
				return false;
			}
			return true;
		}
		if (type == Type.MINUS_OPERATOR){
			if (lastType != Type.MINUS_OPERATOR){
				return false;
			}
			return true;
		}
		if (type == Type.LEFT_BRACKET){
			if (lastType == Type.DECIMAL){
				return false;
			}
			if (lastType == Type.NUMBER){
				return false;
			}
			if (lastType == Type.RIGHT_BRACKET){
				return false;
			}
			return false;
		}
		if (type == Type.RIGHT_BRACKET){
			if (lastType == Type.UNARY_OPERATOR){
				return false;
			}
			if (lastType == Type.BINARY_OPERATOR){
				return false;
			}
			if (lastType == Type.DECIMAL){
				return false;
			}
			if (lastType == Type.MINUS_OPERATOR){
				return false;
			}
			if (lastType == Type.LEFT_BRACKET){
				return false;
			}
			return false;
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