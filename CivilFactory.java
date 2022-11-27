package Abstract;

public class CivilFactory extends AbstractFactory {

    @Override
    public Course getDepartment(String courseName) {
        if("structuralengineering".equals(courseName)) {
            return new StructuralEngineering();
        } else if("constructionengineering".equals(courseName)) {
            return new ConstructionEngineering();
        }

        return null;
    };
}
