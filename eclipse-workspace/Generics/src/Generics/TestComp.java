package Generics;


public class TestComp implements Comparable<TestComp> {
	
	
			// TODO Auto-generated constructor stub
	/*	public <T extends Comparable<T>> int compare(T t1, T t2){
			return t1.compareTo(t2);
		}*/
	
		@Override
		public int compareTo(TestComp t) {
			return 1;
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
