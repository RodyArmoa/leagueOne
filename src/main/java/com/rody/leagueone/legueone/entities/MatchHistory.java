package com.rody.leagueone.legueone.entities;

import jakarta.persistence.*;



@Entity
@Table(name = "match_history")
public class MatchHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "match_id", nullable = true)
    private Match match;

    private Integer homeClubScore;

    private Integer awayClubScore;

    private String matchSummary;

    // Getters and setters


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public Integer getHomeClubScore() {
        return homeClubScore;
    }

    public void setHomeClubScore(Integer homeClubScore) {
        this.homeClubScore = homeClubScore;
    }

    public Integer getAwayClubScore() {
        return awayClubScore;
    }

    public void setAwayClubScore(Integer awayClubScore) {
        this.awayClubScore = awayClubScore;
    }

    public String getMatchSummary() {
        return matchSummary;
    }

    public void setMatchSummary(String matchSummary) {
        this.matchSummary = matchSummary;
    }
}
