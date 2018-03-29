package roomie.tech.FindRoommate.data;

import java.util.Date;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "roommateSurveys")
public class RoommateSurvey {
	@Id
    private ObjectId id;
	
    public ObjectId userId;
    public String city;
    public Date createdAt;

	public int question0;
	public int question1;
	public int question2;
	public int question3;
	public int question4;
	public int question5;
	public int question6;
	public int question7;
	public int question8;
	public int question9;
	public int question10;
	public int question11;
	public int question12;
	public int question13;
	public int question14;
	public int question15;
	public int question16;
	public int question17;
	public int question18;
	public int question19;
	public int question20;
	public int question21;
	public int question22;
	public int question23;
	public int question24;
	public int question25;
	public int question26;
	public int question27;
	public int question28;
	public int question29;
	public int question30;
	public int question31;
	public int question32;
	public int question33;
	public int question34;
	public int question35;
	public int question36;
	public int question37;
	public int question38;
	public int question39;
	public int question40;
	public int question41;
	public int question42;
	public int question43;
	public int question44;
	public int question45;
	public int question46;
	public int question47;
	public int question48;
	public int question49;
	public int question50;
	public int question51;
	public int question52;
	public int question53;
	public int question54;
	public int question55;
	public int question56;
	public int question57;
	public int question58;
	public int question59;
	public int question60;
	public int question61;
	public int question62;
	public int question63;
	public int question64;
	@Override
	public String toString() {
		return "RoommateSurvey [id=" + id + ", userId=" + userId + ", city=" + city + ", createdAt=" + createdAt
				+ ", question0=" + question0 + ", question1=" + question1 + ", question2=" + question2 + ", question3="
				+ question3 + ", question4=" + question4 + ", question5=" + question5 + ", question6=" + question6
				+ ", question7=" + question7 + ", question8=" + question8 + ", question9=" + question9 + ", question10="
				+ question10 + ", question11=" + question11 + ", question12=" + question12 + ", question13="
				+ question13 + ", question14=" + question14 + ", question15=" + question15 + ", question16="
				+ question16 + ", question17=" + question17 + ", question18=" + question18 + ", question19="
				+ question19 + ", question20=" + question20 + ", question21=" + question21 + ", question22="
				+ question22 + ", question23=" + question23 + ", question24=" + question24 + ", question25="
				+ question25 + ", question26=" + question26 + ", question27=" + question27 + ", question28="
				+ question28 + ", question29=" + question29 + ", question30=" + question30 + ", question31="
				+ question31 + ", question32=" + question32 + ", question33=" + question33 + ", question34="
				+ question34 + ", question35=" + question35 + ", question36=" + question36 + ", question37="
				+ question37 + ", question38=" + question38 + ", question39=" + question39 + ", question40="
				+ question40 + ", question41=" + question41 + ", question42=" + question42 + ", question43="
				+ question43 + ", question44=" + question44 + ", question45=" + question45 + ", question46="
				+ question46 + ", question47=" + question47 + ", question48=" + question48 + ", question49="
				+ question49 + ", question50=" + question50 + ", question51=" + question51 + ", question52="
				+ question52 + ", question53=" + question53 + ", question54=" + question54 + ", question55="
				+ question55 + ", question56=" + question56 + ", question57=" + question57 + ", question58="
				+ question58 + ", question59=" + question59 + ", question60=" + question60 + ", question61="
				+ question61 + ", question62=" + question62 + ", question63=" + question63 + ", question64="
				+ question64 + "]";
	}
}
