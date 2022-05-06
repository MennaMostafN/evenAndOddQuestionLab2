import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
class evenandoddTest {
    evenandodd x;
    @BeforeEach
    public void init(){
        x=new evenandodd();
    }
    @Test
    public void findeven(){
        assertTrue(x.even(2));
    }
    @Test
    public void findodd(){
        assertTrue(x.odd(3));
    }
    @AfterEach
    public void cleanuo(){
        x=null;
    }
}
class evenandoddtest2{
    evenandodd y;
    @BeforeEach
    public void init(){
        y = new evenandodd();
    }
    @Nested
    class eventest{
        @Test
        @DisplayName("finding if number is even or not")
        public void findeven() {
            assertTrue(y.even(2));
        }
    }
    @Nested
    class oddtest{
        @Test
        @DisplayName("finding if number is odd or not")
        public void findodd() {
            assertTrue(y.odd(3));
        }
    }
    @AfterEach
    public void cleanup(){
        y=null;
    }

}