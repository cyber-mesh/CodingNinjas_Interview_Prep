import java.util.*;
public class InfiniteArray {
boolean val;
	HashMap<Integer,Boolean> m;
	InfiniteArray() {
		 val=false;
		 m=new HashMap<>();
	}
	void setAllTrue() {
	  m.clear(); 
	  val=true;
	}
	void setAllFalse() {
	  m.clear();
	  val=false;
	}
	void setIndexTrue(int index) {
	  m.put(index,true);	 
	}
	void setIndexFalse(int index) {
	  // Implement the function here	
	  m.put(index,false);
	}
	boolean getIndex(int index) {
	  if(m.containsKey(index)) return m.get(index);
	  return val;
	}
}
