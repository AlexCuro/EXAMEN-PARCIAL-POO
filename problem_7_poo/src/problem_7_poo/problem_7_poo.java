package problem_7_poo;

public class problem_7_poo {
	public static int sizeof(int a) {
		return 4;
	}
	public static int sizeof(double b) {
		return 8;
	}
	public static void main(String[] args) {
		int i; 
		int x=4, w=9, q;
		for (i=-1;i<20;i+=3) {
			x++;
			for(q=4;q<11;q++) {
				do {
					i=+3;
					w=sizeof(i);
					i=x+w;
					x=w+i;
				}while(x<15);
			}
		}
		System.out.println("x:"+x+" "+"i:"+i);
	}
	

}
