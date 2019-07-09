package nl.ipass.endpoint;

import nl.ipass.definition.ipass.Game;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.sql.*;

@Path("games")
public class GamesEndpoint {

    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/ipass";
    static final String USER = "ipass";
    static final String PASS = "ipass";

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

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Game nieuweGame(Game game) {

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            String query = "INSERT INTO game (titel, bestelStatus, prijs, genre, platform, voorraad) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, game.getTitel());
            preparedStatement.setString(2, game.getBestelStatus());
            preparedStatement.setDouble(3, game.getPrijs());
            preparedStatement.setString(4, game.getGenre());
            preparedStatement.setString(5, game.getPlatform());
            preparedStatement.setInt(6, 10);

            boolean result = preparedStatement.execute();

            conn.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
        return game;
    }
}
