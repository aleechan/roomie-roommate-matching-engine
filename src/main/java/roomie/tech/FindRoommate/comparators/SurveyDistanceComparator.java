package roomie.tech.FindRoommate.comparators;

import java.util.Comparator;
import java.util.Map.Entry;

import roomie.tech.FindRoommate.data.RoommateSurvey;

public class SurveyDistanceComparator implements Comparator<Entry<String,RoommateSurvey>>{

	@Override
	public int compare(Entry<String, RoommateSurvey> arg0, Entry<String, RoommateSurvey> arg1) {
		return (int) (arg0.getValue().distance-arg1.getValue().distance);
	}

}
