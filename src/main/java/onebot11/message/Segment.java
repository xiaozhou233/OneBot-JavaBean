package onebot11.message;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type", visible = true,
        defaultImpl = UnknownSegment.class
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = Text.class, name = "text"),
        @JsonSubTypes.Type(value = Face.class, name = "face")
})
@Data
public abstract class Segment {
    @JsonProperty("type")
    protected String type;

    @JsonProperty("data")
    protected Map<String, Object> data;

}
