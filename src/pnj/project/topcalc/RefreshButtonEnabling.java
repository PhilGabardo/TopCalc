package pnj.project.topcalc;

import android.view.View;

public class RefreshButtonEnabling {
	public static void refresh(){
		for (TCTermButton term: Calculator.tcTermButtons){
			if (term.isValid()){
			
				term.setEnabled(true);
			}
			else{
				
				term.setEnabled(false);
			}
		}
	}

}
