
public class Practice {
	String x = "10";
public void m1(String s) {
	
	int y = 0;
	try {
		String x = s;
		y = Integer.parseInt(x);
	}
	catch(NumberFormatException e){
		
	}
	System.out.println("x:"+ x +  ",y:"+y);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Practice p = new Practice();
 p.m1("5");
// System.out.print(p.x);
 
	}

}
