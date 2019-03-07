import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class Euler6Test {


        @Test
        public void shouldGive0forValue0() {
            //given
            int numbers = 0;

            //when
            Euler6 euler6 = new Euler6();
            int result = euler6.difference(numbers);

            //then
            assertThat(result, equalTo(0));

        }

        @Test
        public void shouldGive170forValue5() {
            //given
            int numbers = 5;

            //when
            Euler6 euler6 = new Euler6();
            int result = euler6.difference(numbers);

            //then
            assertThat(result, equalTo(170));

        }

        @Test
        public void shouldGive2640forValue10() {
            //given
            int numbers= 10;

            //when
            Euler6 euler6 = new Euler6();
            int result = euler6.difference(numbers);

            //then
            assertThat(result, equalTo(2640));

        }

        @Test
        public void shouldGive5434forValue12() {
            //given
            int numbers = 12;

            //when
            Euler6 euler6 = new Euler6();
            int result = euler6.difference(numbers);

            //then
            assertThat(result, equalTo(5434));

        }

    }
