package DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class JokeDTO {
    private String category;
    private String type;
    private String joke;
    private Flags flags;
    private int id;
    private boolean error;

    @Getter
    @NoArgsConstructor
    public static class Flags {
        private boolean nsfw;
        private boolean religious;
        private boolean political;
        private boolean racist;
        private boolean sexist;
    }
}