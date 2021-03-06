package org.lostinbrittany.sparkjava.beers;

import static spark.Spark.get;

import java.util.List;

import org.lostinbrittany.sparkjava.beers.model.Beer;

import com.google.gson.Gson;


public class BeersAPI {
	
    public static void main(String[] args) {
        get("/BeerList", (request, response) -> {
        	List<Beer> beerList = Beer.getBeers();
        	Gson gson = new Gson();
        	String json = gson.toJson(beerList);  
        	return json;
        });
    }
}