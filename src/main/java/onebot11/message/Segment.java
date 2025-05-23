package onebot11.message;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.fasterxml.jackson.annotation.JsonProperty;
@Data
@EqualsAndHashCode(callSuper = true)
public class Segment {
    @JsonProperty("type")
    public String type;

    @JsonProperty("data")
    public T data;
}