import honam.inc.opp.chap06.app.Goodcalc;
import honam.inc.oop.chap06.Calculator;

public class TestDrive0529 {

	public static void main(String[] args) {
		int [] input = {1,2,3,4,5};
		Calculator mycal = new Goodcalc();
		System.out.println(mycal.add(10, 5));
		System.out.println(mycal.substract(10, 5));
		System.out.println(mycal.average(input));
	}

}
