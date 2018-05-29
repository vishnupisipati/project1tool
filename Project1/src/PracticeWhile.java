
public class PracticeWhile {
	static int count = 0;
	int i = 0;
	public void modify() {
		while(i<5) {
			i++;
			count++;
		}
	}

	public static void main(String[] args) {
		PracticeWhile pw = new PracticeWhile();
		PracticeWhile pw1 = new PracticeWhile();
		pw.modify();
		pw1.modify();
		System.out.println(pw.count+"....,"+pw1.count);
		System.out.print(pw.i+"....,"+pw1.i);
		
		

	}

}
