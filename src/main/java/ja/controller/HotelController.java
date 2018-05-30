package ja.controller;

import ja.domain.Hotel;
import ja.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
public class HotelController {

    private HotelRepository hotelRepository;

    @Autowired
    public HotelController(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    Logger LOGGER = Logger.getLogger(HotelController.class.getName());

    @GetMapping("/")
    public List<Hotel> getall() {
        LOGGER.info("*************************Grabbing all Hotels*************************");
        List<Hotel> hotels = this.hotelRepository.findAll();
        return hotels;
    }

    @GetMapping("/{id}")
    public Optional<Hotel> getById(@PathVariable("id") String id) {
        Optional<Hotel> hotel = this.hotelRepository.findById(id);
        LOGGER.info("*************************Grabbing One Individual Hotel *************************");
        return hotel;
    }

    @PostMapping("/new")
    public void insert(@RequestBody Hotel hotel) {
        LOGGER.info("*************************Creating New Hotels*************************");
        this.hotelRepository.insert(hotel);
    }

    @PutMapping
    public void updating( @RequestBody Hotel hotel){
        this.hotelRepository.save(hotel);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        LOGGER.info("*************************Deleting Hotel*************************");
        this.hotelRepository.deleteById(id);
    }

}
