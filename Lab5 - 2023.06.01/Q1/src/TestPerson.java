public class TestPerson {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe");
        student.setID(101);
        student.setCourse("Computer Science");

        // Create a Lecturer object
        Lecturer lecturer = new Lecturer();
        lecturer.setName("Jane Smith");
        lecturer.setID(201);
        lecturer.setProg("Software Engineering");

        // Print Student details
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("ID: " + student.getID());
        System.out.println("Course: " + student.getCourse());
        System.out.println();

        // Print Lecturer details
        System.out.println("Lecturer Details:");
        System.out.println("Name: " + lecturer.getName());
        System.out.println("ID: " + lecturer.getID());
        System.out.println("Programme: " + lecturer.getProg());
    }
}
