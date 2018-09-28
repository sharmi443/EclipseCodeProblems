import java.util.ArrayList;
import java.util.List;

public class SearchInArrayList {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numList = new ArrayList<Integer>();
		  
		  numList.add(4);
		  numList.add(1);
		  numList.add(7);
		  numList.add(3);
		  numList.add(0);
		  
		  //searching
		  int searchNum = 5;
		  
		  
	int i = 0;
	while (i< numList.size()) {
		if(numList.get(i) == searchNum)
		{
		  	System.out.println(searchNum + " is found");
		  	break;
		}
		
		else
		{
		  	i++;
		}
	}
	if(i==numList.size())
	{
		System.out.println(searchNum + " is not found");
	}

}
}
