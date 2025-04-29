public class Employee {
    

    String name;
    int id;
    double salary;
    String Location;
    Employee(String name, int id, double salary, String Location) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.Location = Location;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("Location: " + Location);
    }
    public static void main(String[] args) {
        Employee emp = new Employee("Shraddha", 101, 50000.0,"bangalore");
        emp.displayInfo();
    }
}

