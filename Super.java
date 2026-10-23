public class Super {
    public static void main(String[] args){

        Person person = new Person("Tom", "Riddle");
        Student2 student = new Student2("Harry", "Potter", 3.25);
        Employee employee = new Employee("Rubeus", "Hagrid", 50000);

        person.showName();
        student.showName();
        student.showGPA();
        employee.showSalary();
    }
    
}
