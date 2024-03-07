import org.testng.annotations.DataProvider;

public class data {
    @DataProvider(name ="data", parallel = true)
    Object[][] hello(){
        String [][] data1 ={{"2+3","5"},{"3+1","4"}};
        return data1;
    }
}
