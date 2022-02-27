import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void  should_return_zero_for_string() {
        Assertions.assertThat(Calculator.add("")).isEqualTo(0);
    }

    @Test
    void should_return_number_for_single_number() {
        Assertions.assertThat(Calculator.add("10")).isEqualTo(10);
    }

    @Test
    void should_return_sum_for_two_numbers() {
        Assertions.assertThat(Calculator.add("1,2")).isEqualTo(3);
    }

}
