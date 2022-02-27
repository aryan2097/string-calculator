import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void  should_return_zero_for_string() {
        Assertions.assertThat(Calculator.add("")).isEqualTo(0);
    }
}
