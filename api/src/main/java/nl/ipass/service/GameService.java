package nl.ipass.service;

import nl.ipass.definition.Game;

import java.util.List;

public interface GameService {

    Game save(Game game);
    Game update(Game game, Long id);
    boolean remove(Game game);
    Game findById(String id);
    List<Game> findAll();

}
