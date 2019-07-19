import org.testng.annotations.DataProvider;

public class CustomeDataProvider {

    @DataProvider(name="LoginDataProvider")
    public Object[][] getdata()
    {
        Object[][] data={{"abc@gmail.com","abc"},{"xyz@gmail.com","xyz"},{"mno@gmail.com","mno"}};
        return data;
    }


}
