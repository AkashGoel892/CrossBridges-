package default2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrangeLinkedList {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();

		list.add(17);
		list.add(15);
		list.add(8);
		list.add(12);
		list.add(10);
		list.add(5);
		list.add(4);
		list.add(1);
		list.add(7);
		list.add(6);
		list.add(13);
		list.add(17);

		System.out.println("Original Linked List: " + list);

		Object[] arr = new Integer[list.size()];
		arr = list.toArray();

		int j=-1,temp;
		for (int i = 0; i < arr.length ; i++) {

			if ((int) arr[i] % 2 != 0) {
				
				j++;
				temp = (int) arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
			}
		}
		List<Object> out = new LinkedList<Object>();
		out=Arrays.asList(arr);
		System.out.println("Arranged List: "+out);
	}

}
