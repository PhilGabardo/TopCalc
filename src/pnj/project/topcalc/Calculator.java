package pnj.project.topcalc;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Calculator extends Activity {
	
	static TCTermButton[] tcbuttons;
	static ACButton ac;
	static DeleteButton delete;
	static EqualsButton equals;
	static TCCurrentCalculation currentCalculation;
	static TCCalculationHistory calculationHistory; 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculator);
		currentCalculation = new TCCurrentCalculation(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculator, menu);
		return true;
	}

}
