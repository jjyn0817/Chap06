package honam.inc.opp.chap06.app;

import honam.inc.oop.chap06.Calculator;

public class Goodcalc extends Calculator {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		return a - b;
	}

	@Override
	public double average(int[] a) {
		int sum=0;
		for (int i = 0; i < a.length; i++)
			sum = sum+a[i];
		
		return 0;
	}

}
