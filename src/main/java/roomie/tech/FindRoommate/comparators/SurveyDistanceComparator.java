package roomie.tech.FindRoommate.comparators;

import java.util.Comparator;
import java.util.Map.Entry;

public class SurveyDistanceComparator implements Comparator<Entry<String,Double>>{

	@Override
	public int compare(Entry<String, Double> arg0, Entry<String, Double> arg1) {
		return (int) -(arg1.getValue()-arg0.getValue());
	}

}
