package org.example.gamesapiv3.service;

import org.example.gamesapiv3.model.Game;
import org.example.gamesapiv3.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {
    @Autowired
    GameRepository gameRepository;

    public List<Game> getAllGames(){
        List<Game> games = new ArrayList<>();
        gameRepository.findAll().forEach(game->games.add(game));
        return games;
    }
}
