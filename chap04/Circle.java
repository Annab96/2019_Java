package chap04;
import java.util.Scanner;

class Circle{
	private double x,y;
	private int radius;
	int max;
	
	public Circle() {}
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		for(int i = 0 ; i<3; i++) {
			if(max > this.radius)
				max = this.radius;
		}
		System.out.println("가장 면적인 큰 원은 (" +x+","+y+")"+radius);
	}
}

class CircleManager {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Circle c[] = new Circle[3];
		for(int i = 0 ; i < c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();
			int radius = scanner.nextInt();
			c[i] = new Circle(x, y, radius);
		}
		for(int i = 0 ; i<c.length; i++) c[i].show();
		scanner.close();
	}

}
