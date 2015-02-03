import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

/**
 * Created by kevin on 15-2-3.
 */
public class CompareNumberTest {

    @Test
    public void should_return_0A0B_when_input_is_1234_and_answer_5678() {
        //given
        String input = "1234";
        String answer = "5678";

        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare(input,answer);

        assertThat(result).isEqualTo("0A0B");
    }

    @Test
    public void should_return_4A0B_when_input_is_1234_and_answer_1234(){
        //given
        String input = "1234";
        String answer = "1234";

        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare(input,answer);

        assertThat(result).isEqualTo("4A0B");
    }

    @Test
    public void should_return_0A4B_when_input_is_1234_and_answer_4321(){
        //given
        String input = "1234";
        String answer = "4321";

        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare(input,answer);

        assertThat(result).isEqualTo("0A4B");
    }

    @Test
    public void should_return_2A2B_when_input_is_1234_and_answer_1243(){
        //given
        String input = "1234";
        String answer = "1243";

        CompareNumber compareNumber = new CompareNumber();
        String result = compareNumber.compare(input,answer);

        assertThat(result).isEqualTo("2A2B");
    }

}
