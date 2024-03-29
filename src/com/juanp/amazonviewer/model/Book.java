package com.juanp.amazonviewer.model;

import java.util.Date;

public class Book extends Publication implements IVisualizable{
	private int id;
	
	private String isbn;
	private boolean readed;
	private int timeReaded;
	public Book(String title, Date editionDate, String editorial, String[] autors, String isbn) {
		super(title, editionDate, editorial, autors);
		this.isbn = isbn;
	}
	public int getId() {
		return id;
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean isReaded() {
		return readed;
	}
	public void setReaded(boolean readed) {
		this.readed = readed;
	}
	public int getTimeReaded() {
		return timeReaded;
	}
	public void setTimeReaded(int timeReaded) {
		this.timeReaded = timeReaded;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "::BOOK::"
				+ "\nTitle:"+getTitle();
	}
	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}
	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getSeconds()>dateI.getSeconds()) {
			setTimeReaded(dateF.getSeconds()-dateI.getSeconds());			
		}
		else {
			setTimeReaded(0);
		}
	}
	

}
