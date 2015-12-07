package pnj.project.topcalc;

import java.util.ArrayList;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class TCCalculationHistory extends TextView{
	static ArrayList<TCCurrentCalculation> history;
	int indexToDisplay;
	
	public TCCalculationHistory(Context context) {
	    super(context);
	    history = new ArrayList<TCCurrentCalculation>();
		indexToDisplay = -1;
	}

	public TCCalculationHistory(Context context, AttributeSet attrs) {
	    super(context, attrs);
	    history = new ArrayList<TCCurrentCalculation>();
		indexToDisplay = -1;
	}

	public TCCalculationHistory(Context context, AttributeSet attrs, int defStyleAttr) {
	    super(context, attrs, defStyleAttr);
	    history = new ArrayList<TCCurrentCalculation>();
		indexToDisplay = -1;
	}

	@TargetApi(21)
	public TCCalculationHistory(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    super(context, attrs, defStyleAttr);
	    history = new ArrayList<TCCurrentCalculation>();
		indexToDisplay = -1;
	}
	
	public void add(TCCurrentCalculation calc){
		history.add(calc);
		indexToDisplay++;
	}
	
	public void resetIndex(){
		indexToDisplay = history.size() - 1;
	}
	
	public String answerToDisplay(){
		if (history.size() == 0) return "";
		return history.get(indexToDisplay).getCurrentCalculation().answer;
	}
	
	public void update(){
		if (indexToDisplay > 0) {
			this.setText(history.get(indexToDisplay).toString());
		}
	}

}
