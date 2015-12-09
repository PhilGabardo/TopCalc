package pnj.project.topcalc;

import expr.SyntaxException;
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
		    	    RefreshButtonEnabling.refresh();
	        		try {
						action();
					} catch (SyntaxException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
	        	}
	            
	        });    
	    RefreshButtonEnabling.refresh();
	}

	public TCButton(Context context, AttributeSet attrs) {
	    super(context, attrs);
	    setOnClickListener(new OnClickListener() {

	    	@Override
        	public void onClick(View v) {
	    	    
        		try {
					action();
				} catch (SyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		RefreshButtonEnabling.refresh();
        	}
        });  
	}

	public TCButton(Context context, AttributeSet attrs, int defStyleAttr) {
	    super(context, attrs, defStyleAttr);
	    setOnClickListener(new OnClickListener() {

	    	@Override
        	public void onClick(View v) {
	    	    
        		try {
					action();
				} catch (SyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		RefreshButtonEnabling.refresh();
        	}
        });
	}

	@TargetApi(21)
	public TCButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    super(context, attrs, defStyleAttr);
	    setOnClickListener(new OnClickListener() {

	    	@Override
        	public void onClick(View v) {
	    	    
        		try {
					action();
				} catch (SyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		RefreshButtonEnabling.refresh();
        	}
        });  
	}




	
	public void action() throws SyntaxException{
		
	}
	
}
