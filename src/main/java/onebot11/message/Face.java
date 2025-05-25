package onebot11.message;

import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.Map;

@JsonTypeName("face")
public class Face extends TypedSegment<String> {

    public Face() {
        super("face");
    }

    public Face(String text) {
        super("face");
        setContent(text);
    }

    public String getID() {
        return getContent();
    }

    public void setID(String text) {
        setContent(text);
    }
    @Override
    protected String fromData(Map<String, Object> data) {
        Object t = data.get("id");
        return t instanceof String ? (String) t : null;
    }

    @Override
    protected Map<String, Object> toData(String content) {
        return Map.of("id", content);
    }
}
