package onebot11.message;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;
import java.util.HashMap;
import java.util.stream.Collectors;

public class MessageSegment {
    private List<Segment> segments;

    @JsonCreator
    public MessageSegment(List<Segment> segments) {
        this.segments = segments;
    }

    @JsonValue
    public List<Segment> getSegments() {
        return segments;
    }

    public <T extends Segment> boolean contains(Class<T> type) {
        return segments.stream().anyMatch(type::isInstance);
    }

    public List<Text> getTexts() {
        return getSegmentsOfType(Text.class);
    }

    @SuppressWarnings("unchecked")
    private <T extends Segment> List<T> getSegmentsOfType(Class<T> clazz) {
        return segments.stream()
                .filter(clazz::isInstance)
                .map(s -> (T) s)
                .collect(Collectors.toList());
    }


}