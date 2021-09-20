package com.msdevops;

import com.msdevops.controller.BookingCtl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;

@SpringBootTest
class MsDevopsApplicationTests {

    @MockBean
    BookingCtl underTest;

    @Test
    public void testGetBookingCtl() {
        String mock = null;
        String result = underTest.getBookingDetails("sdf");
        Assertions.assertEquals(result, mock);
    }

}
