public class Employees implements Specifics {
    private String firstName;
    private String lastName;
    private String gender;
    private String department;
    private String role;
    private int dateOfBirth;  //Detta önskas skapa med en int array om möjligt till 3 int[][][]-värden (Y/M/D)
    private int employeeID;
    private int salary;

    public void licence(){
        System.out.println("Possesses a driving licence");
    }

    public void laptop(){
        System.out.println("Possesses a laptop");
    }

    public void coFounder(){
        System.out.println("Is a co-founder");
    }

    //Constructor som skapar objektet Employees
    public Employees(String firstName, String lastName, String gender, String department, String role, int dateOfBirth, int employeeID, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.department = department;
        this.role = role;
        this.dateOfBirth = dateOfBirth;
        this.employeeID = employeeID;
        this.salary = salary;
    }

    //Behövs en fori-metod för att generera nya EmployeeID

    //Här startar getter & setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String department) {
        this.role = role;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

