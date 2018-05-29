

		  

class Triangle{
		 int x;
		 int y;
		 public void dostuff(int x, int y) {
			 this.x = x;
			 y = this.y;
		 }
		 public void print() {
			 System.out.println(x + ":" +y);
		 }
		 public static void vishnumain(String[] args) {
			 Triangle t1 = new Triangle();
			 t1.x = 100;
			 t1.y = 200;
			 Triangle t2 = new Triangle();
			 t1.dostuff(t1.x, t1.y);
			 t1.print();
			 t2.print();
		 }
}
