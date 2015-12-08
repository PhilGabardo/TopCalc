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
		TCAnswerButton AnswerButton =(TCAnswerButton) findViewById(R.id.AnswerButton);
		EqualsButton equals = (EqualsButton) findViewById(R.id.equals);
		DeleteButton delete= (DeleteButton) findViewById(R.id.delete);
		TCTermButton LBracket = (TCTermButton) findViewById(R.id.LBracket);
		TCTermButton RBracket = (TCTermButton) findViewById(R.id.RBracket);
		TCTermButton percent = (TCTermButton) findViewById(R.id.percent);
		TCTermButton divide = (TCTermButton) findViewById(R.id.divide);
		TCTermButton xpow2 = (TCTermButton) findViewById(R.id.xpow2);
		TCTermButton xpow3 = (TCTermButton) findViewById(R.id.xpow3);
		TCTermButton xpown = (TCTermButton) findViewById(R.id.xpown);
		TCTermButton epowx = (TCTermButton) findViewById(R.id.epowx);
		TCTermButton tenPowN = (TCTermButton) findViewById(R.id.tenpown);
		TCTermButton seven = (TCTermButton) findViewById(R.id.seven);
		TCTermButton eight = (TCTermButton) findViewById(R.id.eight);
		TCTermButton nine = (TCTermButton) findViewById(R.id.nine);
		TCTermButton multiply = (TCTermButton) findViewById(R.id.multiply);
		TCTermButton sqrt = (TCTermButton) findViewById(R.id.sqrt);
		TCTermButton thirdrt = (TCTermButton) findViewById(R.id.thirdrt);
		TCTermButton ythrt = (TCTermButton) findViewById(R.id.xrty);
		TCTermButton ln = (TCTermButton) findViewById(R.id.ln);
		TCTermButton log = (TCTermButton) findViewById(R.id.log);
		TCTermButton four = (TCTermButton) findViewById(R.id.four);
		TCTermButton five = (TCTermButton) findViewById(R.id.five);
		TCTermButton six = (TCTermButton) findViewById(R.id.six);
		TCTermButton minus = (TCTermButton) findViewById(R.id.minus);
		TCTermButton factorial = (TCTermButton) findViewById(R.id.factorial);
		TCTermButton sin = (TCTermButton) findViewById(R.id.sin);
		TCTermButton cos = (TCTermButton) findViewById(R.id.cos);
		TCTermButton tan = (TCTermButton) findViewById(R.id.tan);
		TCTermButton mod = (TCTermButton) findViewById(R.id.mod);
		TCTermButton one = (TCTermButton) findViewById(R.id.one);
		TCTermButton two = (TCTermButton) findViewById(R.id.two);
		TCTermButton three = (TCTermButton) findViewById(R.id.three);
		TCTermButton plus = (TCTermButton) findViewById(R.id.plus);
		TCTermButton radians = (TCTermButton) findViewById(R.id.radians);
		TCTermButton sinInv = (TCTermButton) findViewById(R.id.sinInv);
		TCTermButton cosInv = (TCTermButton) findViewById(R.id.cosinv);
		TCTermButton tanInv = (TCTermButton) findViewById(R.id.taninv);
		TCTermButton pi= (TCTermButton) findViewById(R.id.pi);
		TCTermButton zero = (TCTermButton) findViewById(R.id.zero);
		TCTermButton decimal = (TCTermButton) findViewById(R.id.decimal);	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculator, menu);
		return true;
	}

}
