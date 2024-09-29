package com.rody.leagueone.legueone.entities;

import jakarta.persistence.*;


@Entity
@Table(name = "club_stats")
public class ClubStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "club_id", nullable = true)
    private Club club;

    private Integer wins = 0;

    private Integer losses = 0;

    private Integer draws = 0;

    private Integer goalsScored = 0;

    private Integer goalsConceded = 0;

    private Integer matchesPlayed = 0;

    // Getters and setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getDraws() {
        return draws;
    }

    public void setDraws(Integer draws) {
        this.draws = draws;
    }

    public Integer getGoalsScored() {
        return goalsScored;
    }

    public void setGoalsScored(Integer goalsScored) {
        this.goalsScored = goalsScored;
    }

    public Integer getGoalsConceded() {
        return goalsConceded;
    }

    public void setGoalsConceded(Integer goalsConceded) {
        this.goalsConceded = goalsConceded;
    }

    public Integer getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    @Override
    public String toString() {
        return "ClubStats{" +
                "id=" + id +
                ", club=" + club +
                ", wins=" + wins +
                ", losses=" + losses +
                ", draws=" + draws +
                ", goalsScored=" + goalsScored +
                ", goalsConceded=" + goalsConceded +
                ", matchesPlayed=" + matchesPlayed +
                '}';
    }
}
