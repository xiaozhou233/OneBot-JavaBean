package onebot11.event.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import onebot11.event.Event;
import onebot11.message.Message;

@EqualsAndHashCode(callSuper = true)
@Data
public class Message extends Event {
    @JsonProperty("message_type")
    protected String messageType;

    @JsonProperty("sub_type")
    protected String subType;

    @JsonProperty("message_id")
    protected long messageID;

    @JsonProperty("user_id")
    protected long userID;

    protected onebot11.message.Message message;

    @JsonProperty("raw_message")
    protected String rawMessage;

    protected int font;

    protected Object sender;
}
