package com.supinfo;

import java.time.LocalDate;

public class Inscription
{
	private int id;
	private LocalDate date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Inscription [id=" + id + ", date=" + date + "]";
	}
	public static void main(String[]args) {
		Inscription inscription= new Inscription();
		LocalDate date= LocalDate.parse("2000-05-25");
		inscription.setId(2)	;
		inscription.setDate(date);
	}

}
