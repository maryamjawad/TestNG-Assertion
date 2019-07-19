import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
    @Test(dataProvider = "LoginDataProvider",dataProviderClass=CustomeDataProvider.class)
    public void loginTest(String email,String pswd)
    {
        System.out.println(email+"    "+pswd);
    }


}
