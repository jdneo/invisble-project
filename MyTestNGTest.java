import org.testng.annotations.*;
 
public class MyTestNGTest {
 
  @Test(groups = { "fast" })
  public void aFastTest() {
    System.out.println("Fast test");
  }

}
