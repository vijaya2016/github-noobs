package com.jsonpractice.com.com.jsonpractice.com;

import java.io.Serializable;

public class FooballPlayer implements Serializable {
	String name;
	String nationality;
	String position;
	String club;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getClub() {
		return club;
	}
	public void setClub(String club) {
		this.club = club;
	}
@Override
public String toString()
{
	return "getName()   +    getPosition()   + getClub()";
}
}
