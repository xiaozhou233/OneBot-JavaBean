package onebot11.message;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Map;

@JsonTypeName("unknown")
public class UnknownSegment extends Segment {
    public UnknownSegment() {
        this.type = "unknown";
    }

    public UnknownSegment(String unknownType, Map<String, Object> data) {
        this.type = unknownType;
        this.data = data;
    }
}
