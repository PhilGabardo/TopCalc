package pnj.project.topcalc;

import android.annotation.TargetApi;

import android.content.Context;
import android.widget.Button;
import android.widget.Toast;
import android.util.AttributeSet;
import android.view.View;

public class TCButton extends Button {
	
	
	
	public TCButton(Context context) {
	    super(context);
	    setOnClickListener(new OnClickListener() {

	            @Override
	        	public void onClick(View v) {
	        	    updateButtonEnabling();
	        		action();
	        	}
	        });    
		
	}

	public TCButton(Context context, AttributeSet attrs) {
	    super(context, attrs);
	    setOnClickListener(new OnClickListener() {

	    	@Override
        	public void onClick(View v) {
	    	    updateButtonEnabling();
        		action();
        	}
        });  
	}

	public TCButton(Context context, AttributeSet attrs, int defStyleAttr) {
	    super(context, attrs, defStyleAttr);
	    setOnClickListener(new OnClickListener() {

	    	@Override
        	public void onClick(View v) {
	    	    updateButtonEnabling();
        		action();
        	}
        });
	}

	@TargetApi(21)
	public TCButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    super(context, attrs, defStyleAttr);
	    setOnClickListener(new OnClickListener() {

	    	@Override
        	public void onClick(View v) {
	    	    updateButtonEnabling();
        		action();
        	}
        });  
	}




	
	public void action(){
		
	}
	
	public void updateButtonEnabling(){
		for (TCTermButton term: Calculator.tcTermButtons){
			if (term.isValid()){
				term.setVisibility(View.VISIBLE);
			}
			else{
				term.setVisibility(View.INVISIBLE);
			}
		}
	}
}
