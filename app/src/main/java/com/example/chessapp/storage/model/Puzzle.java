package com.example.chessapp.storage.model;

public class Puzzle implements DBEntry {
    public int id;
    public String name;
    public String solution;
    public String clubName;
    public String playerText; // NN - NN
    public String gameInfo; // white to move, win
    public boolean isPublic = true; // if false -> bonus , else -> normal
    public String image; // name of file with image of game


    @Override
    public int getId() {
        return id;
    }


    public Puzzle() {
    }

    public Puzzle(String name, String solution, String clubName, String playerText, String gameInfo, boolean isPublic, String image) {
        this.id = -1;
        this.name = name;
        this.solution = solution;
        this.clubName = clubName;
        this.isPublic = isPublic;
        this.image = image;
        this.playerText = playerText;
        this.gameInfo = gameInfo;
    }

    public Puzzle(int id, String name, String solution, String clubName, String playerText, String gameInfo, boolean isPublic, String image) {
        this.id = id;
        this.name = name;
        this.solution = solution;
        this.clubName = clubName;
        this.isPublic = isPublic;
        this.image = image;
        this.playerText = playerText;
        this.gameInfo = gameInfo;
    }

    @Override
    public String toString() {
        return "Puzzle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", solution='" + solution + '\'' +
                ", clubName='" + clubName + '\'' +
                ", playerText='" + playerText + '\'' +
                ", gameInfo='" + gameInfo + '\'' +
                ", isPublic=" + isPublic +
                ", image='" + image + '\'' +
                '}';
    }
}
