package com.juanp.amazonviewer.model;

import java.util.Date;

public class Magazine extends Publication {

	private int id;

	public Magazine(String title, Date editionDate, String editorial, String[] autors) {
		super(title, editionDate, editorial, autors);
	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "::MAGAZINE::"
				+ "\nTitle:"+getTitle();
	}
		
	
}
