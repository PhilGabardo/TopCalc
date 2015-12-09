package pnj.project.topcalc;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

public class Calculator extends Activity {

	static ArrayList<TCTermButton> tcTermButtons;
	static ACButton ac;
	static DeleteButton delete;
	static EqualsButton equals;
	static TCAnswerButton answer;
	static TCCurrentCalculation currentCalculation;
	static TCCalculationHistory calculationHistory;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//Remove title bar
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		//Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.calculator_layout);
			
		ACButton AC = (ACButton) findViewById(R.id.AC);
		answer = (TCAnswerButton) findViewById(R.id.AnswerButton);
		EqualsButton equals = (EqualsButton) findViewById(R.id.equals);
		DeleteButton delete= (DeleteButton) findViewById(R.id.delete);
		currentCalculation = (TCCurrentCalculation) findViewById(R.id.MainCalc);
		calculationHistory = (TCCalculationHistory) findViewById(R.id.PrevCalc);
		tcTermButtons = new ArrayList<TCTermButton>();
		tcTermButtons.add((TCTermButton) findViewById(R.id.LBracket));
		tcTermButtons.add((TCTermButton) findViewById(R.id.RBracket));
		tcTermButtons.add((TCTermButton) findViewById(R.id.percent));
		tcTermButtons.add((TCTermButton) findViewById(R.id.divide));
		tcTermButtons.add((TCTermButton) findViewById(R.id.xpow2));
		tcTermButtons.add((TCTermButton) findViewById(R.id.xpow3));
		tcTermButtons.add((TCTermButton) findViewById(R.id.xpown));
		tcTermButtons.add((TCTermButton) findViewById(R.id.epowx));
		tcTermButtons.add((TCTermButton) findViewById(R.id.tenpown));
		tcTermButtons.add((TCTermButton) findViewById(R.id.seven));
		tcTermButtons.add((TCTermButton) findViewById(R.id.eight));
		tcTermButtons.add((TCTermButton) findViewById(R.id.nine));
		tcTermButtons.add((TCTermButton) findViewById(R.id.multiply));
		tcTermButtons.add((TCTermButton) findViewById(R.id.sqrt));
		tcTermButtons.add((TCTermButton) findViewById(R.id.thirdrt));
		tcTermButtons.add((TCTermButton) findViewById(R.id.xrty));
		tcTermButtons.add((TCTermButton) findViewById(R.id.ln));
		tcTermButtons.add((TCTermButton) findViewById(R.id.log));
		tcTermButtons.add((TCTermButton) findViewById(R.id.four));
		tcTermButtons.add((TCTermButton) findViewById(R.id.five));
		tcTermButtons.add((TCTermButton) findViewById(R.id.six));
		tcTermButtons.add((TCTermButton) findViewById(R.id.minus));
		tcTermButtons.add((TCTermButton) findViewById(R.id.factorial));
		tcTermButtons.add((TCTermButton) findViewById(R.id.sin));
		tcTermButtons.add((TCTermButton) findViewById(R.id.cos));
		tcTermButtons.add((TCTermButton) findViewById(R.id.tan));
		tcTermButtons.add((TCTermButton) findViewById(R.id.mod));
		tcTermButtons.add((TCTermButton) findViewById(R.id.one));
		tcTermButtons.add((TCTermButton) findViewById(R.id.two));
		tcTermButtons.add((TCTermButton) findViewById(R.id.three));
		tcTermButtons.add((TCTermButton) findViewById(R.id.plus));
		tcTermButtons.add((TCTermButton) findViewById(R.id.abs));
		tcTermButtons.add((TCTermButton) findViewById(R.id.sinInv));
		tcTermButtons.add((TCTermButton) findViewById(R.id.cosinv));
		tcTermButtons.add((TCTermButton) findViewById(R.id.taninv));
		tcTermButtons.add((TCTermButton) findViewById(R.id.pi));
		tcTermButtons.add((TCTermButton) findViewById(R.id.zero));
		tcTermButtons.add((TCTermButton) findViewById(R.id.decimal));	
		RefreshButtonEnabling.refresh();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculator, menu);
		return true;
	}

}
