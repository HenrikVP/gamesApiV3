package org.example.gamesapiv3.repository;

import org.example.gamesapiv3.model.Game;
import org.springframework.data.repository.CrudRepository;

public interface GameRepository extends CrudRepository<Game, Integer> {
}
