package onebot11.event;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Event {
    protected long time;

    @JsonProperty("self_id")
    protected long selfID;

    @JsonProperty("post_type")
    protected String postType;
}
