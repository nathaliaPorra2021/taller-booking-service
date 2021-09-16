package taller.com.co.bookings.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import taller.com.co.bookings.entity.BookingMovie;

public interface BookingMovieRepository extends JpaRepository<BookingMovie,Long> {
}
