import java.util.ArrayList;

public class Testing {
	
public static void main(String args[]) {
HashSetN<String> hash=new HashSetN<String>();
ArrayList<String> name=new ArrayList<String>();
name.add("mohamed");
name.add("nagaty");
name.add("badawy");
name.add("ibraheim");
name.add("mohamed");
name.add("nagaty");
name.add("badawy");
name.add("ibraheim");
System.out.println(hash.getunique(name));

	
	}
   
}
