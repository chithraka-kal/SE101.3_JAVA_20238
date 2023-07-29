public class TestEnployee {
    public static void main(String[] args){
        Employee employee = new Employee("kalana", 22, 22000.00, 1000);

//        employee.setName("kalana");
//        employee.setAge(22);
//        employee.setSalary(22000.00);

        System.out.println("Name: "+employee.getName());
        System.out.println("Age: "+employee.getAge());
        System.out.println("Salary: "+employee.getSalary());
        System.out.println("Bonus: "+employee.getBonus());
        System.out.println("Bonus Amount: "+employee.bonusAmount());
    }
}
