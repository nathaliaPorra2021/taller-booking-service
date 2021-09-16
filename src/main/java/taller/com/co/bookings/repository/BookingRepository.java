package taller.com.co.bookings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taller.com.co.bookings.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking,Long> {
}
