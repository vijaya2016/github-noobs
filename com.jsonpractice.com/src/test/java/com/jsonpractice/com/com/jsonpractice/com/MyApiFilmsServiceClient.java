package com.jsonpractice.com.com.jsonpractice.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MyApiFilmsServiceClient {
	public movie findMovieByTitle(String Title) throws IOException
	{
		URL url = new URL("http://www.myapifilms.com/imdb/idIMDB?title="+Title+"&token=d7dc7036-f750-4e5c-9439-25cc63148e23&format=json&language=en-us&aka=0&business=0&seasons=0&seasonYear=0&technical=0&filter=2&exactFilter=0&limit=1&forceYear=0&trailers=0&movieTrivia=0&awards=0&moviePhotos=0&movieVideos=0&actors=0&biography=0&uniqueName=0&filmography=0&bornAndDead=0&starSign=0&actorActress=0&actorTrivia=0&similarMovies=0&adultSearch=0&goofs=0&keyword=0&quotes=0&fullSize=0&companyCredits=0&filmingLocations=0");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setRequestMethod("GET");
			System.out.println(conn.getContent());
			InputStreamReader isr = new InputStreamReader(conn.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			System.out.println(br);
			String output;
			StringBuffer buffer = new StringBuffer();
			while((output = br.readLine()) != null)
			{
				buffer.append(output);
				System.out.println(buffer);
				System.out.println("viji");
			}
			ObjectMapper mapper = new ObjectMapper();
	movie mv= mapper.readValue(buffer.toString(), movie.class);
	System.out.println(mv.getTitle());
	System.out.println("testing");
	return mv;
	//return buffer.toString();
	}
	public static void main(String args[]) throws IOException
	{
		MyApiFilmsServiceClient mfc = new MyApiFilmsServiceClient();
		movie response = mfc.findMovieByTitle("star wars");
		System.out.println(response.getTitle());
		System.out.println("vijaya");
		System.out.println(response.getIdIMBD());
		System.out.println(response.getTitle());
		System.out.println("vijaya2");
	}

}
