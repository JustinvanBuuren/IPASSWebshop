package nl.ipass.endpoint;

import nl.ipass.definition.ipass.Game;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("games")
public class GamesEndpoint {

    @GET
    @Produces("application/json")
    public Game getAllGames() {
        Game game = new Game();
        game.setBestelStatus("1");
        game.setGenre("2");
        game.setPlatform("3");
        game.setPrijs(10.00);
        game.setTitel("4");
        game.setVoorraad(15);

        return game;
    }
}
