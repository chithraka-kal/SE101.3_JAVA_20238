public class Employee {
    private String name;
    private int age;
    private double salary;
    private double bonus;

    Employee(String name, int age, double salary, double bonus){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.bonus = bonus;
    }

    public double bonusAmount(){
        return bonus + salary;
    }


    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    public double getBonus(){
        return bonus;
    }



//    public void setName(String name){
//        this.name = name;
//    }
//    public void setAge(int age){
//        this.age = age;
//    }
//    public void setSalary(double salary){
//        this.salary = salary;
//    }
}
