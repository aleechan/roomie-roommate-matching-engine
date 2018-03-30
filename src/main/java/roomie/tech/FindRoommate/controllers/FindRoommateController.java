package roomie.tech.FindRoommate.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import roomie.tech.FindRoommate.comparators.SurveyDistanceComparator;
import roomie.tech.FindRoommate.data.RoommateSurvey;
import roomie.tech.FindRoommate.data.User;
import roomie.tech.FindRoommate.repositories.RoommateSurveyRepository;
import roomie.tech.FindRoommate.repositories.UserRepository;

@RestController
public class FindRoommateController {
	
	private static final double maxDistance = 64000; //(10^2)*64
	
	@Autowired
	private RoommateSurveyRepository surveyRepository;
	@Autowired
	private UserRepository userRepository;
	
	//used for converting java classes to json
	private ObjectMapper mapper = new ObjectMapper();
	
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(@RequestParam("userId") String userId, 
    					@RequestParam("city") String city, 
    					@RequestParam("maxResults") int maxResults) throws JsonProcessingException {
    	
    	RoommateSurvey survey = surveyRepository.findByUserId(new ObjectId(userId));
    	List<RoommateSurvey> surveys = surveyRepository.findByCity(city);
    	
    	Map<String,RoommateSurvey> ranks = new HashMap<>();
    	
    	List<ObjectId> ids = new ArrayList<>();
    	surveys.forEach(s->{
    		ids.add(new ObjectId(s.userId));
    	});
    	List<User> users = userRepository.findByIds(ids);
    	Map<String, User> userMap = new HashMap<>();
    	users.forEach(user -> {
    		userMap.put(user._id, user);
    	});
    	
    	
    	surveys.stream().parallel().filter(s -> {
    		return (
    				!survey.userId.equals(s.userId) &&
    				!userMap.get(s.userId).isInactive &&
    				!userMap.get(s.userId).isLandlord
    			);
    		}).forEach(s->{
    			s.distance = getDistance(survey,s);
    			ranks.put(s.userId.toString(),s);
    	});
    	
    	List<User> results = new ArrayList<>();
    	
    	List<Entry<String,RoommateSurvey>> matches = ranks.entrySet().stream().collect(Collectors.toList()).stream().parallel().sorted(new SurveyDistanceComparator()).limit(maxResults).collect(Collectors.toList());
    	for(Entry<String,RoommateSurvey> match : matches) {
    		User user = userMap.get(match.getKey());
    		user.distance = (Math.sqrt(match.getValue().distance));
    		user.percentMatch = 100 - user.distance/maxDistance;
    		results.add(user);
    	}
    	
        return mapper.writeValueAsString(results);
    }
    
