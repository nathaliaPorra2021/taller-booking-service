package taller.com.co.bookings.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import taller.com.co.bookings.client.MovieClient;
import taller.com.co.bookings.client.UserClient;
import taller.com.co.bookings.entity.Booking;
import taller.com.co.bookings.entity.BookingMovie;
import taller.com.co.bookings.model.Movie;
import taller.com.co.bookings.model.Users;
import taller.com.co.bookings.repository.BookingMovieRepository;
import taller.com.co.bookings.repository.BookingRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {
    
    private final BookingRepository bookingRepository;

    @Autowired
    BookingMovieRepository bookingMovieRepository;

    @Autowired
    MovieClient movieClient;

    @Autowired
    UserClient userClient;

    @Override
    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public List<Booking> listAllBooking() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking getBookingById(Long id) {
        Booking booking= bookingRepository.findById(id).orElse(null);
        if (null != booking ){
            Users user = userClient.getUser(booking.getUserId()).getBody();
            booking.setUser(user);
            List<BookingMovie> listItem=booking.getMovies().stream().map(movieItem -> {
                Movie movie = movieClient.getMovie(movieItem.getMovieId()).getBody();
                movieItem.setMovie(movie);
                return movieItem;
            }).collect(Collectors.toList());
            booking.setMovies(listItem);
        }
        return booking;
    }

    @Override
    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }

    @Override
    public Booking updateBooking(Booking booking) {

        Booking bookingDB = getBookingById(booking.getId());
        if (bookingDB == null){
            return  null;
        }
        bookingDB.setId(booking.getId());
        bookingDB.setUserId(booking.getUserId());
        bookingDB.setShowtimeId(booking.getShowtimeId());
        bookingDB.getMovies().clear();
        bookingDB.setMovies(booking.getMovies());

        return bookingRepository.save(bookingDB);
    }


}
