package pnj.project.topcalc;

import java.util.ArrayList;

import expr.Expr;
import expr.Parser;
import expr.SyntaxException;
import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class TCCurrentCalculation extends TextView{
	ArrayList<TCTermButton> expression;
	String answer;
	
	
	public TCCurrentCalculation(Context context) {
	    super(context);
	    expression = new ArrayList<TCTermButton>();
	    updateDisplay();
	}

	public TCCurrentCalculation(Context context, AttributeSet attrs) {
	    super(context, attrs);
	    expression = new ArrayList<TCTermButton>();
	    updateDisplay();
	}

	public TCCurrentCalculation(Context context, AttributeSet attrs, int defStyleAttr) {
	    super(context, attrs, defStyleAttr);
	    expression = new ArrayList<TCTermButton>();
	    updateDisplay();
	}

	@TargetApi(21)
	public TCCurrentCalculation(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	    super(context, attrs, defStyleAttr);
	    expression = new ArrayList<TCTermButton>();
	    updateDisplay();
	}

	
	public void reset(){
		expression = new ArrayList<TCTermButton>();
		updateDisplay();
	}
	
	public void deleteLast(){
		if (expression.size() > 0){
			expression.remove(expression.size()-1);
		}
		updateDisplay();
	}
	
	public TCTermButton getLast(){
		if (expression.size() > 0){
			return expression.get(expression.size()-1);
		}
		return null;
	}
	
	public void add(TCTermButton term){
		expression.add(term);
		updateDisplay();
	}
	
	
	public void updateDisplay(){
		this.setText(toScreen());
		this.invalidate();
	}

	public void compute() throws SyntaxException {
		calculate();
		Calculator.calculationHistory.add(new Calculation(this));
		Calculator.calculationHistory.resetIndex();
		Calculator.calculationHistory.update();
		Calculator.answer.update();
		reset();
		updateDisplay();
		
	}

	public pnj.project.topcalc.TCTermButton.Type getLastType() {
		if(expression.size() <= 0){
			return null;
		}
		return getLast().type;
	}
	
	public String toStringWithAnswer(){
		String s = "";
		for (TCTermButton term: expression){
			s += term.term;
		}
		s += "=" + answer;
		return s;
	}
	
	public void calculate() throws SyntaxException {
		answer = String.valueOf(parse());
	}
	
	public String toScreen(){
		String expressionString = " ";
		for (int i = 0; i < expression.size(); i++){
			expressionString += expression.get(i).term;
		}
		return expressionString;
	}
	
	public double parse() throws SyntaxException{
		Expr expr;
		expr = Parser.parse(toScreen().replace(" ", "").replace("x", "*").replace("\u03C0", "pi")); 
		return expr.value();
	}

}
