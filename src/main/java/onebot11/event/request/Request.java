package onebot11.event.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import onebot11.event.Event;

@EqualsAndHashCode(callSuper = true)
@Data
public class Request extends Event {
    @JsonProperty("request_type")
    protected String requestType;

    @JsonProperty("user_id")
    protected long userID;

    @JsonProperty("comment")
    protected String comment;
 
    @JsonProperty("flag")
    protected String flag;
}