package pnj.project.topcalc;

import android.annotation.TargetApi;

import android.content.Context;
import android.widget.Button;
import android.widget.Toast;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;

public class TCButton extends Button implements OnClickListener{
	
	
	
	public TCButton(Context context) {
	    super(context);
	    setOnClickListener(new OnClickListener() {

	            @Override
	        	public void onClick(View v) {
	            	Toast.makeText(TCButton.this.getContext(), "TEST", Toast.LENGTH_LONG).show();
	        		action();
	        	}
	        });    
		
	}

	public TCButton(Context context, AttributeSet attrs) {
	    super(context, attrs);
	    setOnClickListener(new OnClickListener() {

	    	@Override
        	public void onClick(View v) {
            	Toast.makeText(TCButton.this.getContext(), "TEST", Toast.LENGTH_LONG).show();
        		action();
        	}
        });  
	}

	public TCButton(Context context, AttributeSet attrs, int defStyleAttr) {
	    super(context, attrs, defStyleAttr);
	    setOnClickListener(new OnClickListener() {

	    	@Override
        	public void onClick(View v) {
            	Toast.makeText(TCButton.this.getContext(), "TEST", Toast.LENGTH_LONG).show();
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
            	Toast.makeText(TCButton.this.getContext(), "TEST", Toast.LENGTH_LONG).show();
        		action();
        	}
        });  
	}




	
	public void action(){
		
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Toast.makeText(TCButton.this.getContext(), "TEST", Toast.LENGTH_LONG).show();
		
	}
}
