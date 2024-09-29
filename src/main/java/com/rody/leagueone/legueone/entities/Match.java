package com.rody.leagueone.legueone.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "matches")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "tournament_id", nullable = true)
    private Tournament tournament;

    @ManyToOne
    @JoinColumn(name = "home_club_id", nullable = true)
    private Club homeClub;

    @ManyToOne
    @JoinColumn(name = "away_club_id", nullable = true)
    private Club awayClub;

    private LocalDate matchDate;

    private Integer homeGoals = 0;

    private Integer awayGoals = 0;

    // Getters and setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Tournament getTournament() {
        return tournament;
    }

    public void setTournament(Tournament tournament) {
        this.tournament = tournament;
    }

    public Club getHomeClub() {
        return homeClub;
    }

    public void setHomeClub(Club homeClub) {
        this.homeClub = homeClub;
    }

    public Club getAwayClub() {
        return awayClub;
    }

    public void setAwayClub(Club awayClub) {
        this.awayClub = awayClub;
    }

    public LocalDate getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(LocalDate matchDate) {
        this.matchDate = matchDate;
    }

    public Integer getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(Integer homeGoals) {
        this.homeGoals = homeGoals;
    }

    public Integer getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(Integer awayGoals) {
        this.awayGoals = awayGoals;
    }

    @Override
    public String toString() {
        return "Match{" +
                "id=" + id +
                ", tournament=" + tournament +
                ", homeClub=" + homeClub +
                ", awayClub=" + awayClub +
                ", matchDate=" + matchDate +
                ", homeGoals=" + homeGoals +
                ", awayGoals=" + awayGoals +
                '}';
    }
}
