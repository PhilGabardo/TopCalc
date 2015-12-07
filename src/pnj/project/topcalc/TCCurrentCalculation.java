package pnj.project.topcalc;

import android.content.Context;
import android.widget.TextView;

public class TCCurrentCalculation extends TextView{
	private TCCalculation currentCalculation;
	
	public TCCurrentCalculation(Context context) {
		super(context);
		setCurrentCalculation(new TCCalculation());
	}
	
	public void reset(){
		setCurrentCalculation(new TCCalculation());
		updateDisplay();
	}
	
	public void deleteLast(){
		if (getCurrentCalculation().expression.size() > 0){
			getCurrentCalculation().expression.remove(getCurrentCalculation().expression.size()-1);
			updateDisplay();
		}
	}
	
	public void add(TCButton term){
		getCurrentCalculation().expression.add(term);
		updateDisplay();
	}
	
	
	public void updateDisplay(){
		this.setText(getCurrentCalculation().toString());
	}

	public void compute() {
		getCurrentCalculation().calculate();
		TCCalculationHistory.history.add(this);
		reset();
		updateDisplay();
		
	}

	public TCCalculation getCurrentCalculation() {
		return currentCalculation;
	}

	public void setCurrentCalculation(TCCalculation currentCalculation) {
		this.currentCalculation = currentCalculation;
	}

}
