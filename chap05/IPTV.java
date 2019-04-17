package chap05;
//실습문제 2번 
class TV{
	private int size;
	public TV(int size) {this.size = size;}
	protected int getSize() {return size;}
}

class ColorTV extends TV{
	private int color;
	public ColorTV(int size, int color) {
		super(size);
		this.color = color;
	}
	protected int getColor() {return color;}
	public void printProperty() {
		System.out.println(getSize() + "인치 " + color + "컬러");
	}
}

public class IPTV extends ColorTV{
	private String addr;
	public IPTV(String addr, int size, int color) {
		super(size, color);
		this.addr = addr;
	}
	protected String getAddr() {return addr;}
	public void printProperty() {
		System.out.print("나의 IPTV는 " + getAddr() + " 주소의 ");
		super.printProperty();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		
		iptv.printProperty();
	}

}
