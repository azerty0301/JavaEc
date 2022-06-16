package model;

import java.io.Serializable;

public class Stone implements Serializable {
	private String imgPath;
	private String stoneName;
	private String birthMonth;
	private String word;

	public Stone(String imgPath, String stoneName, String birthMonth, String word) {
		this.imgPath = imgPath;
		this.stoneName = stoneName;
		this.birthMonth = birthMonth;
		this.word = word;
	}


	public String getStoneName() {
		return stoneName;
	}
	public void setStoneName(String stoneName) {
		this.stoneName = stoneName;
	}
	public String getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(String birthMonth) {
		this.birthMonth = birthMonth;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public Stone() {}
	public String getImgPath() {
		return imgPath;
	}
	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
	public String getJaName() {
		return stoneName;
	}
	public void setJaName(String jaName) {
		this.stoneName = jaName;
	}
	public String getBirthDay() {
		return birthMonth;
	}
	public void setBirthDay(String birthDay) {
		this.birthMonth = birthDay;
	}
}
