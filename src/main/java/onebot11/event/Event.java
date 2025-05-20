package onebot11.event;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

@Data
public class Event {
    protected long time;

    @JsonProperty("self_id")
    protected long selfID;

    @JsonProperty("post_type")
    protected String postType;
}
