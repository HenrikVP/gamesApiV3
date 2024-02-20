package org.example.gamesapiv3.controller;

import org.example.gamesapiv3.model.Data;
import org.example.gamesapiv3.model.Game;
import org.example.gamesapiv3.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {

    @Autowired
    GameService gameService;
//    @GetMapping()
//    List<Game> getAllGames() {
//        return Data.games;
//    }
    @GetMapping()
    List<Game> getAllGames() {
        return gameService.getAllGames();
    }

    @GetMapping("/{id}")
    Game getGameById(@PathVariable int id) {
        Game gameFound = Data.games.stream()
                .filter(game -> id == game.getId())
                .findFirst()
                .orElse(null);
        return gameFound;
    }

    @PostMapping()
    void createGame(@RequestBody Game game) {
        Data.games.add(game);
    }

    @PutMapping()
    boolean updateGameById(@RequestBody Game updGame) {
        for (Game game : Data.games) {
            if (updGame.getId() == game.getId()){
                Data.games.set(Data.games.indexOf(game), updGame);
                return true;
            }
        }
        return false;
    }

    @DeleteMapping("/{id}")
    boolean deleteGameById(@PathVariable int id) {
        Game gameFound = Data.games.stream()
                .filter(game -> id == game.getId())
                .findFirst()
                .orElse(null);
        if (gameFound != null) {
            Data.games.remove(gameFound);
            return true;
        }
        return false;
    }
}
