package onebot11.message;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;

@Data
public class Segment {
    @JsonProperty("type")
    public String type;

    @JsonProperty("data")
    public HashMap<String, ?> data;
}