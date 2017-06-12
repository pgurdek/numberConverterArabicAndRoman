import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pgurdek on 12.06.17.
 */
class ConverterArabicToRomanTest {

    ConverterArabicToRoman converterArabicToRoman;
    Map<String,Integer> testValues = new HashMap<String,Integer>(){{
        put("IV",4);
        put("X",10);
        put("I",1);
        put("CDIX",499);
        put("MM",2000);
    }};

    @BeforeEach
    void setUp() {
        converterArabicToRoman = new ConverterArabicToRoman();
    }


    @ParameterizedTest
    @ValueSource(strings = {"IV","X","I"})
    @ArgumentsSource(ints = {4,10,1})
    void parameterizedTest(String arabic,Integer roman) {

    }
}