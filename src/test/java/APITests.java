import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITests   {

    @Test
    public void test1(){

        Response response = get("https://reqres.in/api/users?page=2");

        System.out.println("status code: "+response.getStatusCode());
        System.out.println("Response: "+ response.getStatusCode());
        System.out.println("Body: "+response.getBody().asString());
        System.out.println("Time taken:"+ response.getTime());
        System.out.println("Header:"+ response.getHeader("content-type"));


        int statusCode = response.getStatusCode();
        Assert.assertEquals(statusCode,200);


    }
    @Test
    public void test_GET(){
        given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
    }
}
