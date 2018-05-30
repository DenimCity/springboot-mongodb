package ja.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ja.domain.Hotel;

@Repository
public interface HotelRespository extends MongoRepository<Hotel,String> {


}
