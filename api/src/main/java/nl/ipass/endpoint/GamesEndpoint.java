package nl.ipass.endpoint;

import nl.ipass.definition.Game;
import nl.ipass.service.GameService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("games")
public class GamesEndpoint {

    @Inject
    private GameService gameService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response findAllGames() {
        return Response
                .status(200)
                .header("Access-Control-Allow-Origin", "*")
                .header("Access-Control-Allow-Credentials", "true")
                .header("Access-Control-Allow-Methods",
                        "GET, POST, PUT, DELETE, OPTIONS, HEAD")
                .entity(gameService.findAll())
                .build();
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
