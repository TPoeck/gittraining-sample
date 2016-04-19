package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

public class Power extends AbstractOperation implements BinaryOperation {
	public String  getName () {
		return "^";
	}
	
	public float perform (float arg1, float arg2){
		return (float) Math.pow(arg1,arg2);
	}

}
