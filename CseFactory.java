package Abstract;

public class CseFactory extends  AbstractFactory {

    @Override
    public Course getDepartment(String courseName) {
        if("machinelearning".equals(courseName)) {
            return new MachineLearning();
        } else if("operatingsystem".equals(courseName)) {
            return new OperatingSystem();
        }

        return null;
    };
}
