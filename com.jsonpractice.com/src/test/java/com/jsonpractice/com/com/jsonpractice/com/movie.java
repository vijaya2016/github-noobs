package com.jsonpractice.com.com.jsonpractice.com;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class movie {
private String Title;
private String idIMBD;
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getIdIMBD() {
	return idIMBD;
}
public void setIdIMBD(String idIMBD) {
	this.idIMBD = idIMBD;
}
public String getUrlposter() {
	return urlposter;
}
public void setUrlposter(String urlposter) {
	this.urlposter = urlposter;
}
private String urlposter;
}
