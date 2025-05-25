package onebot11.message;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Map;

public abstract class TypedSegment<T> extends Segment {

    @JsonIgnore
    protected T content;

    public TypedSegment(String type) {
        this.type = type;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
        this.data = toData(content);
    }

    @Override
    public void setData(Map<String, Object> data) {
        this.data = data;
        this.content = fromData(data);
    }

    @Override
    public Map<String, Object> getData() {
        return this.data;
    }

    protected abstract T fromData(Map<String, Object> data);

    protected abstract Map<String, Object> toData(T content);
}
