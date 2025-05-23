package onebot11.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class API {
    protected String toJson(boolean httpFormat) {
        if (httpFormat) {
            // TODO: httpFormat
            return null;
        } else {
            // TODO: wsFormat
            // {action, params(httpFormat), echo}
            return null;
        }
        // TODO: toJson
        return null;
    }

    protected String toJson() {
        return toJson(true);
    }
}