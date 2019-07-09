package nl.ipass.endpoint;

import nl.ipass.definition.Game;
import nl.ipass.service.GameService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("games")
public class GamesEndpoint {

    private GameService gameService;

    public GamesEndpoint() {
        // Deze constructor is bewust leeg gelaten
    }

    @Inject
    public GamesEndpoint(GameService gameService) {
        this.gameService = gameService;
    }


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Game> findAllGames() {
        return gameService.findAll();
    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Game findGameById(@PathParam("id") String id) {
        return gameService.findById(id);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Game nieuweGame(Game game) {
        gameService.save(game);

        return game;
    }

}
