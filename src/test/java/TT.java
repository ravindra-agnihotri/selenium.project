import org.testng.Assert;
import org.testng.annotations.Test;

public class TT {

    @Test
    public static void test1(){
        Assert.assertEquals(1,2);
    }

    @Test
    public static void test2(){
        Assert.assertEquals(2,2);
    }
}