    double getDistance(RoommateSurvey s1, RoommateSurvey s2) {
    	double dist = 0.0;
    	dist += (s1.question0-s2.question0)*(s1.question0-s2.question0);
    	dist += (s1.question1-s2.question1)*(s1.question1-s2.question1);
    	dist += (s1.question2-s2.question2)*(s1.question2-s2.question2);
    	dist += (s1.question3-s2.question3)*(s1.question3-s2.question3);
    	dist += (s1.question4-s2.question4)*(s1.question4-s2.question4);
    	dist += (s1.question5-s2.question5)*(s1.question5-s2.question5);
    	dist += (s1.question6-s2.question6)*(s1.question6-s2.question6);
    	dist += (s1.question7-s2.question7)*(s1.question7-s2.question7);
    	dist += (s1.question8-s2.question8)*(s1.question8-s2.question8);
    	dist += (s1.question9-s2.question9)*(s1.question9-s2.question9);
    	dist += (s1.question10-s2.question10)*(s1.question10-s2.question10);
    	dist += (s1.question11-s2.question11)*(s1.question11-s2.question11);
    	dist += (s1.question12-s2.question12)*(s1.question12-s2.question12);
    	dist += (s1.question13-s2.question13)*(s1.question13-s2.question13);
    	dist += (s1.question14-s2.question14)*(s1.question14-s2.question14);
    	dist += (s1.question15-s2.question15)*(s1.question15-s2.question15);
    	dist += (s1.question16-s2.question16)*(s1.question16-s2.question16);
    	dist += (s1.question17-s2.question17)*(s1.question17-s2.question17);
    	dist += (s1.question18-s2.question18)*(s1.question18-s2.question18);
    	dist += (s1.question19-s2.question19)*(s1.question19-s2.question19);
    	dist += (s1.question20-s2.question20)*(s1.question20-s2.question20);
    	dist += (s1.question21-s2.question21)*(s1.question21-s2.question21);
    	dist += (s1.question22-s2.question22)*(s1.question22-s2.question22);
    	dist += (s1.question23-s2.question23)*(s1.question23-s2.question23);
    	dist += (s1.question24-s2.question24)*(s1.question24-s2.question24);
    	dist += (s1.question25-s2.question25)*(s1.question25-s2.question25);
    	dist += (s1.question26-s2.question26)*(s1.question26-s2.question26);
    	dist += (s1.question27-s2.question27)*(s1.question27-s2.question27);
    	dist += (s1.question28-s2.question28)*(s1.question28-s2.question28);
    	dist += (s1.question29-s2.question29)*(s1.question29-s2.question29);
    	dist += (s1.question30-s2.question30)*(s1.question30-s2.question30);
    	dist += (s1.question31-s2.question31)*(s1.question31-s2.question31);
    	dist += (s1.question32-s2.question32)*(s1.question32-s2.question32);
    	dist += (s1.question33-s2.question33)*(s1.question33-s2.question33);
    	dist += (s1.question34-s2.question34)*(s1.question34-s2.question34);
    	dist += (s1.question35-s2.question35)*(s1.question35-s2.question35);
    	dist += (s1.question36-s2.question36)*(s1.question36-s2.question36);
    	dist += (s1.question37-s2.question37)*(s1.question37-s2.question37);
    	dist += (s1.question38-s2.question38)*(s1.question38-s2.question38);
    	dist += (s1.question39-s2.question39)*(s1.question39-s2.question39);
    	dist += (s1.question40-s2.question40)*(s1.question40-s2.question40);
    	dist += (s1.question41-s2.question41)*(s1.question41-s2.question41);
    	dist += (s1.question42-s2.question42)*(s1.question42-s2.question42);
    	dist += (s1.question43-s2.question43)*(s1.question43-s2.question43);
    	dist += (s1.question44-s2.question44)*(s1.question44-s2.question44);
    	dist += (s1.question45-s2.question45)*(s1.question45-s2.question45);
    	dist += (s1.question46-s2.question46)*(s1.question46-s2.question46);
    	dist += (s1.question47-s2.question47)*(s1.question47-s2.question47);
    	dist += (s1.question48-s2.question48)*(s1.question48-s2.question48);
    	dist += (s1.question49-s2.question49)*(s1.question49-s2.question49);
    	dist += (s1.question50-s2.question50)*(s1.question50-s2.question50);
    	dist += (s1.question51-s2.question51)*(s1.question51-s2.question51);
    	dist += (s1.question52-s2.question52)*(s1.question52-s2.question52);
    	dist += (s1.question53-s2.question53)*(s1.question53-s2.question53);
    	dist += (s1.question54-s2.question54)*(s1.question54-s2.question54);
    	dist += (s1.question55-s2.question55)*(s1.question55-s2.question55);
    	dist += (s1.question56-s2.question56)*(s1.question56-s2.question56);
    	dist += (s1.question57-s2.question57)*(s1.question57-s2.question57);
    	dist += (s1.question58-s2.question58)*(s1.question58-s2.question58);
    	dist += (s1.question59-s2.question59)*(s1.question59-s2.question59);
    	dist += (s1.question60-s2.question60)*(s1.question60-s2.question60);
    	dist += (s1.question61-s2.question61)*(s1.question61-s2.question61);
    	dist += (s1.question62-s2.question62)*(s1.question62-s2.question62);
    	dist += (s1.question63-s2.question63)*(s1.question63-s2.question63);
    	dist += (s1.question64-s2.question64)*(s1.question64-s2.question64);
    	return dist;
    }
    
}
