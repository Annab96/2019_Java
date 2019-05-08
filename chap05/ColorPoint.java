package chap05;
// 실습문제 6번 

public class ColorPoint extends Point{
	private String color;
	public ColorPoint() { super(0, 0); this.color = "BLACK"; }
	public ColorPoint(int x, int y) { super(x,y);}
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	public void setXY(int x, int y) {
		super.move(x, y);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String toString() {
		String s = color + "색의 (" + getX() + "," + getY() + ")의 점";
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColorPoint zeroPoint = new ColorPoint();
		System.out.println(zeroPoint.toString() + "입니다. ");
		
		ColorPoint cp = new ColorPoint(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다. ");
	}

}
