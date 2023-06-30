package ru.kontur.courses.control.digit.upc;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UpcTest {
    
    @ParameterizedTest
    @CsvSource(value = {
            "0,0",
            "1,7",
            "2,4",
            "9,3",
            "10,9",
            "13,0",
            "15,4",
            "17,8",
            "18,5",
            "11111111111,7",
            "12345678901,2",
            "98765432101,2",
            "11223344556,2",
            "32512312431,1",
            "98439874398,8",
            "98439876398,6",
    })
    public void upc(long input, int expected) {
        final var actual = Upc.calculateUpc(input);
        assertEquals(expected, actual);
    }
}
