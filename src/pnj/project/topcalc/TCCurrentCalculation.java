package pnj.project.topcalc;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class TCCurrentCalculation extends TextView{
	private TCCalculation currentCalculation;
	
	public TCCurrentCalculation(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
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
	
	public TCTermButton getLast(){
		if (getCurrentCalculation().expression.size() > 0){
			return getCurrentCalculation().expression.get(getCurrentCalculation().expression.size()-1);
		}
		return null;
	}
	
	public void add(TCTermButton term){
		getCurrentCalculation().expression.add(term);
		updateDisplay();
	}
	
	
	public void updateDisplay(){
		this.setText(getCurrentCalculation().toString());
	}

	public void compute() {
		getCurrentCalculation().calculate();
		Calculator.calculationHistory.add(this);
		Calculator.calculationHistory.resetIndex();
		Calculator.answer.update();
		reset();
		updateDisplay();
		
	}

	public TCCalculation getCurrentCalculation() {
		return currentCalculation;
	}

	public void setCurrentCalculation(TCCalculation currentCalculation) {
		this.currentCalculation = currentCalculation;
	}

	public pnj.project.topcalc.TCTermButton.Type getLastTyped() {
		if(getCurrentCalculation().expression.size() < 0){
			return null;
		}
		return getLast().type;
	}

}
