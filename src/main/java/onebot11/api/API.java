package onebot11.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class API {
    protected HashMap<String, Object> data = new HashMap<>();
    protected String toJson() {
        // TODO: toJson
        return null;
    }
}