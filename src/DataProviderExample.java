import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
    @Test(dataProvider = "LoginDataProvider")
    public void loginTest(String email,String pswd)
    {
        System.out.println(email+"    "+pswd);
    }


    @DataProvider(name="LoginDataProvider")
    public Object[][] getdata()
    {
        Object[][] data={{"abc@gmail.com","abc"},{"xyz@gmail.com","xyz"},{"mno@gmail.com","mno"}};
        return data;
    }

}
