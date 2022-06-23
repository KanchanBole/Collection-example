package company;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

public class DeptEmp {

	public static void main(String[] args) {

		ArrayList hrDept=new ArrayList();
		    hrDept.add("Elias");
		    hrDept.add("Leo");
		    hrDept.add("Cale");
		    
		ArrayList itDept=new ArrayList();
		    itDept.add("Aayan");
		    itDept.add("Etash");
		    itDept.add("Hardik");
		    itDept.add("Akshay");
		    itDept.add("Advey");


		ArrayList financeDept=new ArrayList();
            financeDept.add("pavitra");
            financeDept.add("Sneha");
            financeDept.add("Kanchan");
            financeDept.add("Priti");
            financeDept.add("Shruti");

		ArrayList planningDept=new ArrayList();
		    planningDept.add("Bhavik");
		    planningDept.add("Nikhil");
		    planningDept.add("Aayush");
		    planningDept.add("Meet");
		    planningDept.add("Sanu");


		ArrayList techDept=new ArrayList();
	        techDept.add("Rahul");
		    techDept.add("Pankaj");
		    techDept.add("Dhiraj");
		    techDept.add("Madhuri");
		    techDept.add("Vaishali");
    
		TreeMap dotcom=new TreeMap();
		    dotcom.put("Hr Dept", hrDept);
		    dotcom.put("It Dept", itDept);
		    dotcom.put("Finance Dept", financeDept);
		    dotcom.put("Planning Dept", planningDept);
		    dotcom.put("Tech Dept", techDept);

		Set departmentKeys=dotcom.keySet();
		
		for (Object department : departmentKeys) {
			String departmentName=(String) department;
			System.out.println(departmentName);
			
	   ArrayList employees=(ArrayList) dotcom.get(departmentName);
	      
	   for (Object names : employees) {
		String employeeName=(String) names;
		System.out.println("\t" + employeeName);
	}
			
			
			
			
		}
		
		
		
		
	}

}
