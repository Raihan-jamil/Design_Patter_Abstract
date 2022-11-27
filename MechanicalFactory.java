package Abstract;

public class MechanicalFactory extends  AbstractFactory{

    @Override
    public Course getDepartment(String courseName) {
        if("solidmechanics".equals(courseName)) {
            return new SolidMechanics();
        } else if("thermodynamics".equals(courseName)) {
            return new ThermoDynamics();
        }

        return null;
    };
}
