package model;

import java.io.Serializable;

public class Damage implements Serializable {
	private double op;//攻撃力
	private double tp;//使用する技の倍率(%)
	private double dp;//敵の防御力
	private double damage;//ダメージ
	private String imgPath;

	public Damage() {}

	public Damage(double op, double tp, double dp, double damage, String imgPath) {
	this.op = op;
	this.tp = tp;
	this.dp = dp;
	this.damage = damage;
	this.imgPath = imgPath;
	}

	public double getDamage() {
		return damage;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}

	public double getOp() {
		return op;
	}

	public void setOp(double op) {
		this.op = op;
	}

	public double getTp() {
		return tp;
	}

	public void setTp(double tp) {
		this.tp = tp;
	}

	public double getDp() {
		return dp;
	}

	public void setDp(double dp) {
		this.dp = dp;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}
}