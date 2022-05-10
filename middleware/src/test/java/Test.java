import com.mck.bean.Student;
import com.mck.daoIMP.StudentDAOIMP;

public class Test {
    @org.junit.Test
    public void test(){
        StudentDAOIMP studentDAOIMP = new StudentDAOIMP();
        studentDAOIMP.insert(new Student(2,"ss"));
//        System.out.println(studentDAOIMP.findByID(1).toString());
//        StudentDAOIMP daoimp = new StudentDAOIMP();
//        daoimp.delete(2);

    }
}
