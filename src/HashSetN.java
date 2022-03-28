import java.util.ArrayList;

public class HashSetN<T> {
	public  boolean contains(T item,ArrayList<T> list) {
		boolean flag=false;
		for(T element:list) {
			if(element==item) {
				flag=true;
				break;
			}
		}
		return flag;
	}
	public  ArrayList<T> getunique(ArrayList<T> list) {
		ArrayList<T> uniquelist=new ArrayList<T>();
		for(T item:list) {
		if(!contains(item,uniquelist)) {
			uniquelist.add(item);
		}
		
		}
		return uniquelist;
		
	}
}
