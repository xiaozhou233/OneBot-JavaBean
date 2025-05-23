package onebot11.event.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import onebot11.event.Event;

@EqualsAndHashCode(callSuper = true)
@Data
public class GroupRequest extends Request {
    @JsonProperty("sub_type")
    protected String subType;

    @JsonProperty("group_id")
    protected long groupID;
}