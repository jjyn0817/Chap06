import honam.inc.oop.chap06.Rect;

public class TestDrive0601 extends Rect {

	public static void main(String[] args) {
		Rect a = new Rect(2,3);
		Rect b = new Rect(3,2);
		Rect c = new Rect(3,4);
		if(a.equals(b))System.out.println("a eqaul to b");
		if(a.equals(c))System.out.println("a eqaul to c");
		if(b.equals(c))System.out.println("b eqaul to c");
		
		System.out.println(a.getClass().getName());
		System.out.println(a.hashCode());
		System.out.println(a.toString());
		
	}

}
