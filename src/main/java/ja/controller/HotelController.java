package ja.controller;


import ja.domain.Hotel;
import ja.repository.HotelRespository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    private HotelRespository hotelRespository;

    public HotelController(HotelRespository hotelRespository){
        this.hotelRespository = hotelRespository;
    }

    @GetMapping("/")
    public List<Hotel> getall(){
    List<Hotel> hotels = this.hotelRespository.findAll();

    return hotels;
    }








}
