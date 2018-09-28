package Generics;

import java.util.ArrayList;
import java.util.List;

public class UnderstandList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				List list = new ArrayList();
				list.add("abc");
				list.add(new Integer(5));
				
				for(Object obj : list){
					//type casting leading to ClassCastException at runtime
				    //Integer str=(Integer) obj; 
				}
//		
//		
//
//for(Object obj : list){
//	//type casting leading to ClassCastException at runtime
////    String str=(String) obj; 
//    System.out.println(obj);
//}
	}

}


