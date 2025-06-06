package onebot11.message;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Map;

@JsonTypeName("text")
public class Text extends TypedSegment<String> {

    public Text() {
        super("text");
    }

    public Text(String text) {
        super("text");
        setContent(text);
    }

    public String getText() {
        return getContent();
    }

    public void setText(String text) {
        setContent(text);
    }

    @Override
    protected String fromData(Map<String, Object> data) {
        Object t = data.get("text");
        return t instanceof String ? (String) t : null;
    }

    @Override
    protected Map<String, Object> toData(String content) {
        return Map.of("text", content);
    }
}
