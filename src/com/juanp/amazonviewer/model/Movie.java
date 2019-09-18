package com.juanp.amazonviewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Movie extends Film implements IVisualizable{

	private int id;	
	private int timeViewed;
	
	
	

	public Movie(String title, String genre, String creator, int duration,short year) {
		super(title, genre, creator, duration);
		setYear(year);
	}


	public void showData() {
		//System.out.println("Title: "+this.title+"\nGenre: "+this.genre+"\nYear: "+this.year);
	}


	public int getId() {
		return id;
	}

	public int getTimeViewed() {
		return timeViewed;
	}


	public void setTimeViewed(int timeViewed) {
		this.timeViewed = timeViewed;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "::MOVIE::"
				+ "Title: "+getTitle()+
				"\nGenero: "+getGenre()+
				"\nYear: "+getYear()+
				"\nCreator: "+getCreator()+
				"\nDuration: "+getDuration();
	}


	@Override
	public Date startToSee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}


	@Override
	public void stopToSee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if(dateF.getTime()>dateI.getTime()) {
			setTimeViewed((int)(dateF.getTime()-dateI.getTime()));			
		}
		else {
			setTimeViewed(0);
		}
		
		
	}
	
	public static ArrayList<Movie> makeMovies(){
		
		ArrayList<Movie> movies=new ArrayList<>();
		
		
		for (int i = 1; i <=5; i++) {
			
			movies.add(new Movie("It"+i, "Terror"+i, "Creador "+i, 130+i,(short) (2017+i)));
		}
		return movies;
	}
	
	
	
}
