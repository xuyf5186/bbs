import org.junit.Assert;
import org.junit.Test;

/**
 * Des
 * Created with IntelliJ IDEA
 * Created by xuyf
 * Date 2017/12/21
 * Time 21:26
 */
public class test {
    @Test
    public void main() {
        String a="abc";
        String b="abc";
        Assert.assertEquals(a.hashCode(),b.hashCode());
    }
}
