package onebot11.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class Message {
    // TODO: Message Segments
    public List<HashMap<String, ?> message;
    public List<class extends Segment> segments;

    public void setMessage(List<HashMap<String, ?> message) {
        this.message = message;
        message.forEach(this::addSegment);
    }

    private void addSegment(HashMap<String,?> segment) {
        
    }
    
    
}