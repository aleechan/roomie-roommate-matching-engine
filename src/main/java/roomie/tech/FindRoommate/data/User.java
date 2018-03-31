package roomie.tech.FindRoommate.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
	@Id
	public String _id;
	
    public String name;
    public String email;
    public boolean isLandlord;
    public boolean isEmailConfirmed;
    public boolean isInactive;
    public String profilePictureLink;
    public String createdAt;
    
    public double percentMatch;
    public double distance;
    
}
