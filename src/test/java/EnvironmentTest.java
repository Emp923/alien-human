import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EnvironmentTest {

    private Environment testEnvironment;

    @Before
    public void setup() {
        testEnvironment = new Environment();
    }

    @Test
    public void testNewEnvironmentHasZeroEntities() {
        Assert.assertEquals(0, testEnvironment.getEntityCount());
    }

    @Test
    public void testAddOneHumanIncreasesEntityCountToOne() {
        testEnvironment.addEntity(new Human("", 0));
        Assert.assertEquals(1, testEnvironment.getEntityCount());
    }

    @Test
    public void testAddOneAlienIncreasesEntityCountToOne() {
        testEnvironment.addEntity(new Alien("", 0));
        Assert.assertEquals(1, testEnvironment.getEntityCount());
    }

}
