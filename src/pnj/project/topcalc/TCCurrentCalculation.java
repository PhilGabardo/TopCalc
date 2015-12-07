package pnj.project.topcalc;

import android.content.Context;
import android.widget.TextView;

public class TCCurrentCalculation extends TextView{
	private TCCalculation currentCalculation;
	
	public TCCurrentCalculation(Context context) {
		super(context);
		currentCalculation = new TCCalculation();
	}
	
	public void reset(){
		currentCalculation = new TCCalculation();
		updateDisplay();
	}
	
	public void deleteLast(){
		if (currentCalculation.expression.size() > 0){
			currentCalculation.expression.remove(currentCalculation.expression.size()-1);
			updateDisplay();
		}
	}
	
	
	public void updateDisplay(){
		this.setText(currentCalculation.toString());
	}

	public void compute() {
		currentCalculation.calculate();
		TCCalculationHistory.history.add(this);
		reset();
		updateDisplay();
		
	}

}
