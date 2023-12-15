//Number of Male and Female employess in an organization
Map<String, Long> noOfMaleAndFemaleEmployees=
employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

//Name of all departments in the organization
employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());

//Number of employees in each department in the organization
Map<String, Long> noOfEmployeesInDepaartment= employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

//Average age of male and female employees.
Map<String, Double> avgAgeOfMaleAndFemaleEmployees=
employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));

//Details of highest paid employee
Employee highestPaidEmployee = employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(1);
Employee highestPaidEmployee = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));

// Name of employees who joined after 2015
employeeList.stream().filter(employee -> employee.yearOfJoining()>2015).map(Employee::getName).collect(Collectors.toList());

// Average salary of each department
Map<String, Double> avgSlaryOfDepartment = employeeList.stream().collect(Collectors.grouping(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));

// Most experience in an organization
Employee highestExperienceEmployee = employeeList.stream().sorted(Comparator.comparing(Employee::getJoiningYear)).findFirst();

//Average and Total salary of whole organization
DoubleSummaryStatistics employeeSalaryStatistics=
employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
//This will return statistics of the employee salary like max, min, average and total.
System.out.println("Average Salary = "+employeeSalaryStatistics.getAverage());      
System.out.println("Total Salary = "+employeeSalaryStatistics.getSum());

//Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
Map<Boolean, List<Employee>> partitionEmployeesByAge=
employeeList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));

//Who is the oldest employee in the organization? What is his age and which department he belongs to?
employeeList.stream().sorted(Comparator.comparing(Employee::getAge)).reversed().limit(1);
employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
employeeList.stream().max(Comparator.comparing(Employee::getAge);








