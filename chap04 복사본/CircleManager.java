package chap04;
import java.util.Scanner;
// 실습문제 6
class Circle{
	private double x,y;
	private int radius;
	
	public Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void show() {
		System.out.println("(" +x+","+y+")"+radius);
	}

}

public class CircleManager {
	
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
		
		double max = 0;
		int n = 0;
		for(int i = 0 ; i<c.length; i++) {
			if(c[i].getRadius()>=max) {
				max = c[i].getRadius();
				n = i;
			}
		}
		System.out.print("가장 면적이 큰 원은 ");
		c[n].show();
		scanner.close();
	}
}