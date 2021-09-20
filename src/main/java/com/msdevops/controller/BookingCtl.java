package com.msdevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingCtl {

    @GetMapping("/getBookingDetail")
    public String getBookingDetails() {
        return "<div align='center'><h2>PNR: 2345423;Seat Number: 2323</h2></div>";
    }

}
