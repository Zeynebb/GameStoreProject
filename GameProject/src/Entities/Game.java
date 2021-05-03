package Entities;

public class Game {
	private int Id;
	private String gameName;
	private double gamePice;
	
	public Game(int id, String gameName, double gamePice) {
		Id = id;
		this.gameName = gameName;
		this.gamePice = gamePice;
	}
	public int getId() {
		return Id;
	}
	public String getGameName() {
		return gameName;
	}
	public double getGamePice() {
		return gamePice;
	}
	

}
