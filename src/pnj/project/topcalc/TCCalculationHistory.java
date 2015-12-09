package pnj.project.topcalc;

import java.util.ArrayList;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class TCCalculationHistory extends TextView{
	static ArrayList<Calculation> history;
	int indexToDisplay;
	
	public TCCalculationHistory(Context context) {
	    super(context);
	    history = new ArrayList<Calculation>();
		indexToDisplay = -1;
		update();
	}

	public TCCalculationHistory(Context context, AttributeSet attrs) {
	    super(context, attrs);
	    history = new ArrayList<Calculation>();
		indexToDisplay = -1;
		update();
	}

	public TCCalculationHistory(Context context, AttributeSet attrs, int defStyleAttr) {
	    super(context, attrs, defStyleAttr);
	    history = new ArrayList<Calculation>();
		indexToDisplay = -1;
		update();
	}

	@TargetApi(21)
	public TCCalculationHistory(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    super(context, attrs, defStyleAttr);
	    history = new ArrayList<Calculation>();
		indexToDisplay = -1;
		update();
	}
	
	public void add(Calculation calc){
		history.add(calc);
		indexToDisplay++;
	}
	
	public void resetIndex(){
		indexToDisplay = history.size() - 1;
	}
	
	public String answerToDisplay(){
		if (history.size() == 0) return "";
		return history.get(indexToDisplay).answer;
	}
	
	public void update(){
		if (indexToDisplay >= 0) {
			this.setText(history.get(indexToDisplay).toScreen());
		}
		else{
			this.setText(" ");
		}
	}
	

}
