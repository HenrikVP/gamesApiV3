package org.example.gamesapiv3.controller;

import org.example.gamesapiv3.model.Data;
import org.example.gamesapiv3.model.Game;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {
     @GetMapping()
    List<Game> getAllGames(){
        return Data.games;
    }
}
