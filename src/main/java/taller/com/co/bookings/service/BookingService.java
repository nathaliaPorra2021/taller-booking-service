package taller.com.co.bookings.service;

import taller.com.co.bookings.entity.Booking;

import java.util.List;

public interface BookingService {

    public Booking createBooking(Booking booking);

    public List<Booking> listAllBooking();

    public Booking getBookingById(Long id);

    public Booking updateBooking(Booking booking);
    public void deleteBooking(Long id);

}
