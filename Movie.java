package com.proj.beans;

public class Movie {

	private String movieName;
	private int screenNo;
	private double premiumPrice;
	private double executivePrice;
	private double normalPrice;
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public int getScreenNo() {
		return screenNo;
	}
	public void setScreenNo(int screenNo) {
		this.screenNo = screenNo;
	}
	public double getPremiumPrice() {
		return premiumPrice;
	}
	public void setPremiumPrice(double premiumPrice) {
		this.premiumPrice = premiumPrice;
	}
	public double getExecutivePrice() {
		return executivePrice;
	}
	public void setExecutivePrice(double executivePrice) {
		this.executivePrice = executivePrice;
	}
	public double getNormalPrice() {
		return normalPrice;
	}
	public void setNormalPrice(double normalPrice) {
		this.normalPrice = normalPrice;
	}
	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", screenNo=" + screenNo + ", premiumPrice=" + premiumPrice
				+ ", executivePrice=" + executivePrice + ", normalPrice=" + normalPrice + "]";
	}
	
	
	
}
