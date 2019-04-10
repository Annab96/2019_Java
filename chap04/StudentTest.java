package chap04;
import java.util.Scanner;

/*자바 스터디 04102019 과제*/
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		Student s1 = new Student(); // 학생1
		System.out.print("학번 입력: ");
		int id = scanner.nextInt();
		s1.setId(id);
		System.out.print("이름 입력: ");
		String name = scanner.next();
		s1.setName(name);
		scanner.nextLine();
		System.out.print("성적 입력: ");
		double score = scanner.nextDouble();
		s1.setScore(score);
		
		Student s2 = new Student(); // 학생2
		System.out.print("학번 입력: ");
		id = scanner.nextInt();
		s2.setId(id);
		System.out.print("이름 입력: ");
		name = scanner.next();
		s2.setName(name);
		scanner.nextLine();
		System.out.print("성적 입력: ");
		score = scanner.nextDouble();
		s2.setScore(score);
		
		if(s1.getId()>=s2.getId()) System.out.println(s1.getId());
		else System.out.println(s2.getId());
		
		if((s1.getName().compareTo(s2.getName())>0)) System.out.println(s2.getName());
		else System.out.println(s1.getName());
		
		if(s1.getScore()>=s2.getScore()) System.out.println(s1.getScore());
		else s2.getScore();
		
		if(s1.pass(1.5) == true) System.out.println("기준 성적 1.5일 때 s1은 합격"); 
		else System.out.println("기준 성적 1.5일 때 s1은 불합격");
		
		if(s2.pass(1.5) == true) System.out.println("기준 성적 1.5일 때 s2는 합격"); 
		else System.out.println("기준 성적 1.5일 때 s2는 불합격");	
		
	}

}
