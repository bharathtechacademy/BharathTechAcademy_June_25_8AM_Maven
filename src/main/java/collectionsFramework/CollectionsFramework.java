package collectionsFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsFramework {

	public static void main(String[] args) {
		
		//Challenges with Array
		
		String[] empNames2 = new String[3];
		empNames2[0] = "Alice";
		empNames2[1] = "Bob";
		empNames2[2] = "Charlie";
//		empNames2[3] = "Mamta";
		
//		1. Fixed Length
//		2. Memory allocation at the begining
//		3. similar data types
//		4. modifications not allowed
		
		
		//Collections
		
//		Hash ==> random
//		Link ==> Insertion
//		Tree ==> Ascending
		
		//List ==> ArrayList, LinkedList  (order of values or storing null values makes the difference or memory allocation)
//			1. List can store multiple values with similar data types together
//			2. List can store duplicate values
//			3. List can follow dynamic memory allocation
//			4. List can allow modifications
			
		//2. Set  ==> HashSet, LinkedHashSet, TreeSet
//			1. Set can store multiple values with similar data types together
//			2. Set cannot store duplicate values
//			3. Set can follow dynamic memory allocation
//			4. Set can allow modifications	
		
		//3. Map  ==> HashMap, LinkedHashMap, TreeMap, Hashtable
//			1. Map can store multiple datatypes together in the form of Key and Values
//			2. Map can store duplicate values but, duplicate keys are not allowed
//			3. Map can follow dynamic memory allocation
//			4. Map can allow modifications
		
	/******************************List- ArrayList********************************/
		//Syntax to initialize an ArrayList: List<DataType> listName = new ArrayList<DataType>();
		// Syntax to store values in an ArrayList: listName.add(value);
		// Syntax to retrieve values from an ArrayList: listName.get(index);
		// Syntax to remove values from an ArrayList: listName.remove(index);
		// Syntax to get the size of an ArrayList: listName.size();
		
		// ArrayList follows insertion order and allows duplicate values.
		
		System.out.println("**************List- ArrayList****************");
		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("John");
		empNamesArrayList.add("Jane");
		empNamesArrayList.add("Doe");
		empNamesArrayList.add("Alice");
		empNamesArrayList.add("John");
		empNamesArrayList.add("Charlie");
		empNamesArrayList.remove("Alice");
		empNamesArrayList.add(null);
		System.out.println(empNamesArrayList.size());
		System.out.println(empNamesArrayList.get(1));
		System.out.println(empNamesArrayList);
		
		/******************************List- LinkedList********************************/
		//Syntax to initialize an LinkedList: List<DataType> listName = new LinkedList<DataType>();
		// Syntax to store values in an LinkedList: listName.add(value);
		// Syntax to retrieve values from an LinkedList: listName.get(index);
		// Syntax to remove values from an LinkedList: listName.remove(index);
		// Syntax to get the size of an LinkedList: listName.size();
		
		// LinkedList follows insertion order and allows duplicate values.
		
		System.out.println("**************List- LinkedList****************");
		List<String> empNamesLinkedList = new LinkedList<String>();
		empNamesLinkedList.add("John");
		empNamesLinkedList.add("Jane");
		empNamesLinkedList.add("Doe");
		empNamesLinkedList.add("Alice");
		empNamesLinkedList.add("John");
		empNamesLinkedList.add("Charlie");
		empNamesLinkedList.remove("Alice");
		empNamesLinkedList.add(null);
		System.out.println(empNamesLinkedList.size());
		System.out.println(empNamesLinkedList.get(1));
		System.out.println(empNamesLinkedList);
		
		
		/******************************Set- HashSet********************************/
		//Syntax to initialize an HashSet: Set<DataType> SetName = new HashSet<DataType>();
		
		// Syntax to store values in an HashSet: SetName.add(value);
		// Syntax to retrieve values from an HashSet: SetName.get(index); -- Not applicable for HashSet
		// Syntax to remove values from an HashSet: SetName.remove(index);
		// Syntax to get the size of an HashSet: SetName.size();
		
		// HashSet follows - Random order and does not allow duplicate values.
		// HashSet allow null values.
		
		System.out.println("**************Set- HashSet****************");
		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("John");
		empNamesHashSet.add("Jane");
		empNamesHashSet.add("Doe");
		empNamesHashSet.add("Alice");
		empNamesHashSet.add("John");
		empNamesHashSet.add("Charlie");
		empNamesHashSet.remove("Alice");
		empNamesHashSet.add(null);
		System.out.println(empNamesHashSet.size());
//		System.out.println(empNamesHashSet.get(1));
		System.out.println(empNamesHashSet);
		
		/******************************Set- LinkedHashSet********************************/
		//Syntax to initialize an LinkedHashSet: Set<DataType> SetName = new LinkedHashSet<DataType>();
		
		// Syntax to store values in an LinkedHashSet: SetName.add(value);
		// Syntax to retrieve values from an LinkedHashSet: SetName.get(index); -- Not applicable for LinkedHashSet
		// Syntax to remove values from an LinkedHashSet: SetName.remove(index);
		// Syntax to get the size of an LinkedHashSet: SetName.size();
		
		// LinkedHashSet follows - Insertion order and does not allow duplicate values.
		// LinkedHashSet allow null values.
		
		System.out.println("**************Set- LinkedHashSet****************");
		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
		empNamesLinkedHashSet.add("John");
		empNamesLinkedHashSet.add("Jane");
		empNamesLinkedHashSet.add("Doe");
		empNamesLinkedHashSet.add("Alice");
		empNamesLinkedHashSet.add("John");
		empNamesLinkedHashSet.add("Charlie");
		empNamesLinkedHashSet.remove("Alice");
		empNamesLinkedHashSet.add(null);
		System.out.println(empNamesLinkedHashSet.size());
//		System.out.println(empNamesLinkedHashSet.get(1));
		System.out.println(empNamesLinkedHashSet);
		
		/******************************Set- TreeSet********************************/
		//Syntax to initialize an TreeSet: Set<DataType> SetName = new TreeSet<DataType>();
		
		// Syntax to store values in an TreeSet: SetName.add(value);
		// Syntax to retrieve values from an TreeSet: SetName.get(index); -- Not applicable for TreeSet
		// Syntax to remove values from an TreeSet: SetName.remove(index);
		// Syntax to get the size of an TreeSet: SetName.size();
		
		// TreeSet follows - Ascending order and does not allow duplicate values.
		// TreeSet won't allow null values.
		
		System.out.println("**************Set- TreeSet****************");
		Set<String> empNamesTreeSet = new TreeSet<String>();
		empNamesTreeSet.add("John");
		empNamesTreeSet.add("Jane");
		empNamesTreeSet.add("Doe");
		empNamesTreeSet.add("Alice");
		empNamesTreeSet.add("John");
		empNamesTreeSet.add("Charlie");
		empNamesTreeSet.remove("Alice");
//		empNamesTreeSet.add(null);
		System.out.println(empNamesTreeSet.size());
//		System.out.println(empNamesTreeSet.get(1));
		System.out.println(empNamesTreeSet);
		
		
		/******************************Map- HashMap********************************/
		//Syntax to initialize an HashMap (Key, Value): Map<DataType,DataType> MapName = new HashMap<DataType,DataType>();
		
		// Syntax to store values in an HashMap: MapName.put(key, value);
		// Syntax to retrieve values from an HashMap: MapName.get(key); 
		// Syntax to remove values from an HashMap: MapName.remove(key);
		// Syntax to get the size of an HashMap: MapName.size();
		
		// HashMap follows - Random order of keys and does not allow duplicate keys.
		// HashMap allow null values as well as null keys.
		
		System.out.println("**************Map- HashMap****************");
		Map<String,Integer> empNamesHashMap = new HashMap<String,Integer>();
		empNamesHashMap.put("John",1234);
		empNamesHashMap.put("Jane",1235);
		empNamesHashMap.put("Doe",1235);
		empNamesHashMap.put("Alice",1237);
		empNamesHashMap.put("John",1238);
		empNamesHashMap.remove("Alice");
		empNamesHashMap.put("Charlie",null);
		empNamesHashMap.put(null, 1239);
		System.out.println(empNamesHashMap.size());
		System.out.println(empNamesHashMap.get("John"));
		System.out.println(empNamesHashMap);
		
		/******************************Map- LinkedHashMap********************************/
		//Syntax to initialize an LinkedHashMap (Key, Value): Map<DataType,DataType> MapName = new LinkedHashMap<DataType,DataType>();
		
		// Syntax to store values in an LinkedHashMap: MapName.put(key, value);
		// Syntax to retrieve values from an LinkedHashMap: MapName.get(key); 
		// Syntax to remove values from an LinkedHashMap: MapName.remove(key);
		// Syntax to get the size of an LinkedHashMap: MapName.size();
		
		// LinkedHashMap follows - Insertion order of Keys and does not allow duplicate keys.
		// LinkedHashMap allow null values as well as null keys.
		
		System.out.println("**************Map- LinkedHashMap****************");
		Map<String,Integer> empNamesLinkedHashMap = new LinkedHashMap<String,Integer>();
		empNamesLinkedHashMap.put("John",1234);
		empNamesLinkedHashMap.put("Jane",1235);
		empNamesLinkedHashMap.put("Doe",1235);
		empNamesLinkedHashMap.put("Alice",1237);
		empNamesLinkedHashMap.put("John",1238);
		empNamesLinkedHashMap.remove("Alice");
		empNamesLinkedHashMap.put("Charlie",null);
		empNamesLinkedHashMap.put(null, 1239);
		System.out.println(empNamesLinkedHashMap.size());
		System.out.println(empNamesLinkedHashMap.get("John"));
		System.out.println(empNamesLinkedHashMap);
		
		/******************************Map- TreeMap********************************/
		//Syntax to initialize an TreeMap (Key, Value): Map<DataType,DataType> MapName = new TreeMap<DataType,DataType>();
		
		// Syntax to store values in an TreeMap: MapName.put(key, value);
		// Syntax to retrieve values from an TreeMap: MapName.get(key); 
		// Syntax to remove values from an TreeMap: MapName.remove(key);
		// Syntax to get the size of an TreeMap: MapName.size();
		
		// TreeMap follows - Ascending order of Keys and does not allow duplicate keys.
		// TreeMap allow null values , But it won't allow null keys.
		
		System.out.println("**************Map- TreeMap****************");
		Map<String,Integer> empNamesTreeMap = new TreeMap<String,Integer>();
		empNamesTreeMap.put("John",1234);
		empNamesTreeMap.put("Jane",1235);
		empNamesTreeMap.put("Doe",1235);
		empNamesTreeMap.put("Alice",1237);
		empNamesTreeMap.put("John",1238);
		empNamesTreeMap.remove("Alice");
		empNamesTreeMap.put("Charlie",null);
//		empNamesTreeMap.put(null, 1239);
		System.out.println(empNamesTreeMap.size());
		System.out.println(empNamesTreeMap.get("John"));
		System.out.println(empNamesTreeMap);
		
		/******************************Map- Hashtable********************************/
		//Syntax to initialize an Hashtable (Key, Value): Map<DataType,DataType> MapName = new Hashtable<DataType,DataType>();
		
		// Syntax to store values in an Hashtable: MapName.put(key, value);
		// Syntax to retrieve values from an Hashtable: MapName.get(key); 
		// Syntax to remove values from an Hashtable: MapName.remove(key);
		// Syntax to get the size of an Hashtable: MapName.size();
		
		// Hashtable follows - Random order of Keys and does not allow duplicate keys.
		// Hashtable  does not allow null values as well as null keys.
		
		System.out.println("**************Map- Hashtable****************");
		Map<String,Integer> empNamesHashtable = new Hashtable<String,Integer>();
		empNamesHashtable.put("John",1234);
		empNamesHashtable.put("Jane",1235);
		empNamesHashtable.put("Doe",1235);
		empNamesHashtable.put("Alice",1237);
		empNamesHashtable.put("John",1238);
		empNamesHashtable.remove("Alice");
//		empNamesHashtable.put("Charlie",null);
//		empNamesHashtable.put(null, 1239);
		System.out.println(empNamesHashtable.size());
		System.out.println(empNamesHashtable.get("John"));
		System.out.println(empNamesHashtable);
	}

}
