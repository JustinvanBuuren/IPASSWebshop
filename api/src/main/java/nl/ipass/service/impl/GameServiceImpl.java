package nl.ipass.service.impl;

import nl.ipass.configuration.DBConnection;
import nl.ipass.definition.BestelStatus;
import nl.ipass.definition.Game;
import nl.ipass.definition.exception.WebAppException;
import nl.ipass.service.GameService;

import javax.ws.rs.NotFoundException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GameServiceImpl implements GameService {

    @Override
    public Game save(Game game) {
        try {
            String query = "INSERT INTO game (publicId, titel, bestelStatus, prijs, genre, platform, voorraad) VALUES (?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement statement = DBConnection.prepareStatement(query);

            String publicId = DBConnection.generateRandomId();

            statement.setString(1, publicId);
            statement.setString(2, game.getTitel());
            statement.setString(3, game.getBestelStatus().name());
            statement.setDouble(4, game.getPrijs());
            statement.setString(5, game.getGenre());
            statement.setString(6, game.getPlatform());
            statement.setInt(7, game.getVoorraad());

            statement.execute();

            DBConnection.close();

            game.setPublicId(publicId);
            return game;
        } catch(SQLException e) {
            throw new WebAppException(DBConnection.DB_ERROR, e.getCause());
        }
    }

    @Override
    public Game update(Game game, Long id) {
        return null;
    }

    @Override
    public boolean remove(Game game) {
        return false;
    }

    @Override
    public Game findById(String id) throws WebAppException {
        try {
            String query = "SELECT publicId, titel, bestelStatus, prijs, genre, platform, voorraad FROM game WHERE publicId = ?";

            PreparedStatement statement = DBConnection.prepareStatement(query);
            statement.setString(1, id);
            ResultSet rs = statement.executeQuery();
            Game game = new Game();

            if(!rs.next()){
                System.out.println("tasdf");
                throw new IllegalArgumentException("Er is geen game gevonden.");
            } else {
                do {
                    createGameObjectFromDatabase(rs, game);
                } while (rs.next());
            }

            DBConnection.close();

            return game;
        } catch(SQLException e) {
            throw new WebAppException(DBConnection.DB_ERROR, e.getCause());
        }
    }

    private void createGameObjectFromDatabase(ResultSet rs, Game game) throws SQLException {
        game.setPublicId(rs.getString("publicId"));
        game.setTitel(rs.getString("titel"));
        game.setBestelStatus(BestelStatus.valueOf(rs.getString("bestelStatus")));
        game.setPrijs(rs.getDouble("prijs"));
        game.setGenre(rs.getString("genre"));
        game.setPlatform(rs.getString("platform"));
        game.setVoorraad(rs.getInt("voorraad"));
    }

    @Override
    public List<Game> findAll() throws WebAppException {
        try {
            String query = "SELECT publicId, titel, bestelStatus, prijs, genre, platform, voorraad FROM game";

            PreparedStatement statement = DBConnection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            List<Game> games = new ArrayList<>();

            while(rs.next()) {
                Game game = new Game();
                createGameObjectFromDatabase(rs, game);

                games.add(game);
            }

            DBConnection.close();

            return games;
        } catch(SQLException e) {
            throw new WebAppException(DBConnection.DB_ERROR, e.getCause());
        }
    }
}
