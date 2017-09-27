package com.learnwithme.buildapps.giantbomb;

import com.learnwithme.buildapps.giantbomb.utils.DateTextUtils;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.assertEquals;

public class DateUtilsTest {
    @Test
    public void testGetDateString_returnsCorrectString() {
        // Arrange
        String TEST_DATE_STRING = "2017-07-03";
        Calendar testDate = new GregorianCalendar(2017, Calendar.JULY, 3);

        // Assert
        assertEquals("getDateString method returned incorrect string!",
                TEST_DATE_STRING,
                DateTextUtils.getDateString(testDate.getTime()));
    }
}