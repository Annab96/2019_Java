package chap05;
import java.util.Scanner;
//실습문제 12번 
abstract class Shape{
	private Shape next;
	public Shape() {next = null;}
	public void setNext(Shape obj) {next = obj;}
	public Shape getNext() { return next;}
	public abstract void draw(); // 추상 메소
}

public class GraphicEditor extends Shape{
	GraphicEditor(){}
	public void draw() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int c;
		int s; // 모
		System.out.println("그래픽 에디터 beauty을 실행합니다.");
		while(true) {
			System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
			c = sc.nextInt();
			System.out.print("Line(1), Rect(2), Circle(3)");
			s = sc.nextInt();
		}
	}

}
