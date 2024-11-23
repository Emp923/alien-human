import org.junit.Before;

public class EntityTest {

    private Entity testAlien;
    private Entity testHuman;

    @Before
    public void setup() {
        testAlien = new Alien();
        testHuman = new Human();
    }

}
