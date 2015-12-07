package pnj.project.topcalc;

import android.annotation.TargetApi;
import android.content.Context;
import android.widget.Button;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;

public class DeleteButton extends Button implements OnClickListener{


	public DeleteButton(Context context) {
	    super(context);
	}

	public DeleteButton(Context context, AttributeSet attrs) {
	    super(context, attrs);
	}

	public DeleteButton(Context context, AttributeSet attrs, int defStyleAttr) {
	    super(context, attrs, defStyleAttr);
	}

	@TargetApi(21)
	public DeleteButton(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    super(context, attrs, defStyleAttr);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}


}
