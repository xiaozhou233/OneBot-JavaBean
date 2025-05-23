package onebot11.message;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Segment {
    public String type;
    public <? extends T> data;
}