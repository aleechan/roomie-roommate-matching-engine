package roomie.tech.FindRoommate.repositories;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import roomie.tech.FindRoommate.data.User;

public interface UserRepository extends MongoRepository<User, Long> {
	@Query("{_id: { $in: ?0 } })")
	List<User> findByIds(List<ObjectId> ids);
}
