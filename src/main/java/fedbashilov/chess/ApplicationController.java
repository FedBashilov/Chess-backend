package fedbashilov.chess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @Autowired
    GamesRepository gamesRepository;

    @RequestMapping(value = "/games")
    public Iterable<fedbashilov.chess.Games>  getGames() {
        Iterable<fedbashilov.chess.Games> games = gamesRepository.findAll();
        return games;
    }
}
