package fedbashilov.chess;

import org.springframework.data.repository.CrudRepository;


public interface GamesRepository extends CrudRepository<fedbashilov.chess.Games, Long>{
    fedbashilov.chess.Games findByName(String name);
}