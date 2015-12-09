package pnj.project.topcalc;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v4.app.DialogFragment;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class HelpButton extends TCButton {
	
	public HelpButton(Context context) {
		super(context);
	    setOnClickListener(new OnClickListener() {

            @Override
        	public void onClick(View v) {
            	
            	openAlert(v,"Help",getContext().getString(R.string.dialog_help));
            	action();
        	}
        });    
	}

	public HelpButton(Context context, AttributeSet attrs) {
	    super(context, attrs);
	    setOnClickListener(new OnClickListener() {

	    	@Override
        	public void onClick(View v) {
	    			openAlert(v,"Help",getContext().getString(R.string.dialog_help));
	    		action();
        	}
        });  
	}

	public HelpButton(Context context, AttributeSet attrs, int defStyleAttr) {
	    super(context, attrs, defStyleAttr);
	    setOnClickListener(new OnClickListener() {

	    	@Override
        	public void onClick(View v) {
	    			openAlert(v,"Help",getContext().getString(R.string.dialog_help));
            	action();
        	}
        });
	}

	@TargetApi(21)
	public HelpButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    super(context, attrs, defStyleAttr);
	    setOnClickListener(new OnClickListener() {

	    	@Override
        	public void onClick(View v) {
	    			openAlert(v,"Help",getContext().getString(R.string.dialog_help));
        		action();
        	}
        });  
	}

	private void openAlert(View view, String title,String message) {
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
