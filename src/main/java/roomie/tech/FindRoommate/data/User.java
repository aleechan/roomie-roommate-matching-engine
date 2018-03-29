package roomie.tech.FindRoommate.data;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
	@Id
	public ObjectId id;
	
    public String name;
    public boolean isLandlord;
    public Date createdAt;
    public String profilePictureLink;
    public double percentMatch;
    
}
