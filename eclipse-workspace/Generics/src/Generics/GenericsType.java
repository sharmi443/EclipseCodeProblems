/**
 * 
 */
package Generics;

public class GenericsType<T> {

	private Object t;

	public Object get() {
		return t;
	}

	public void set(T t1) {
		this.t = t1;
		String str = (String) t;
	}
	
/*	public void test() {
		String str = t;
	}*/

        public static void main(String args[]){
//		GenericsType<String> type = new GenericsType();
//		type.set("Pankaj"); 
////		type.set(10);
//		String str = (String) type.get(); //type casting, error prone and can cause ClassCastException
		
		GenericsType type1 = new GenericsType(); //raw type
		type1.set("Pankaj"); //valid
		type1.set(10); //valid and autoboxing support
		
		
	}
}
