package company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

	private static final String searchedID = null;

	public static void main(String[] args) {
		
		
		List<Employee> elist=new ArrayList<Employee>();
    	
    	       elist.add(new Employee(103, "kanchan B", "HR", 25, "female", 70000, 2017));
    	       elist.add(new Employee(104, "bhavik I", "HR", 28, "male", 75000, 2015));
               elist.add(new Employee(101, "akshay T", "Information Technology", 26, "male", 60000, 2019));
    	       elist.add(new Employee(108, "sneha B", "Information Technology", 26, "female", 50000, 2020));
    	       elist.add(new Employee(102, "nikhil I", "Information Technology", 35, "male", 44000, 2016));
    	       elist.add(new Employee(105, "priti I", "sale & marketing ", 32, "female", 30000, 2018));
    	       elist.add(new Employee(107, "advey H", "sale & marketing", 22, "male", 11500, 2019));
    	       elist.add(new Employee(106,"Anuj D ","Product Development",21, "male",25500,2012));
    	       elist.add(new Employee(110,"jiya C ","account & finance",24, "female",25000,2011));
    	       elist.add(new Employee(109,"nima K","infrastructure",31, "female",17000,2014));
    	       elist.add(new Employee(113,"nitin T","Product Development",31, "male",18500,2016));
    	       elist.add(new Employee(115,"joshna P ","account & finance",39, "female",22000,2015));
    	       elist.add(new Employee(118,"saurabh S ","Product Development",30, "male",32000,2012));
    	       elist.add(new Employee(117,"rani L","Product Development",20, "female",28000,2011));
    	       elist.add(new Employee(114,"anu W","account & finance",22, "female",10500,2010));
    	       elist.add(new Employee(125,"rajani w","infrastructure",36, "female",45000,2018));
    	       elist.add(new Employee(122,"rahi d","infrastructure",21, "male",50000,2011));
    	       elist.add(new Employee(120, "advey H", "sale & marketing", 26, "male", 11500, 2019));
    	       elist.add(new Employee(135,"pankaj P ","infrastructure",35, "male",55700,2021));
    	       elist.add(new Employee(132,"dhiraj H ","account & finance",39, "male",22000,2015));
    	       elist.add(new Employee(115,"jas K ","account & finance",20, "female",70000,2020));
    	       elist.add(new Employee(130,"Nidhi B ","Information Technology",25 , "female",60000,2022));
    	       elist.add(new Employee(139, "prachi H", "sale & marketing", 22, "female", 25500, 2019));

    	//Employee employee=(Employee) Arrays.asList(elist);
    	        System.out.println("\n***Display All Employee***\n");

  for (Object object : elist) {
		
     Employee e=(Employee) object;
     System.out.println(e + "\n");
  }
    
    	  System.out.println("\n***1) Print All Departments Name***\n");
    	
          elist.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
    	
    	     System.out.println("\n***2) Male & Female Employee***\n");
    	
    	     Map<String, Long> noOfMaleAndFemaleEmployee = elist.stream().collect(Collectors.groupingBy
    	     (Employee::getGender, Collectors.counting()));
    	
    	     System.out.println(noOfMaleAndFemaleEmployee);
    	
   
    	    System.out.println("\n***3) Get Highest Paid Employee***\n");

    	    Optional<Employee> highestPaid= elist.stream().collect(Collectors.maxBy
    		(Comparator.comparingDouble(Employee::getSalary)));
   
    	     Employee highestPaidEmp = highestPaid.get();
    	     System.out.println("\nDetails of Hightest Paid Employee");
    	     System.out.println("========================================");
    	
    	     System.out.println("ID : "+highestPaidEmp.getId());
    	     System.out.println("Name : "+highestPaidEmp.getName());
    	     System.out.println("Age : "+highestPaidEmp.getAge());
    	     System.out.println("Gender : "+highestPaidEmp.getGender());
    	     System.out.println("Department : "+highestPaidEmp.getDepartment());
    	     System.out.println("Year of Joining : "+highestPaidEmp.getYearOfJoining());
    	     System.out.println("Salary : "+highestPaidEmp.getSalary());
    	
    	   
    	     System.out.println("\n***4) Employee who have joined 2014 ***\n");
    	
    	     elist.stream().filter(e->e.getYearOfJoining() > 2014).map(Employee::getName).forEach(System.out::println);
    	
 	   
        	System.out.println("\n***5)Count Employee in each department ***\n");
    	
    	    Map<String, Long> empCountDept = elist.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
    	
    	    Set<java.util.Map.Entry<String, Long>> entrySet=empCountDept.entrySet();
    	
    	  for (java.util.Map.Entry<String, Long> entry : entrySet) {
			    System.out.println(((java.util.Map.Entry<String, Long>) entry).getKey()+" : "+entry.getValue());
		    }
    	
  	   
    	   System.out.println("\n***6)Most Working Experiance ***\n");
    	
    	     Optional<Employee> seniorWorkingEmp = elist.stream().sorted(Comparator.comparingInt
    	    		 (Employee::getYearOfJoining)).findFirst();
    	
    	      Employee sEmployee=seniorWorkingEmp.get();
    	
    	      System.out.println("\n Senior Most Working \n");
    	      System.out.println("=============================");
    	      System.out.println("ID : "+sEmployee.getId());
    	      System.out.println("Name : "+sEmployee.getName());
    	      System.out.println("Age : "+sEmployee.getAge());
    	      System.out.println("Gender : "+sEmployee.getGender());
    	      System.out.println("Year of Joining : "+sEmployee.getYearOfJoining());
    	      System.out.println("Salary : "+sEmployee.getSalary());

   	   
    	   System.out.println("\n***7)Male & Female Employee Product Development***\n");
    	
    	   Map<String, Long> maleFemaleEmployee = elist.stream().filter(e -> e.getDepartment()=="Product Development")
    			.collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
    	
           System.out.println(maleFemaleEmployee);
    	
    	
    	   
         	System.out.println("\n***8)Names of all Employees in each Department***\n");
    	
    	     Map<String, List<Employee>> nameOfEmpEachDept = elist.stream().collect(Collectors.groupingBy(Employee::getDepartment));
    	     Set<java.util.Map.Entry<String, List<Employee>>> entrySet1=nameOfEmpEachDept.entrySet();
    	     for (java.util.Map.Entry<String, List<Employee>> entry : entrySet1) {
				  System.out.println("__________________________________\n");
				  System.out.println("Employees in " +entry.getKey() + " : ");
				  System.out.println("\n");
                  List<Employee> list=entry.getValue();
                  for(Employee employee : list) {
                	  System.out.println(employee.getName());
                  }
				  
			}
    	
      	   
          	System.out.println("\n***9)Older than 25 years & younger or equal to 25 years***\n");  
          	
          	Map<Boolean, List<Employee>> employeePartitionByAge = elist.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
          	Set<Entry<Boolean, List<Employee>>> entrySet11= employeePartitionByAge.entrySet();
          	
          	for (Entry<Boolean, List<Employee>> entry : entrySet11) {
				
          		System.out.println("---------------------------------");
          		 if (entry.getKey()) {
          			 
					System.out.println("Employees older than 25 years :");
				}
          		 else {
					System.out.println("Employees younger than or equal to 25 years :");
				}
          		
          		System.out.println("----------------------------------");
          		
          		List<Employee> list=entry.getValue();
          		
          		for (Employee e : list) {
					System.out.println(e.getName());
				}
          		
          		
          		
			}
          	
       System.out.println("\n***10) Search any employee in department***\n");  
  
       Map<String, Long> searchEmp= (Map<String, Long>) elist.stream().filter((e)->e.getName().equals(sEmployee)).collect(Collectors.toList());
       
    	Set<Entry<String, Long>> search=searchEmp.entrySet();
    	 
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter the employee Name : ");
    	
    	int  sEmployee1=scanner.nextInt();
    	System.out.println(sEmployee1);
    	
    	
          	
          	
          	
          	
          	
          	
          	
          	
          	
          	
          	
          	
    	
    	
    	
    	
    	
    	
	}

}
