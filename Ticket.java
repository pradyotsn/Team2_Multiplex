package com.proj.beans;

public class Ticket {

	private int ticketId=0; 
	private String mobileNo;
	private String movieName;
	private int screenNo;
	private String showDate;
	private String slot;
	private int seats;
	private String bookingDate;

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

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

	public String getShowDate() {
		return showDate;
	}

	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	@Override
	public String toString() {
		return "Ticket [ticketId=" + ticketId + ", mobileNo=" + mobileNo + ", movieName=" + movieName + ", screenNo="
				+ screenNo + ", showDate=" + showDate + ", slot=" + slot + ", seats=" + seats + ", bookingDate="
				+ bookingDate + "]";
	}
}
