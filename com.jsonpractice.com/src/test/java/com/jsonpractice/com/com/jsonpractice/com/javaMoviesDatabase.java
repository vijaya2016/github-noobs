package com.jsonpractice.com.com.jsonpractice.com;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



	public class javaMoviesDatabase {
public final String URL = "http://jsonplaceholder.typicode.com/comments?posId=1";
@Ignore	
@Test
	public void test1() throws MalformedURLException, IOException
	{
String data = getDataByJavaIO(URL);
System.out.println(data);
	}
	@Test
	public void testJsonToJava() throws JsonParseException, JsonMappingException, MalformedURLException, IOException
	{
		ObjectMapper mapper = new ObjectMapper();
	//	List<pojoComments> CommentsList = mapper.readValue(getDataByJavaIO(URL), new TypeReference<List<pojoComments>>(){});
	//pojoComments p = mapper.readVlue(getDataByJavaIO(URL),pojoComments.class);
	List<pojoComments> p =mapper.readValue(getDataByJavaIO(URL), new TypeReference<List<pojoComments>>(){});
		Iterator<pojoComments> itr = p.iterator();
		while(itr.hasNext())
			{System.out.println(itr.next());
			System.out.println("\n\n");
			}
			
		
	}
	public String getDataByJavaIO(String url) throws MalformedURLException, IOException
	{


	InputStream inputStream = null;

	BufferedReader bufferedReader = null;
//String r;
	
	StringBuilder stringBuilder = new StringBuilder();
		int cp;
	inputStream = new URL(url).openStream();

	bufferedReader = new BufferedReader(new InputStreamReader(inputStream,Charset.forName("UTF-8")));
	
	while((cp=bufferedReader.read())!=-1){
		stringBuilder.append((char)cp);
	}
	//r=stringBuilder;

	return stringBuilder.toString();

	}

public String readData(Reader reader ) throws IOException {
	StringBuilder stringBuilder = new StringBuilder();
	int cp;
	while((cp=reader.read())!=-1){
		stringBuilder.append((char)cp);
	}
	return stringBuilder.toString();	
	}
	
		public void closeResource(AutoCloseable closable )

	{

	try{

	if(closable!=null)

	{closable.close();

	System.out.println("closed");

	}

	}

	catch(Exception e){

	e.printStackTrace(System.err);

	}


	}



	}

