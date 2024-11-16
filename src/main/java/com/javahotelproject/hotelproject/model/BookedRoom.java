package com.javahotelproject.hotelproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BookedRoom {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long bookingId;

    @Column(name = "check_In")
    private LocalDate checkinDate;
    @Column(name = "check_Out")
    private LocalDate  checkoutdate;
    @Column(name = "Guest_FullName")
    private String guestFullname;
    @Column(name = "Guest_Email")
    private String guestEmail;
    @Column(name = "adults")
    private int NoofAdults;
    @Column(name = "childrens")
private int NoofChildrens;
    @Column(name = "total_Guest")
private int totalnoOfGuest;

    @Column(name = "confirmation_code")
private String bookingConfirmationcode;


@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn (name = "room_id")
private Room room;

public void calculatetotalnoOfGuest(){   this.totalnoOfGuest = this.NoofAdults+NoofChildrens;
}

    public void setNoofAdults(int NoofAdults) {
        this.NoofAdults = NoofAdults;
calculatetotalnoOfGuest();
}
    public void setNoofChildrens(int NoofChildrens) {
        this.NoofChildrens = NoofChildrens;
   calculatetotalnoOfGuest();
}

    public void setBookingConfirmationcode(String bookingConfirmationcode) {
        this.bookingConfirmationcode = bookingConfirmationcode;
    }
}