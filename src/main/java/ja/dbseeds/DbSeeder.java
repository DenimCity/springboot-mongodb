package ja.dbseeds;


import java.util.Arrays;
import java.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ja.domain.Address;
import ja.domain.Hotel;
import ja.domain.Review;
import ja.repository.HotelRespository;


@Component
public class DbSeeder implements CommandLineRunner {

    private HotelRespository hotelRespository;

    public DbSeeder(HotelRespository hotelRespository) {
        this.hotelRespository = hotelRespository;
    }

    @Override
    public void run(String... args) throws Exception {
        Hotel marriot = new Hotel(
                "Marriot",
                130,
                new Address("Paris", "France" ),
                Arrays.asList(
                        new Review("John", 8, false),
                        new Review("Mary", 7, true)
                )
        );

        Hotel KapelTowers = new Hotel(
                "Kapel Towers",
                90,
                new Address("Truth", "Florida" ),
                Arrays.asList(
                        new Review("Jean", 9, true),
                        new Review("Emma", 7, false)
                )
        );

        Hotel dropal = new Hotel(
                "Dropal Towers",
                200,
                new Address("Rome", "Italy" ),
                Arrays.asList(
                        new Review("Michelle", 9, true),
                        new Review("Ozzie", 7, false)
                )
        );

        //Drop the existing collection that currently in the database to start with a clean database
        this.hotelRespository.deleteAll();;

        //add our hotel seeds
        List<Hotel> hotels = Arrays.asList(marriot, KapelTowers, dropal);
        this.hotelRespository.save(hotels);

    }
}