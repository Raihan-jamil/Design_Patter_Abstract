package Abstract;

public class OperatingSystem implements Course {

    @Override
    public void showCourseName() {
        System.out.println("Course Name: Operating System, Department Name: Computer Science and Engineering.");
    }
}
