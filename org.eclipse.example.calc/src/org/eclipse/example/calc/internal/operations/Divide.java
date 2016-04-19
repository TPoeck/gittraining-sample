package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

public class Divide extends AbstractOperation implements BinaryOperation {
public String getName () {
	return "/";
}

public float perform (float arg1, float arg2){
	return arg1/arg2;
}
}
