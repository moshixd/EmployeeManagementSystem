public class MenuList {

    public static void welcome() {
        System.out.println("\n\n\t\t####################################################\t\t");
        System.out.println("\t\t##########  ---  ===  FIXON AB  ===  ---  ##########\t\t");
        System.out.println("\t\t####################################################\t\t");
        System.out.println("\t\t==  Welcome to EmployeeManagementSystem (0.1001)  ==\n");
    }

    public static void menuMain() {   //Main-menyn som presenterar alternativ
        System.out.println("\n\t\t#########################");
        System.out.println("\t\t####==  MAIN MENU  ==####");
        System.out.println("\t\t#########################");
        System.out.println("\t\t[1] - Employee Management");
        System.out.println("\t\t[2] - Employee Statistics");
        System.out.println("\t\t[0] - Exit");
        System.out.println("\nChoose: ");
        int choice = TestRun.intInputMethod();     //Denna metod kallas på i Mainmetoden för att bruka Scanner.

        switch (choice) {
            case 1:
                menuManage();
                break;
            case 2:
                menuStats();
                break;
            case 0:
                exit();
                break;
            default:
                System.out.println("Please enter [1] or [2]");
        }
    }

    public static void menuManage() {   //Manage-menyn
        System.out.println("\n\t\t###############################");
        System.out.println("\t\t##==  EMPLOYEE MANAGEMENT  ==##");
        System.out.println("\t\t###############################");
        System.out.println("\t\t[1] - Register new employee");
        System.out.println("\t\t[2] - Fire employee");
        System.out.println("\t\t[3] - Update name of employee");
        System.out.println("\t\t[4] - Update age of employee");
        System.out.println("\t\t[5] - Update department of employee");
        System.out.println("\t\t[6] - Update salary of employee");
        System.out.println("\t\t[7] - Search employee by name");
        System.out.println("\t\t[8] - Search employee by id");
        System.out.println("\t\t[9] - Search employee by department");
        System.out.println("\t\t[10] - Display all employees");
        System.out.println("\t\t[0] - Exit");
        System.out.println("\nChoose: ");
        int choice2 = TestRun.intInputMethod();
        switch (choice2) {
            case 1:
                employeeDepartment();
                break;
            case 2:
                fireEmployee();
                break;
            case 3:
                updateNameEmp();
            case 4:
                updateAgeEmp();
            case 5:
                updateDepartmentEmp();
            case 6:
                updateSalaryEmp();
            case 7:
                searchEmpName();
            case 8:
                searchEmpID();
            case 9:
                searchEmpDep();
            case 10:
                displayAllEmps();
            case 0:
                exit();
                break;
            default:
                System.out.println("Please enter [1] or [2]");
        }
    }

    public static int menuStats() {   //Statistik-menyn
        System.out.println("\n\t\t###############################");
        System.out.println("\t\t##==  EMPLOYEE STATISTICS  ==##");
        System.out.println("\t\t###############################");
        System.out.println("\t\t[1] - Average wage at the company");
        System.out.println("\t\t[2] - Highest salary at the company");
        System.out.println("\t\t[3] - Lowest salary at the company");
        System.out.println("\t\t[4] - Total bonus");
        System.out.println("\t\t[5] - Gender percentage in the company");
        System.out.println("\t\t[6] - Employee percentage of all departments");
        System.out.println("\t\t[0] - Exit");
        System.out.println("\nChoose: ");
        int choice3 = TestRun.intInputMethod();
        return choice3;
    }

    //Frågar användaren vilken avdelning
    public static void employeeDepartment() {
        System.out.println("Select department:\n[1] - Management\n[2] - Development");
        int department = TestRun.intInputMethod();
        switch (department) {
            case 1://Management
                employeeManagement();
                //newEmployee();
                break;
            case 2://Developments
                employeeDevelopment();
                //newEmployee();
                break;
            default:
                System.out.println("Please enter [1] or [2]");
        }
    }

    //Frågar användaren vilken management-roll
    public static void employeeManagement() {
        System.out.println("Select title:\n[1] - Manager\n[2] - Secretaries");
        int role = TestRun.intInputMethod();
        switch (role) {
            case 1://Manager
                //newEmployee();
                break;
            case 2://Secretaries
                //newEmployee();
                break;
            default:
                System.out.println("Please enter [1] or [2]");
        }
    }

    //Frågar användaren vilken utvecklings-roll
    public static void employeeDevelopment() {
        System.out.println("Select title:\n[1] - Programmer\n[2] - Technician");
        int role = TestRun.intInputMethod();
        switch (role) {
            case 1://Programmer     
                System.out.println("Creating: Programmer ");
                newEmployee();
                break;
            case 2://Technician
                System.out.println("Creating: Technician ");
                newEmployee();
                break;
            default:
                System.out.println("Please enter [1] or [2]");
        }
    }

    public static void newEmployee() {
        System.out.println("First name of new employee?");
        String firstName = TestRun.lineInputMethod();
        System.out.println("Last name of employee?");
        String lastName = TestRun.lineInputMethod();
        System.out.println("What gender is the new employee of?");
        String gender = TestRun.lineInputMethod();
        int dateOfBirth;
        do {
            System.out.println("Date of birth of the new employee? (YY/MM/DD)");
            dateOfBirth = TestRun.intInputMethod();
        } while (Integer.toString(dateOfBirth).length() != 6);
        System.out.println("Salary of new employee?");
        int salary = TestRun.intInputMethod();

        System.out.println("Success! New employee has been added to your database.");
    }
    
    public static void fireEmployee(){
        System.out.println("Please input the employee ID of the employee to fire");
        
        
    }
    
    public static void updateNameEmp(){
        
    }
    
    public static void updateAgeEmp(){
        
    }
    
    public static void updateDepartmentEmp() {
        
    }
    
    public static void updateSalaryEmp() {
        
    }
    
    public static void searchEmpName() {
        
    }
    
    public static void searchEmpID(){
        
    }
    
    public static void searchEmpDep(){
        
    }
    
    public static void displayAllEmps(){
        System.out.println("All employees: ");
        
        for (Employees element: pro) {
            System.out.println(element);
        }
        
    }

    public static void exit() {
        System.out.println("Thank you for using EMS!");
    }

}
