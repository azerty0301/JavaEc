package model;

import java.io.Serializable;

public class Station implements Serializable {
	private String name;
	private String prefecture;

	public Station() {}
	public Station(String name, String prefecture) {
		this.name= name;
		this.prefecture=prefecture;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrefecture() {
		return prefecture;
	}
	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}

}
