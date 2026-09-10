package DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ChucknorrisDTO {
    private List<String> categories;
    private String created_at;
    private String updated_at;
    private String icon_url;
    private String id;
    private String url;
    private String value;

    @Override
    public String toString() {
        return value;
    }
}