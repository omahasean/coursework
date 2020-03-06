package com.techelevator.controller;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.model.Favorite;

@Controller
@SessionAttributes("favorites")

@RequestMapping("/FavoriteThings")
public class FavoriteThingsController {

	@RequestMapping(path = "/Page1", method = RequestMethod.GET)
	public String getFirstPage() {

		
		return "page1";
	}

	@RequestMapping(path = "/PagePost1", method = RequestMethod.POST)
	public String saveFirstPage(@RequestParam String favoriteColor, ModelMap map) {
		
		Favorite favorites = new Favorite();
		
		if (!map.containsAttribute("favorites")) {
			HashMap<String, Favorite> cartMap = new HashMap<String, Favorite>();
			map.addAttribute("favorites", favorites);
		}
		
		favorites.setColor(favoriteColor);
		
		
		return "redirect:/page2";
	}
	
	@RequestMapping(path = "/Page2", method = RequestMethod.GET)
	public String getSecondPage() {
		
		
		
		return "page2";
	}

	@RequestMapping(path = "/PagePost2", method = RequestMethod.POST)
	public String saveSecondPage(@RequestParam String favoriteFood, ModelMap map) {
		
		if (!map.containsAttribute("favorites")) {
			Favorite favorites = new Favorite();
			HashMap<String, Favorite> cartMap = new HashMap<String, Favorite>();
			map.addAttribute("favorites", favorites);
		}
		
		
		Favorite favorites = (Favorite) map.get("favorites");
		favorites.setFood(favoriteFood);

		
		return "redirect:/page3";
	}
	@RequestMapping(path = "/Page3", method = RequestMethod.GET)
	public String getThirdPage() {
		
		
		
		return "page3";
	}

	@RequestMapping(path = "/PagePost3", method = RequestMethod.POST)
	public String saveThirdPage(@RequestParam String favoriteSeason, ModelMap map) {
		
		if (!map.containsAttribute("favorites")) {
			Favorite favorites = new Favorite();
			HashMap<String, Favorite> cartMap = new HashMap<String, Favorite>();
			map.addAttribute("favorites", favorites);
		}
		
		
		Favorite favorites = (Favorite) map.get("favorites");
		favorites.setSeason(favoriteSeason);
		
		
		return "redirect:/results";
	}
	@RequestMapping(path = "/results", method = RequestMethod.GET)
	public String getResultsPage(HttpServletRequest request, ModelMap map) {
		
		Favorite favorites = (Favorite) map.get("favorites");
		
		request.setAttribute("favoriteFood", favorites.getFood());
		request.setAttribute("favoriteColor", favorites.getColor());
		request.setAttribute("favoriteSeason", favorites.getSeason());
		
		return "Results";
	}
	
	
}
