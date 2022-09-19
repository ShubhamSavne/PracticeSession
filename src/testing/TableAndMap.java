package testing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class TableAndMap 
{
		public static void main(String[] args) 
		{
		
		ArrayList list = new ArrayList();  //10
		list.add("test");
		list.add('a');
		list.add(30);
		list.add(null);
		list.add(40.30);
		list.add(null);
		list.add(10);
		list.add(true);
		System.out.println(list);
		
		
		HashSet set= new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(null);
		set.add(40);
		set.add(10);
		set.add(null);
		
		System.out.println(set);
		
		HashMap map = new HashMap();
		map.put("Name", "Abcd");
		map.put("SName", "Xyz");
		map.put(null, 1234);
		map.put(null, 789);
		map.put("add", "pune");
		map.put("test", null);
		map.put("test2", null);
		
		System.out.println(map);
		
		
		Hashtable table = new Hashtable();
		table.put("Name", "Abcd");
		table.put("SName", "Xyz");
		table.put("address", 1234);
		table.put("house", 7);
		table.put("test", "value1");
		table.put("test2", "value2");
		table.put(123, "123");
		
		System.out.println(table);
		
		
	}

}
