package day3assignment;

public class Searchelement {
	public void searchkey(int [] array,int key) {
		int flag = 0;
		int i;
		for( i = 0; i < array.length; i++)
        {
            if(array[i] == key)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
		if(flag == 1)
        {
            System.out.println("Element found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
	
		
	}

}
