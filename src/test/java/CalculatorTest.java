import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void  should_return_zero_for_string() throws Exception {
        Assertions.assertThat(Calculator.add("")).isEqualTo(0);
    }

    @Test
    void should_return_number_for_single_number() throws Exception {
        Assertions.assertThat(Calculator.add("10")).isEqualTo(10);
    }

    @Test
    void should_return_sum_for_two_numbers() throws Exception {
        Assertions.assertThat(Calculator.add("1,2")).isEqualTo(3);
    }

    @Test
    void should_return_sum_of_unknown_amount_of_numbers() throws Exception {
        Assertions.assertThat(Calculator.add("3,5,7")).isEqualTo(15);
    }

    @Test
    void should_return_sum_of_unknown_numbers_split_by_comma_and_new_line_delimiter() throws Exception {
        Assertions.assertThat(Calculator.add("2,3\n5")).isEqualTo(10);
    }

    @Test
    void should_return_sum_of_unknown_numbers_split_by_undefined_delimiter() throws Exception {
        Assertions.assertThat(Calculator.add("//;\n1;2;3")).isEqualTo(6);
    }

    @Test
    void should_throw_exception_for_negatives() throws Exception{
        Assertions.assertThatThrownBy(() -> Calculator.add("1,-2,3,-4")).hasMessageContaining("Negatives not allowed").hasMessageContaining("-2 -4");
    }

}
