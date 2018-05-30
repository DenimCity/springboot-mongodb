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

        // try {

        // } catch (Exception e) {
        // //TODO: handle exception
        // }
    }

    @GetMapping("/{id}")
    public Optional<Hotel> getById(@PathVariable("id") String id) {
        Optional<Hotel> hotel = this.hotelRepository.findById(id);
        LOGGER.info("*************************Grabbing One Individual Hotel *************************");
        return hotel;

        // try {

        // } catch (Exception e) {
        // //TODO: handle exception
        // }
    }

    @PostMapping("/new")
    public Hotel insert(@RequestBody Hotel hotel) {
        LOGGER.info("*************************Creating New Hotel*************************");
        // Practicing Serialization a response body.
        // Hotel.class.getName().toLowerCase();
        Hotel createdHotel = this.hotelRepository.insert(hotel);
        LOGGER.info("*************************Hotel Created *************************");
        return createdHotel;

        // try {

        // } catch (Exception e) {
        // //TODO: handle exception
        // }
    }

    @PutMapping
    public Hotel updating(@RequestBody Hotel hotel) {
        LOGGER.info("*************************Updating Hotel*************************");

        Hotel updatedHotel = this.hotelRepository.save(hotel);
        LOGGER.info("*************************House Updated*************************");
        return updatedHotel;

        // try {

        // } catch (Exception e) {
        // //TODO: handle exception
        // }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id) {
        LOGGER.info("*************************Deleting Hotel*************************");
        this.hotelRepository.deleteById(id);
        LOGGER.info("*************************House Deleted*************************");

        // try {

        // } catch (Exception e) {
        // //TODO: handle exception
        // }
    }

}
