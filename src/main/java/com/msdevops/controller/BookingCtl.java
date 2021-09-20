package com.msdevops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class BookingCtl {

    @GetMapping("/test")
    public String test() {
        return "for testing";
    }

    @GetMapping("/getBookingDetail/{show}")
    public String getBookingDetails(@PathVariable("show") String show) {
        return "<div align='center'><h2>PNR: "+ show +";Seat Number: 2323</h2></div>";
    }

}
