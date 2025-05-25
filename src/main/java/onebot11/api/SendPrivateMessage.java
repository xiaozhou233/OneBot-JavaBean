package onebot11.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

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