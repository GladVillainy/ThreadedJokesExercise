package DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class KanyeDTO {
    private String quote;

    @Override
    public String toString() {
        return quote;
    }
}
