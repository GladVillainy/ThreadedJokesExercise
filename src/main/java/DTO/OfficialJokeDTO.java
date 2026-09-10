package DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class OfficialJokeDTO {
    private String type;
    private String setup;
    private String punchline;
    private int id;
}
