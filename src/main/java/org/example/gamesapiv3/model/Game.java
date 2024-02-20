package org.example.gamesapiv3.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.concurrent.atomic.AtomicInteger;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class Game {
    private final static AtomicInteger idGenerator =
            new AtomicInteger(0);
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Category category;

    public Game(){id = idGenerator.incrementAndGet(); }

    public int getId() {return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Category getCategory() {return category;}
    public void setCategory(Category category) {this.category = category;}

    enum Category {
        Survival, Sandbox, IdleGaming, FPS, RTS, RPG, MMORpg, BattleRoyal, MOBA, Rouge, Turnbased, Strategy, Simulation, Sport, Racing, Platform
    }
}
