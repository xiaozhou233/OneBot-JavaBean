package onebot11.api.http;

import lombok.Data;
import lombok.EqualsAndHashCode;
import com.fasterxml.jackson.annotation.JsonProperty;
import onebot11.api.API;

@EqualsAndHashCode(callSuper = true)
@Data
public class SendPrivateMessage extends API{
    public String action = "send_private_msg";
    public long groupID;
    public String message;
    public int autoEscape = 0;

    // only for ws
    public String echo;
}