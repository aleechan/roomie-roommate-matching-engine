package roomie.tech.FindRoommate.repositories;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import roomie.tech.FindRoommate.data.RoommateSurvey;

public interface RoommateSurveyRepository extends MongoRepository<RoommateSurvey, Long>{

	public RoommateSurvey findByUserId(ObjectId userId);
	public List<RoommateSurvey> findByCity(String city);
	
}
