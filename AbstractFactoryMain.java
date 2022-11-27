package Abstract;

public class AbstractFactoryMain {

    public static  void main(String[] args) {

        FactoryProducer deptFactory = new FactoryProducer();

        AbstractFactory cse = deptFactory.getFactory("cse");

        Course cseDept1 = cse.getDepartment("machinelearning");
        Course cseDept2 = cse.getDepartment("operatingsystem");

        cseDept1.showCourseName();;
        cseDept2.showCourseName();

        AbstractFactory mechanical = deptFactory.getFactory("mechanical");

        Course mechanicalDept1 = mechanical.getDepartment("thermodynamics");
        Course mechanicalDept2 = mechanical.getDepartment("solidmechanics");

        mechanicalDept1.showCourseName();
        mechanicalDept2.showCourseName();

        AbstractFactory civil = deptFactory.getFactory("civil");

        Course civilDept1 = civil.getDepartment("constructionengineering");
        Course civilDept2 = civil.getDepartment("structuralengineering");

        civilDept1.showCourseName();
        civilDept2.showCourseName();





    }
}
