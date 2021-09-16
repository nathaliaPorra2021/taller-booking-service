drop table IF exists TBL_SHOWTIME;
drop table IF exists TBL_SHOWTIME_MOVIE;



CREATE TABLE TBL_BOOKING (id IDENTITY PRIMARY KEY NOT NULL,
   USER_ID INT,
   SHOWTIME_ID INT);

CREATE TABLE TBL_BOOKING_MOVIE (id IDENTITY PRIMARY KEY NOT NULL,
   BOOKING_ID int,
   movie_id INT);

insert into TBL_BOOKING(id,USER_ID,SHOWTIME_ID) values (1,1,1);
insert into TBL_BOOKING(id,USER_ID,SHOWTIME_ID) values (2,2,3);
insert into TBL_BOOKING(id,USER_ID,SHOWTIME_ID) values (3,4,4);
insert into TBL_BOOKING(id,USER_ID,SHOWTIME_ID) values (4,5,2);


insert into TBL_BOOKING_MOVIE(id,BOOKING_ID,movie_id) values (1,1,1);
insert into TBL_BOOKING_MOVIE(id,BOOKING_ID,movie_id) values (2,1,3);

insert into TBL_BOOKING_MOVIE(id,BOOKING_ID,movie_id) values (3,2,2);
insert into TBL_BOOKING_MOVIE(id,BOOKING_ID,movie_id) values (4,2,3);
insert into TBL_BOOKING_MOVIE(id,BOOKING_ID,movie_id) values (5,2,4);

insert into TBL_BOOKING_MOVIE(id,BOOKING_ID,movie_id) values (6,3,5);
insert into TBL_BOOKING_MOVIE(id,BOOKING_ID,movie_id) values (7,3,6);
insert into TBL_BOOKING_MOVIE(id,BOOKING_ID,movie_id) values (8,3,7);

insert into TBL_BOOKING_MOVIE(id,BOOKING_ID,movie_id) values (9,4,5);