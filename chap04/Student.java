package chap04;

/*자바 스터디 04102019 과제*/
public class Student { 
	
	private int id;
	private String name;
	private double score;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public boolean pass(double standard) {
		if(score>=standard) return true;
		else return false;
	}
}
