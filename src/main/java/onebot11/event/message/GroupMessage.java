package onebot11.event.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class GroupMessage extends Message {
    @JsonProperty("group_id")
    public long groupID;

    public Object anonymous;
}
