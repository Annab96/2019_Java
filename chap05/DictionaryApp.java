package chap05;
//실습문제 10번 
abstract class PairMap{
	protected String keyArray []; // 키저장 
	protected String valueArray[]; // 값 저장 
	abstract String get(String key); //key의 값을 가진 value리턴 
	abstract void put(String key, String value); // key value 쌍으로 저장 
	abstract String delete(String key); // key 값을 가진 아이템 삭제 
	abstract int length(); // 저장된 아이템 개수 리턴 
}
class Dictionary extends PairMap{
	protected int count = 0;
	
	public Dictionary(int n) {
		keyArray = new String[n];
		valueArray = new String[n];
	}
	
	String get(String key){
		for(int i = 0; i<count ; i++) {
			if(keyArray[i].equals(key)) 
				return valueArray[i];
		}
		return null;
	}

	void put(String key, String value) {
		int i= 0;
		for(i=0; i<count; i++) {
			if(keyArray[i].equals(key)) break;
	}
		if(i == count) {
			if(i<keyArray.length) {
				keyArray[i]=key;
				valueArray[i]=value;
				count++;
			}
		}
		else {
			keyArray[i]=key;
			valueArray[i]=value;
		}
	}
	
	String delete(String key) {
		int i = 0;
		for(i = 0 ; i<count;i++) {
			if(keyArray[i].equals(key)) 
				break;
		}
		
	if(i==count)
		return null;
	
	String value = valueArray[i];
	
	int last = count-1;
	for(int j = i ; j<last; j++) {
		keyArray[j] = keyArray[j+1];
		valueArray[j] = valueArray[j+1];
	}
	count--;
	return value;
	}
	
	int length() {return count;}
	
}
public class DictionaryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dictionary dic = new Dictionary(10);
		dic.put("황기태" , "자바");
		dic.put("이재문", "파이선");
		dic.put("이재", "C++");
		System.out.println("이재문의 값은 " +dic.get("이재문" ));
		System.out.println("황기태의 값은 " +dic.get("황기태" ));
		dic.delete("황기태");
		System.out.println("황기태의 값은 " +dic.get("황기태" ));
	}

}
