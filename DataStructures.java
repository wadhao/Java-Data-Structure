import java.util.Stack;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class DataStructures {
	Stack stack;
	LinkedList list;
	ArrayList sortableList;
	Scanner input;
	
    public DataStructures(){
    	stack=new Stack();
    	list=new LinkedList();
    	sortableList=new ArrayList();
    	input=new Scanner(System.in);
    	
    	getData();
    }
    
    public void getData(){
    	int size=5;
    	String name;
    	while (list.size()<size){
    		System.out.print("Enter a name: ");
    		name=input.nextLine();
    		list.add(name);
    	}
    	sortData();
    }
    
    public void sortData(){
    	
    	Collections.sort(list);
    	System.out.println("'list' sorted as "+list);
    	System.out.println("Now populating ArrayList with LinkedList's data...");
    	
    	for (int x=0; x<list.size(); x++){
    		sortableList.add(list.get(x));
    	}
    	
    	Collections.sort(sortableList);
    	
    }
    
    public void showData(){
    	System.out.println("Printing the collection from List...");
    	for (Object name:list){
    		System.out.println(name);
    	}
    }
    public static void main (String[]args){
    	DataStructures obj=new DataStructures();
    	obj.showData();
    }
}
