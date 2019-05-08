package chap04;
import java.util.Scanner;
//실습문제 8번
class Phone {
   private String name;
   private String tel;
   Phone(String name, String tel) {
      this.name = name;
      this.tel = tel;
   }
   public String getName() {
      return name;
   }
   public String getTel() {
      return tel;
   }
}

public class PhoneBook {
   
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Scanner scanner = new Scanner(System.in);
      Phone p[];
      int i;
      System.out.print("인원수 >> ");
      int n = scanner.nextInt();
      p = new Phone[n];
      for(i=0; i<p.length; i++) {
         System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
         String name = scanner.next();
         String tel = scanner.next();
         p[i] = new Phone(name, tel);
      }
      System.out.println("저장되었습니다...");
      while(true) {
         System.out.print("검색할 이름 >>");
         String name = scanner.next();
         if(name.equals("그만")) break;
         for(i=0; i<n; i++) {
            if(name.equals(p[i].getName())) {
               System.out.println(name+"의 번호는 "+p[i].getTel()+" 입니다.");
               i--;
               break;
            }
         }
         if (i == n) System.out.println(name+"이 없습니다.");
      }
      
      scanner.close();
   }

}