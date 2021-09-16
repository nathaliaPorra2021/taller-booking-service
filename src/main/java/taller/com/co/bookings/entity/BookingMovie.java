package taller.com.co.bookings.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import taller.com.co.bookings.model.Movie;


import javax.persistence.*;

@Entity
@Table(name="TBL_BOOKING_MOVIE")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingMovie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "movie_id")
    private Long movieId;

    @Transient
    private Movie movie;

}
