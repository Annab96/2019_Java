package chap05;
//실습문제 8번

public class PositivePoint extends Point{ // 양수의 공간에서만 점을 나타낸다. 
	
	public PositivePoint() {super(0,0);}
	public PositivePoint(int x, int y) {
		if((x>=0)&&(y>=0))
			super.move(x, y);
		else 
			super.move(0, 0);
	}
	public void move(int x, int y) {
		if((x>=0)&&(y>=0))
			super.move(x, y);
		else if((x<0)&&(y<0))
			super.move(0, 0);
		else
			super.move(getX(), getY());
	}
	public String toString() {
		String s = "(" + super.getX() + "," + super.getY() + ")의 점";
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositivePoint p = new PositivePoint();
		p.move(10,10);
		System.out.println(p.toString()+"입니다.");
		
		p.move(-5,5);
		System.out.println(p.toString()+"입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString()+"입니다.");
	}

}
