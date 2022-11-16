import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CustomerTest {

    private Customer customer;

    @BeforeEach

    public void setUp() {customer = new Customer("Mike", 10000)}


}
