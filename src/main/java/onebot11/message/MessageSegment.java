package onebot11.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.HashMap;

public class MessageSegment {
    // TODO: Message Segments
    public List<HashMap<String, HashMap<String, ?>>> message;
    public List<?> segments;

    public void setMessage(List<HashMap<String, HashMap<String, ?>>> message) {
        this.message = message;
        message.forEach(this::addSegment);
    }

    private void addSegment(HashMap<String, HashMap<String, ?>> segment) {
        
    }
    
    
}