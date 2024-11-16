package com.javahotelproject.hotelproject.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class BookingResponse {
    private Long Id;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private String guestName;

    private String guestEmail;

    private int noOfAdults;

    private int noOfChildren;

    private int totalNoOfGuests;

    private String bookingConfirmationCode;

    private RoomResponse room;

    public BookingResponse(Long id, LocalDate checkInDate, LocalDate checkOutDate, String bookingConfirmationCode) {
        Id = id;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.bookingConfirmationCode = bookingConfirmationCode;
    }
}
